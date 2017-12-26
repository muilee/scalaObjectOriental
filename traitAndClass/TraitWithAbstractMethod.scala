package traitAndClass

object TraitWithAbstractMethod extends App {
    case class Person(var id:Int, var name:String, var age:Int)

    trait PersonDAO{
        def add(p:Person)
        def update(p:Person)
        def delete(id:Int)
        def findById(id:Int)
    }

    class PersonDAOImpl extends PersonDAO{
        override def add(p: Person): Unit = {
            println("Invoking add Method....adding" + p)
        }

        override def update(p: Person): Unit = {
            println("Invoking update Method....updating" + p)
        }

        override def delete(id: Int): Unit = {
            println("Invoking delete Method....id=" + id)
        }

        override def findById(id: Int): Unit = {
            println("Invoking findById Method....id=" + id)
            Person(1, "John", 18)
        }
    }

    val p:PersonDAO = new PersonDAOImpl
    p.add(Person(1, "John", 18))
}
