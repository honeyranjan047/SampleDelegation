class FileDownloader(private  val fileName: String ) : Downloader
{
    override fun downloading() {
        println("$fileName is downloaded")
    }

}
class FilePlayer(private val fileName: String): Player
{
    override fun playing() {
        println("$fileName is playing")
    }

}


class Downloader1(
    val downloader: Downloader,
    val player: Player
) : Downloader, Player
{
    override fun downloading() {
        downloader.downloading()
    }

    override fun playing() {
        player.playing()
    }

}

fun main(args: Array<String>) {
    val fileName: String = "Knight and Day.mkv"
    val obj = Downloader1(FileDownloader(fileName), FilePlayer(fileName))
    obj.downloading()
    obj.playing()
}