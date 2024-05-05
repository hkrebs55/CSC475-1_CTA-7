package com.example.csc475_1_cta_7

class UnitConverterUtil {
    companion object {
        fun tsToTb(ts: Double) : Double {
            return ts / 3
        }

        fun tsToCups(teaspoons: Double): Double {
            return teaspoons / 48.0
        }

        fun tbToTs(tablespoons: Double): Double {
            return tablespoons * 3.0
        }

        fun tbToCups(tablespoons: Double): Double {
            return tablespoons / 16.0
        }

        fun cupsToTs(cups: Double): Double {
            return cups * 48.0
        }

        fun cupsToTb(cups: Double): Double {
            return cups * 16.0
        }

        fun tablespoonsToFluidOunces(tablespoons: Double): Double {
            return tablespoons * 0.5
        }

        fun tablespoonsToCups(tablespoons: Double): Double {
            return tablespoons * 0.0625
        }

        fun tablespoonsToPints(tablespoons: Double): Double {
            return tablespoons * 0.03125
        }

        fun tablespoonsToQuarts(tablespoons: Double): Double {
            return tablespoons * 0.015625
        }

        fun tablespoonsToGallons(tablespoons: Double): Double {
            return tablespoons * 0.00390625
        }

        fun fluidOuncesToTablespoons(fluidOunces: Double): Double {
            return fluidOunces * 2
        }

        fun fluidOuncesToCups(fluidOunces: Double): Double {
            return fluidOunces * 0.125
        }

        fun fluidOuncesToPints(fluidOunces: Double): Double {
            return fluidOunces * 0.0625
        }

        fun fluidOuncesToQuarts(fluidOunces: Double): Double {
            return fluidOunces * 0.03125
        }

        fun fluidOuncesToGallons(fluidOunces: Double): Double {
            return fluidOunces * 0.0078125
        }

        fun cupsToTablespoons(cups: Double): Double {
            return cups * 16.0
        }

        fun cupsToFluidOunces(cups: Double): Double {
            return cups * 8
        }

        fun cupsToPints(cups: Double): Double {
            return cups * 0.5
        }

        fun cupsToQuarts(cups: Double): Double {
            return cups * 0.25
        }

        fun cupsToGallons(cups: Double): Double {
            return cups * 0.0625
        }

        fun pintsToTablespoons(pints: Double): Double {
            return pints * 32.0
        }

        fun pintsToFluidOunces(pints: Double): Double {
            return pints * 16.0
        }

        fun pintsToCups(pints: Double): Double {
            return pints * 2
        }

        fun pintsToQuarts(pints: Double): Double {
            return pints * 0.5
        }

        fun pintsToGallons(pints: Double): Double {
            return pints * 0.125
        }

        fun quartsToTablespoons(quarts: Double): Double {
            return quarts * 64.0
        }

        fun quartsToFluidOunces(quarts: Double): Double {
            return quarts * 32.0
        }

        fun quartsToCups(quarts: Double): Double {
            return quarts * 4.0
        }

        fun quartsToPints(quarts: Double): Double {
            return quarts * 2
        }

        fun quartsToGallons(quarts: Double): Double {
            return quarts * 0.25
        }

        fun gallonsToTablespoons(gallons: Double): Double {
            return gallons * 256.0
        }

        fun gallonsToFluidOunces(gallons: Double): Double {
            return gallons * 128.0
        }

        fun gallonsToCups(gallons: Double): Double {
            return gallons * 16.0
        }

        fun gallonsToPints(gallons: Double): Double {
            return gallons * 8.0
        }

        fun gallonsToQuarts(gallons: Double): Double {
            return gallons * 4
        }
    }
}