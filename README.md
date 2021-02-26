# Dishwasher Coding Challenge
Welcome to the Dishwasher Coding Challenge! You have 15 minutes to write a program that follows the requirements below.

If you record your attempt, feel free to make a PR to add your solution. Ensure that you link the video in your PR. Please put it under `solutions/<yourusername>/`.

## The Language
As long as you are able to create something to represent an object and an enum, and your language has iterators, your programming language is allowed!

## The Challenge
In 15 minutes, write a program that accurately represents the act of putting away dishes from a dishwasher. There must be three classes: a *dish*, a *dishwasher*, and a *human*. There is one enum: a *dishtype*. You must define at least 10 different dish types to be able to use in your dishwasher.

The dish class must maintain two states: clean and dirty. It must also be able to track is location as a string, the default being "sink." All dishes must start off dirty.

The dishwasher class must have three methods: One to load the dishwasher, one to run the dishwasher, and one to unload the dishwasher. When loading and unloading, the dishwasher does not do the work - the human does. This means you should not modify the internal data in those methods, and instead bring the dishwasher to the human. Also ensure to update the location of the dishes to be in the dishwasher. When running, ensure to actually clean all of the dishes. The dishwasher must be iterable.

The human class must be able to determine where to put the dishes away. There are four different locations: "lower-left", "lower-right", "upper-left", "upper-right." All humans have a name. The human should have two methods which loads and unloads the dishwasher by iterating through all dishes in the dishwasher.

In the end, output all dishes. Your output must be similar to the following:
```
Dish: big-plate, clean, lower-left
Dish: small-plate, clean, lower-left
Dish: big-bowl, clean, lower-left
Dish: small-bowl, clean, lower-left
Dish: big-cup, clean, lower-right
Dish: small-cup, clean, lower-right
Dish: spoon, clean, upper-left
Dish: fork, clean, upper-left
Dish: knife, clean, upper-right
Dish: steak-knife, clean, upper-right
```
The most important things are all dishes are clean and some dishes are in different locations depending on their type.