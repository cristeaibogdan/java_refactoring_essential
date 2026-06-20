package com.codemanship.refactoring.legacycode;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;


class ShippingCalculatorTest {

	OrderRepository orderRepositoryMock = mock(OrderRepository.class);
	ShippingCalculator underTest = new ShippingCalculator(orderRepositoryMock);

	@Test
	void should_handleSTANDARDShipping() throws IOException, InterruptedException {
		//GIVEN
		Order order = new Order(
				1001,
				"STANDARD",
				5,
				120,
				false
		);
		given(orderRepositoryMock.loadOrder(1001)).willReturn(order);

		//WHEN
		double result = underTest.calculateShipping(1001);

		//THEN
		assertThat(result).isEqualTo(2.5);
	}

	@Test
	void should_handleEXPRESSShipping() throws IOException, InterruptedException {
		// GIVEN
		Order order = new Order(
				1002,
				"EXPRESS",
				8.5,
				300,
				true
		);
		given(orderRepositoryMock.loadOrder(1002)).willReturn(order);

		// WHEN
		double result = underTest.calculateShipping(1002);

		// THEN
		assertThat(result).isEqualTo(36.8);
	}

	@Test
	void should_handleOVERNIGHTShipping() throws IOException, InterruptedException {
		// GIVEN
		Order order = new Order(
				1003,
				"OVERNIGHT",
				2,
				50,
				false
		);
		given(orderRepositoryMock.loadOrder(1003)).willReturn(order);

		// WHEN
		double result = underTest.calculateShipping(1003);

		// THEN
		assertThat(result).isEqualTo(27.4);
	}

	@Test
	void should_handleINTERNATIONALShipping() throws IOException, InterruptedException {
		// GIVEN
		Order order = new Order(
				1004,
				"INTERNATIONAL",
				2,
				50,
				false
		);
		given(orderRepositoryMock.loadOrder(1004)).willReturn(order);

		// WHEN
		double result = underTest.calculateShipping(1004);

		// THEN
		assertThat(result).isEqualTo(3);
	}

}