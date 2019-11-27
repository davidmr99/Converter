package paquete;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ventana extends JFrame implements ActionListener{
	private JTextField dineroaconvertir,confdinconv;
	private JFrame frame1;
	private JButton btdinero1,btdinero2,convdin,config,confaplicar,salir,swaperaccept,convert;
	private JLabel dindone,confdinconvl,simbolofinal,aux,arrow,result;
	private JComboBox<String> swaper,languages,hour,ampm,uso,uso2,offsetuso,offsetuso2,offsetusosymbol,offsetusosymbol2;
	int var=1;
	double confdinconvvar=1.32425;
	Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/conversoricon.png"));
	public ventana()
	{
		System.out.println(" Most of the information printed in the console is just to test stuff... don't pay much attention to it :P ");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		
		setIconImage(icon);

		//IMAGEN DEL JCOMBOBOX//
		
		//CONFIGURACIÓN
		
		
		frame1=new JFrame(" Configuration ");
		frame1.setBounds(200,200,300,300);
		frame1.setVisible(false);
		
		confdinconvl=new JLabel(" Variation €/$ ");
		confdinconvl.setBounds(120,10,100,30);
		frame1.add(confdinconvl);
		confdinconvl.setVisible(true);
		
		String confdinconvvar1 = Double.toString(confdinconvvar);
		confdinconv=new JTextField(confdinconvvar1);
		confdinconv.setBounds(10,10,100,30);
		frame1.add(confdinconv);
		confdinconv.setVisible(true);
		
		confaplicar=new JButton(" Aply ");
		confaplicar.setBounds(170,215,100,30);
		confaplicar.addActionListener(this);
		frame1.add(confaplicar);
		confaplicar.setVisible(true);
		
		Object english=" English ";
		Object spanish=" Spanish ";
		languages=new JComboBox<String>();
		languages.setBounds(10,50,100,30);
		frame1.add(languages);
		languages.addItem((String) english);
		languages.addItem((String) spanish);
		languages.setOpaque(false);
		languages.setVisible(true);
		
		aux=new JLabel("");
		aux.setBounds(300,300,10,10);
		frame1.add(aux);
		aux.setVisible(true);
		
        //CONVERSOR DINERO
		
		btdinero1=new JButton(" $ => € ");
		btdinero1.setBounds(135,50,100,30);
		btdinero1.addActionListener(this);
		add(btdinero1);
		btdinero1.setVisible(true);
		
		btdinero2=new JButton(" € => $ ");
		btdinero2.setBounds(135,50,100,30);
		btdinero2.addActionListener(this);
		add(btdinero2);
		btdinero2.setVisible(false);
		
        convdin=new JButton(" Convert! ");
		convdin.setBounds(85,100,100,30);
        convdin.addActionListener(this);
        add(convdin);
        convdin.setVisible(true);
        
        dindone=new JLabel(" Result: ");
        dindone.setBounds(15,145,200,30);
        add(dindone);
        dindone.setVisible(true);
		
		dineroaconvertir=new JTextField("");     
        dineroaconvertir.setBounds(20,50,80,30);
		add(dineroaconvertir);
		dineroaconvertir.setVisible(true);
		
		simbolofinal = new JLabel("");
		simbolofinal.setBounds(110,50,10,30);
		add(simbolofinal);
		simbolofinal.setVisible(true);
        
		//CONVERSOR TIEMPO
		
		hour = new JComboBox<String>();
		hour.setBounds(10,10,90,30);
		hour.addItem("12");
		hour.addItem("11");
		hour.addItem("10");
		hour.addItem("9");
		hour.addItem("8");
		hour.addItem("7");
		hour.addItem("6");
		hour.addItem("5");
		hour.addItem("4");
		hour.addItem("3");
		hour.addItem("2");
		hour.addItem("1");
		add(hour);
		hour.setVisible(false);
		
		ampm = new JComboBox<String>();
		ampm.setBounds(110,10,50,30);
		ampm.addItem("Am");
		ampm.addItem("Pm");
		add(ampm);
		ampm.setVisible(false);
		
		uso = new JComboBox<String>();
		uso.setBounds(170,10,60,30);
		uso.addItem("GMT");
		uso.addItem("EST");
		uso.addItem("AEST");
		add(uso);
		uso.setVisible(false);
		
		offsetusosymbol = new JComboBox<String>();
		offsetusosymbol.setBounds(240,10,40,30);
		offsetusosymbol.addItem("+");
		offsetusosymbol.addItem("-");
		add(offsetusosymbol);
		offsetusosymbol.setVisible(false);
		
		offsetuso = new JComboBox<String>();
		offsetuso.setBounds(290,10,40,30);
		offsetuso.addItem("12");
		offsetuso.addItem("11");
		offsetuso.addItem("10");
		offsetuso.addItem("9");
		offsetuso.addItem("8");
		offsetuso.addItem("7");
		offsetuso.addItem("6");
		offsetuso.addItem("5");
		offsetuso.addItem("4");
		offsetuso.addItem("3");
		offsetuso.addItem("2");
		offsetuso.addItem("1");
		offsetuso.addItem("0");
		add(offsetuso);
		offsetuso.setVisible(false);
		
		arrow = new JLabel("=>");
		arrow.setBounds(340,10,30,30);
		add(arrow);
		arrow.setVisible(false);
		
		uso2 = new JComboBox<String>();
		uso2.setBounds(360,10,60,30);
		uso2.addItem("EST");
		uso2.addItem("GMT");
		uso2.addItem("AEST");
		add(uso2);
		uso2.setVisible(false);
		
		offsetusosymbol2 = new JComboBox<String>();
		offsetusosymbol2.setBounds(430,10,40,30);
		offsetusosymbol2.addItem("+");
		offsetusosymbol2.addItem("-");
		add(offsetusosymbol2);
		offsetusosymbol2.setVisible(false);
		
		offsetuso2 = new JComboBox<String>();
		offsetuso2.setBounds(480,10,40,30);
		offsetuso2.addItem("12");
		offsetuso2.addItem("11");
		offsetuso2.addItem("10");
		offsetuso2.addItem("9");
		offsetuso2.addItem("8");
		offsetuso2.addItem("7");
		offsetuso2.addItem("6");
		offsetuso2.addItem("5");
		offsetuso2.addItem("4");
		offsetuso2.addItem("3");
		offsetuso2.addItem("2");
		offsetuso2.addItem("1");
		offsetuso2.addItem("0");
		add(offsetuso2);
		offsetuso2.setVisible(false);
		
		convert = new JButton("Convert");
		convert.setBounds(10,50,90,30);
		convert.addActionListener(this);
		add(convert);
		convert.setVisible(false);

		result= new JLabel("Result:");
		result.setBounds(10,90,100,30);
		add(result);
		result.setVisible(false);
		
		//CONVERSOR (EN GENERAL)
		
        config=new JButton(" Configuration ");
        config.setBounds(130,190,120,30);
        config.addActionListener(this);
        add(config);
        config.setVisible(true);
        
		salir=new JButton(" Exit");
		salir.setBounds(130,250,120,30);
		salir.addActionListener(this);
		add(salir);
		salir.setVisible(true);
		
		Object moneyconverter=" Money Converter ";
		Object timeconverter=" Time Converter ";
		swaper = new JComboBox<String>();
		swaper.setBounds(5,190,120,30);
		add(swaper);
		swaper.addItem((String) moneyconverter);
		swaper.addItem((String) timeconverter);
		
		
		swaperaccept=new JButton(" Accept swap ");
		swaperaccept.setBounds(5,250,120,30);
		add(swaperaccept);
		swaperaccept.addActionListener(this);
		swaperaccept.setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		Object moneyconverter=" Money Converter ";
		Object timeconverter=" Time Converter ";

		Object english=" English ";
		Object spanish=" Spanish ";
		
		if(swaper.getSelectedItem()==" Money Converter ")
		{
			System.out.println("pelele");
		}
		if(e.getSource()==swaperaccept){
			if(swaper.getSelectedItem()==moneyconverter)
			{
				System.out.println(" Changing to Money converter ");
				////
				btdinero1.setVisible(true);
				btdinero2.setVisible(false);
				convdin.setVisible(true);
				dindone.setVisible(true);
				dineroaconvertir.setVisible(true);
				setTitle(" Money Converter ");
				setBounds(200,200,260,345);
				swaper.setBounds(5,190,120,30);
				swaperaccept.setBounds(5,250,120,30);
				salir.setBounds(130,250,120,30);
				config.setBounds(130,190,120,30);
				simbolofinal.setVisible(true);
				if(languages.getSelectedItem()==spanish)
				{
					setTitle(" Conversor de Dinero ");
				}else if(languages.getSelectedItem()==english)
				{
					setTitle(" Money Converter ");
				}
				////
				
				////
				hour.setVisible(false);
				ampm.setVisible(false);
				uso.setVisible(false);
				uso2.setVisible(false);
				offsetuso.setVisible(false);
				offsetuso2.setVisible(false);
				offsetusosymbol.setVisible(false);
				offsetusosymbol2.setVisible(false);
				arrow.setVisible(false);
				result.setVisible(false);
				convert.setVisible(false);
				////
			}else if(swaper.getSelectedItem()==timeconverter)
			{
				System.out.println(" Changing to Time Converter ");
				////
				btdinero1.setVisible(false);
				btdinero2.setVisible(false);
				convdin.setVisible(false);
				dindone.setVisible(false);
				dineroaconvertir.setVisible(false);
				setTitle(" Time Converter ");
				setBounds(200,200,535,200);
				swaper.setBounds(10,130,120,30);
				config.setBounds(270,130,120,30);
				swaperaccept.setBounds(140,130,120,30);
				salir.setBounds(400,130,120,30);
				simbolofinal.setVisible(false);
				if(languages.getSelectedItem()==spanish)
				{
					setTitle(" Conversor de Tiempo ");
				}else if(languages.getSelectedItem()==english)
				{
					setTitle(" Time Converter ");
				}
				////
				
				////
				hour.setVisible(true);
				ampm.setVisible(true);
				uso.setVisible(true);
				uso2.setVisible(true);
				offsetuso.setVisible(true);
				offsetuso2.setVisible(true);
				offsetusosymbol.setVisible(true);
				offsetusosymbol2.setVisible(true);
				arrow.setVisible(true);
				result.setVisible(true);
				convert.setVisible(true);
				////
			}
		}
		if (e.getSource()==btdinero1)
		{
			btdinero2.setVisible(true);
			btdinero1.setVisible(false);
			var=0;
		}
		if(e.getSource()==btdinero2)
		{
			btdinero1.setVisible(true);
			btdinero2.setVisible(false);
			var=1;
		}
		if(e.getSource()==convdin&&var==1)
		{
			//$
			String dineroaconvertir2=dineroaconvertir.getText();
			double dineroaconvertir3 = Double.parseDouble(dineroaconvertir2);
			Object languagesspanish=(" Spanish ");
			Object languagesenglish=(" English ");
			if(languages.getSelectedItem()==languagesspanish)
			{
				dindone.setText("Resultado: "+ dineroaconvertir3/confdinconvvar + " € ");
				simbolofinal.setText("$");
				
			}else if(languages.getSelectedItem()==languagesenglish)
			{
				dindone.setText("Result: "+ dineroaconvertir3/confdinconvvar + " € ");
				simbolofinal.setText("$");				
			}
		}
		if(e.getSource()==convdin&&var==0)
		{
			//€
			String dineroaconvertir2=dineroaconvertir.getText();
			double dineroaconvertir3 = Double.parseDouble(dineroaconvertir2);
			Object languagesspanish=(" Spanish ");
			Object languagesenglish=(" English ");
			if(languages.getSelectedItem()==languagesspanish)
			{
				dindone.setText("Resultado: "+ dineroaconvertir3*confdinconvvar + " $ ");
				simbolofinal.setText("€");	
				
			}else if(languages.getSelectedItem()==languagesenglish)
			{
				dindone.setText("Result: "+ dineroaconvertir3*confdinconvvar + " $ ");
				simbolofinal.setText("€");	
				
			}
		}
		if(e.getSource()==config)
		{
			frame1.setVisible(true);
		}
		if(e.getSource()==salir)
		{
			System.exit(0);
		}
		
		//CONFIGURACIÓN
		if(e.getSource()==confaplicar)
		{
			String confdinconv1 = confdinconv.getText();
			double confdinconv2 = Double.parseDouble(confdinconv1);
			confdinconvvar=confdinconv2;
			frame1.setVisible(false);
			if(languages.getSelectedItem()==spanish)
			{
				System.out.println(" Changing to Spanish ");
				////
				if(swaper.getSelectedItem()==" Time Converter ")
				{
					setTitle(" Conversor de Tiempo ");
				}else if(swaper.getSelectedItem()==" Money Converter ")
				{
					setTitle(" Conversor de Dinero ");
				}
				frame1.setTitle(" Configuración ");
				confdinconvl.setText(" Variación €/$ ");
				confaplicar.setText(" Aplicar ");
				convdin.setText(" ¡Convertir! ");
				dindone.setText(" Resultado: ");
				config.setText(" Configuración ");
				salir.setText(" Salir ");
				swaperaccept.setText(" Aceptar cambio ");
				convert.setText("Convertir");
				result.setText("Resultado:");
				////
			}else if(languages.getSelectedItem()==english)
			{
				System.out.println(" Cambiando a Inglés ");
				////
				frame1.setTitle(" Configuration ");
				confdinconvl.setText(" Variation €/$ ");
				confaplicar.setText(" Aply ");
				convdin.setText(" Convert! ");
				dindone.setText(" Result: ");
				config.setText(" Configuration ");
				salir.setText(" Exit ");
				swaperaccept.setText(" Acept swap ");
				convert.setText("Convert");
				result.setText("Result:");
				if(swaper.getSelectedItem()==" Conversor de Tiempo ")
				{
					setTitle(" Time Converter ");
				}else if(swaper.getSelectedItem()==" Conversor de Dinero ")
				{
					setTitle(" Money Converter ");
				}
				////
			}
		}
		
		
		
		
		////CONVERSOR TIEMPO////
		
		
		
		

		int variante=0,variante2=0;
		String ampmstring = null;
		Object hour2 = this.hour.getSelectedItem();
	      int hourint = Integer.parseInt((String)hour2);
	    Object variante3obj = this.offsetuso.getSelectedItem();
	      int variante3 = Integer.parseInt((String)variante3obj);
	    Object variante4obj = this.offsetuso2.getSelectedItem();
	      int variante4 = Integer.parseInt((String)variante4obj);
	    boolean isam = true;
	    int horafinal= 0;
		if(e.getSource()==convert)
		{
			//A GMT//
			if(ampm.getSelectedItem()=="Am")
			{
				isam=true;
			}else if(ampm.getSelectedItem()=="Pm")
			{
				hourint=hourint+12;
				isam=false;
			}
			
			if(uso.getSelectedItem()=="EST")
			{
				variante=-6;
			}else if(uso.getSelectedItem()=="AEST")
			{
				variante=+6;
			}else if(uso.getSelectedItem()=="GMT")
			{
				variante=+0;
			}
			horafinal=hourint+variante;
			System.out.println("GMT: " + horafinal);
			
			//AL USO SELECCIONADO//
			if(uso2.getSelectedItem()=="EST")
			{
				variante2=+6;
			}else if(uso2.getSelectedItem()=="AEST")
			{
				variante2=-6;
			}else if(uso2.getSelectedItem()=="GMT")
			{
				variante2=+0;
			}
			horafinal=horafinal+variante2;
			Object uso2seleccionado=uso2.getSelectedItem();
			String uso2seleccionadostr=uso2seleccionado.toString();
			System.out.println(uso2seleccionadostr + ": " + horafinal);
			
			//DE 24 HORAS A 12 HORAS//
			
			if(horafinal>=13)
			{
				isam=false;
				horafinal=horafinal-12;
			}else if(horafinal==0)
			{
				isam=false;
				horafinal=12;
			}else if(horafinal<=12&&horafinal>=1)
			{
				isam=true;
			}
			
			//OFFSET DEL USO INICIAL//
			
			if(offsetusosymbol.getSelectedItem()=="+")
			{
				variante3 = +variante3;
			}else if(offsetusosymbol.getSelectedItem()=="-")
			{
				variante3 = -variante3;
			}
			
			horafinal=horafinal+variante3;
			
			//DE 24 HORAS A 12 HORAS//
			
			if(horafinal>=13)
			{
				isam=false;
				horafinal=horafinal-12;
			}else if(horafinal==0)
			{
				isam=false;
				horafinal=12;
			}else if(horafinal<=12&&horafinal>=1)
			{
				isam=true;
			}
			
			//OFFSET DEL USO FINAL//
			
			if(offsetusosymbol2.getSelectedItem()=="+")
			{
				variante4 = +variante4;
			}else if(offsetusosymbol2.getSelectedItem()=="-")
			{
				variante4 = -variante4;
			}
			
			horafinal=horafinal+variante4;
			
			//DE 24 HORAS A 12 HORAS//
			
			if(horafinal>=13)
			{
				isam=false;
				horafinal=horafinal-12;
			}else if(horafinal==0)
			{
				isam=false;
				horafinal=12;
			}else if(horafinal<=12&&horafinal>=1)
			{
				isam=true;
			
			}else if(horafinal<=-1&&isam==true)
			{
				horafinal=12-horafinal;
				isam=false;
			}else if(horafinal<=-1&&isam==false)
			{
				horafinal=12-horafinal;
				isam=true;
			}
			
			
			if(isam==true)
			{
				ampmstring=" Am";
			}else if(isam==false)
			{
				ampmstring=" Pm";
			}
			
			
			if(uso.getSelectedItem()==uso2.getSelectedItem()&&offsetuso.getSelectedItem()==offsetuso2.getSelectedItem()&&offsetuso.getSelectedItem()==offsetuso2.getSelectedItem())
			{
				int hourint2 = Integer.parseInt((String)hour2);
				horafinal=hourint2;
				Object ampm2 = this.ampm.getSelectedItem();
				String ampmstring2 = ampm2.toString();
				ampmstring=ampmstring2;
			}
			
			if(languages.getSelectedItem()==spanish)
			{
				result.setText("Resultado: " + horafinal + ampmstring);
			}else if(languages.getSelectedItem()==english)
			{
				result.setText("Result: " + horafinal + ampmstring);
			}
			
		}
	}

	public static void main(String[] args) {
		ventana v1 = new ventana();
		v1.setBounds(200,200,260,345);
		v1.setVisible(true);
		v1.setTitle(" Money Converter ");
		v1.setResizable(false);
	}
}
