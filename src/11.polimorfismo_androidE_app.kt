class LoginActividad: Actividad() {
    var usuario: String = "algoritmo"
    var password: String = "dale_a_me_gusta"
    override fun alCrear() {
        super.alCrear()
        println("LoginActividad: Al crear Login")
        preferencias.put("usuario", usuario)
        preferencias.put("password", password)
        println("LoginActividad: credenciales guardadas")
    }
}
class HomeActividad: Actividad() {
    override fun alIniciar() {
        super.alIniciar()
        println("HomeActividad: Al iniciar la Home")
    }
}
class SuscribeteActividad: Actividad() {
    val canalYoutube = "https://www.youtube.com/channel/UC98YVr3l4PPY42p5p9Palzw"
    override fun alCrear() {
        super.alCrear()
        println("SuscribeteActividad: Al crear Suscribete")
    }
}
fun main() {
    val miAndroideApp = AndroideApp()
    miAndroideApp.manifiesto.pantallas.add(LoginActividad())
    miAndroideApp.manifiesto.pantallas.add(HomeActividad())
    miAndroideApp.manifiesto.pantallas.add(SuscribeteActividad())
    miAndroideApp.iniciarApp()
}