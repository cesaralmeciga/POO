package p.o.o;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class prestamo {
	
	static String N_Empleado;
	String N_Empresa;
	String N_Banco;
	float mPrestamo;
	float iMensual;
	float tPagar;
	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		prestamo empleado = new prestamo();
		empleado.AsignarNombre(N_Empleado);
		System.out.println(empleado.ObtenerNombre());
	}
	
	
	public prestamo(String N_Empleado, String N_Empresa, String N_Banco, float mPrestamo, float iMensual, float tPagar)
	{
		this.N_Empleado = N_Empleado;
		this.N_Empresa = N_Empresa;
		this.N_Banco = N_Banco;
		this.mPrestamo = mPrestamo;
		this.iMensual = iMensual;
		this.tPagar = tPagar;
	}
	
	public prestamo() {}
	
	public void AsignarNombre(String Nombre) throws IOException
	{
		System.out.println("Ingrese su nombre :");
		Nombre = br.readLine();
		N_Empleado = Nombre;
		
	}
	
	public String ObtenerNombre()
	{
		return N_Empleado;
	}
	
	public void AsignarEmpresa(String Empresa) throws IOException
	{
		System.out.println("Ingrese el nombre de la Empresa :");
		Empresa = br.readLine();
		N_Empresa = Empresa;
	}
	
	public String ObtenerEmpresa()
	{
		return N_Empresa;
	}
	
	public void AsignarBanco(String Banco) throws IOException
	{
		System.out.println("Ingrese el nombre del Banco :");
		Banco = br.readLine();
		N_Banco = Banco;
	}
	
	public String ObtenerBanco()
	{
		return N_Banco;
	}
	
	public void AsignarPrestamo(float Prestamo) throws NumberFormatException, IOException
	{
		System.out.println("Ingrese el dinero que necesita :");
		Prestamo = Integer.parseInt(br.readLine());
		mPrestamo = Prestamo;
	}
	
	public float ObtenerPrestamo()
	{
		return mPrestamo;
	}
	
	public void AsignarIntereses(float Intereses) throws NumberFormatException, IOException
	{
		System.out.println("ingrese el tiempo del prestamo (meses)");
		Intereses = Float.parseFloat(br.readLine());
		
		
	}
	

}
