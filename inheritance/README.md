# Inheritance
This package implements interfaces and inheritance for reviewable businesses.

## Reviewable Interface
Provides an interface for a reviewable business

## Business Class
Representation of a reviewable business

### Properties
name, description, average number of stars, price category ($$$), list of reviews

## Restaurant Class
Representation of a reviewable restaurant. Subclass of Business class.

### Properties
* All inherited properties

### Methods
* All inherited methods

## Shop Class
Representation of a reviewable shop. Subclass of Business class.

### Properties
* All inherited properties

### Methods
* All inherited methods

## Theater Class
Representation of a reviewable shop. Subclass of Business class.

### Properties
* All inherited properties
* List of movies

### Methods
* All inherited methods
* addMovie, removeMovie

## Review Class
Representation of a review for any business on a rating application like Yelp

### Properties
* Review body
* Review author
* Number of stars