package patternMaching

object PatternMatchingAndClass extends App {
    sealed trait DeployMessage

    case class RegisterWorker(id: String, host: String, port: String) extends DeployMessage
    case class UnRegisterWorker(id: String, host: String, port: String) extends DeployMessage
    case class Heartbeat(workId: String) extends DeployMessage
    case object RequestWorkerState extends DeployMessage

    def handleMessage(msg: DeployMessage) = msg match {
        case RegisterWorker(id, host, port) => s"The worker $id is registering on $host:$port"
        case UnRegisterWorker(id, host, port) => s"The worker $id is unregistering on $host:$port"
        case Heartbeat(id) => s"The worker $id is sending heartbeat"
        case RequestWorkerState => "Request Worker State"
    }

    val msgRegister = RegisterWorker("251515", "192.168.10.1", "8888")
    println(handleMessage(msgRegister))
    println(handleMessage(RequestWorkerState))
}
