1. Singleton — Points to Remember

* Ensures only one instance of a class
* Provides a global access point
* Used for shared, application-wide state
* Constructor is private
* Instance is usually static
* 
Be careful with:
    thread safety
    overuse (can become global state)
Common examples:
    ConfigManager
    Logger

2. Factory 

* Encapsulates object creation logic
* Client does not use new
* Client depends on abstraction, not concrete classes
* Helps follow OCP
* Central place to control object creation
* 
Good when:
   multiple implementations exist
   creation logic may change 

3. Strategy

* Encapsulates different behaviors / algorithms
* Behavior can be changed at runtime
* Uses composition, not inheritance
* Context delegates work to strategy
* Eliminates large if-else blocks
* Each strategy has one responsibility

4. Observer

* Defines one-to-many dependency
* When subject changes, all observers are notified
* Subject does not know concrete observers
* Observers can be added/removed dynamically
* Promotes loose coupling
* 
Good for:
    notifications
    event-driven systems
