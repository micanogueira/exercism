"""Functions for implementing the currency calculator."""


def exchange_money(budget, exchange_rate):
    """This function should return the value of the exchanged currency.

    :param budget: float - amount of money you are planning to exchange.
    :param exchange_rate: float - unit value of the foreign currency.
    :return: float - exchanged value of the foreign currency you can receive.
    """

    return budget / exchange_rate


def get_change(budget, exchanging_value):
    """This function should return the amount of money that is left from the budget.

    :param budget: float - amount of money you own.
    :param exchanging_value: float - amount of your money you want to exchange now.
    :return: float - amount left of your starting currency after exchanging.
    """

    return budget - exchanging_value


def get_value_of_bills(denomination, number_of_bills):
    """This function should return only the total value of the bills
    (excluding fractional amounts) the booth would give back.

    :param denomination: int - the value of a bill.
    :param number_of_bills: int - total number of bills.
    :return: int - calculated value of the bills.
    """

    return denomination * number_of_bills


def get_number_of_bills(amount, denomination):
    """This function should return the number of currency bills
    that you can receive within the given amount.

    :param amount: float - the total starting value.
    :param denomination: int - the value of a single bill.
    :return: int - number of bills that can be obtained from the amount.
    """

    return amount // denomination


def get_leftover_of_bills(amount, denomination):
    """This function should return the leftover amount that cannot be returned
     from your starting amount given the denomination of bills.

    :param amount: float - the total starting value.
    :param denomination: int - the value of a single bill.
    :return: float - the amount that is "leftover", given the current denomination.
    """

    return amount % denomination


def exchangeable_value(budget, exchange_rate, spread, denomination):
    """This function should return the maximum value of the new currency
    after calculating the exchange rate plus the spread.

    :param budget: float - the amount of your money you are planning to exchange.
    :param exchange_rate: float - the unit value of the foreign currency.
    :param spread: int - percentage that is taken as an exchange fee.
    :param denomination: int - the value of a single bill.
    :return: int - maximum value you can get.
    """

    actual_exchange_rate = spread / 100 * exchange_rate + exchange_rate
    number_of_bills = get_number_of_bills(exchange_money(budget, actual_exchange_rate), denomination)
    return get_value_of_bills(denomination, number_of_bills)
