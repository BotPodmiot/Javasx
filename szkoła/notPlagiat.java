
    import java.awt.Button;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.LayoutManager;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.Random;

public class notPlagiat extends Frame implements WindowListener, MouseMotionListener, ActionListener {
	Random rand = new Random();

	Point pointer = new Point(0, 0);

	String gameVer = "1.6";

	Font font = new Font("SansSerif", 0, 18);

	boolean gameStarted = false;

	boolean fabula = false;

	boolean gameVeryDev = false;

	boolean snapshot = false;

	String gameUser = "Player" + this.rand.nextInt(9999);

	int height = 225;

	int tlenLvl = 100;

	int healLvl = 79;

	int foodLvl = 74;

	int waterLvl = 83;

	int progressLvl = 0;

	int licznikStat = 0;

	boolean dead = false;

	int coin = 50;

	int mouseX = 0;

	int mouseY = 0;

	boolean inventoryActive = false;

	boolean underWater = false;

	int biome = 0;

	int compX = 0;

	int compY = 0;

	int sunAnim = 200;

	int timer = 0;

	Button jedz;

	Button pij;

	Button lecz;

	Button inventory;

	Button closeInventory;

	Button biomeE;

	Button jezioro;

	Button startGame;

	Button exitGame;

	Button option;

	Cursor default_cur = new Cursor(11);

	Cursor hand = new Cursor(12);

	Cursor normal_cur = new Cursor(0);

	Button acceptHistory;

	int infection = 0;

	boolean infected = false;

	int infDmg = 0;

	String invHB1 = "pusty";

	String invHB2 = "pusty";

	String invHB3 = "pusty";

	String invHB4 = "pusty";

	String invHB5 = "pusty";

	String invHB6 = "pusty";

	String invHB7 = "pusty";

	String invHB8 = "pusty";

	String invHB9 = "pusty";

	String invHB10 = "pusty";

	int invHB1c = 2;

	int invHB2c = 4;

	int invHB3c = 0;

	int invHB4c = 15;

	int invHB5c = 0;

	int invHB6c = 0;

	int invHB7c = 0;

	int invHB8c = 0;

	int invHB9c = 0;

	int invHB10c = 0;

	int zxc;

	public void paint(Graphics gDC) {
		gDC.setFont(this.font);
		if (this.fabula) {
			gDC.drawString("Jest 30 grudnia 2256 roku", 50, 50);
			gDC.drawString("Z amerykalabolatorium wydostaje siwirus zombie", 50, 75);
			gDC.drawString("Jedynym ratunkiem jest budowa rakiety, ucieczka w kosmos i zniszczenie planety", 50, 100);
			gDC.drawString("Rzwybiera 500 osktwylecw kosmos", 50, 125);
			gDC.drawString("Jednz nich jestety", 50, 150);
			gDC.drawString("Po miesistatek spo23BW4E72 wylatuje", 50, 175);
			gDC.drawString("20 dni pprzychodzi wiadomoplaneta Ziemia jest zniszczona", 50, 200);
			gDC.drawString("Nagle w statek 23BW4E72 uderza laser nieznanego pochodzenia", 50, 225);
			gDC.drawString("Wszyscy zostali ewakuowani do kapsuratunkowych", 50, 250);
			gDC.drawString("Musisz prze", 50, 275);
			gDC.drawString("Powodzenia", 50, 300);
		}
		if (this.gameStarted) {
			this.pointer.move(this.compX, this.compY);
			modLoader();
			this.acceptHistory.setVisible(false);
			if (!this.inventoryActive)
				setCursor(this.default_cur);
			if (!this.dead) {
				if (this.biome == 0) {
					gDC.setColor(Color.CYAN);
					setBackground(Color.GREEN);
					this.tlenLvl = 100;
					this.underWater = false;
				}
				if (this.biome == 1) {
					gDC.setColor(Color.CYAN);
					setBackground(Color.CYAN);
					this.underWater = true;
				}
				gDC.fillRect(0, 0, 1300, this.height);
				gDC.setColor(Color.BLACK);
				if (this.biome == 0) {
					gDC.setColor(Color.MAGENTA);
					gDC.fillRect(this.compX + 600, this.compY + 20, 100, 100);
					if (this.pointer.x > 0 && this.pointer.x < 54 && this.pointer.y > 258 && this.pointer.y < 358) {
						gDC.setColor(Color.BLACK);
						gDC.drawString("KARMAZYNOWE PUDE", 540, 410);
					}
					gDC.setColor(Color.YELLOW);
					gDC.fillOval(this.compX - 100, this.compY - this.sunAnim, 100, 100);
					gDC.setColor(Color.ORANGE);
					gDC.fillRect(this.compX - 450, this.compY - 100, 50, 100);
					gDC.setColor(Color.GREEN);
					gDC.fillOval(this.compX - 500, this.compY - 225, 150, 150);
					gDC.setColor(Color.ORANGE);
					gDC.fillRect(this.compX - 700, this.compY - 100, 50, 100);
					gDC.setColor(Color.GREEN);
					gDC.fillOval(this.compX - 750, this.compY - 225, 150, 150);
					gDC.setColor(Color.ORANGE);
					gDC.fillRect(this.compX - 950, this.compY - 100, 50, 100);
					gDC.setColor(Color.GREEN);
					gDC.fillOval(this.compX - 1000, this.compY - 225, 150, 150);
					gDC.setColor(Color.ORANGE);
					gDC.fillRect(this.compX - 1200, this.compY - 100, 50, 100);
					gDC.setColor(Color.GREEN);
					gDC.fillOval(this.compX - 1250, this.compY - 225, 150, 150);
					gDC.setColor(Color.ORANGE);
					gDC.fillRect(this.compX - 1450, this.compY - 100, 50, 100);
					gDC.setColor(Color.GREEN);
					gDC.fillOval(this.compX - 1500, this.compY - 225, 150, 150);
					gDC.setColor(Color.CYAN);
					gDC.fillOval(this.compX - 340, this.compY + 10, 340, 120);
					if (this.pointer.x > 665 && this.pointer.x < 975 && this.pointer.y > 259 && this.pointer.y < 359) {
						gDC.setColor(Color.BLACK);
						gDC.drawString("JEZIORO", 610, 410);
					}
				}
				if (!this.inventoryActive) {
					gDC.setColor(Color.BLACK);
					gDC.drawOval(635, 360, 30, 30);
					gDC.drawLine(645, 375, 655, 375);
					gDC.drawLine(650, 370, 650, 380);
					if (this.snapshot) {
						gDC.setColor(Color.RED);
						gDC.drawString("SNAPSHOT", 600, 430);
					}
				}
				gDC.setColor(Color.WHITE);
				gDC.drawRect(50, 50, 400, 20);
				gDC.fillRect(50, 50, this.tlenLvl * 4, 20);
				gDC.setColor(Color.RED);
				gDC.drawRect(50, 80, 400, 20);
				gDC.fillRect(50, 80, this.healLvl * 4, 20);
				gDC.setColor(Color.PINK);
				gDC.drawRect(50, 110, 400, 20);
				gDC.fillRect(50, 110, this.foodLvl * 4, 20);
				gDC.setColor(Color.BLUE);
				gDC.drawRect(50, 140, 400, 20);
				gDC.fillRect(50, 140, this.waterLvl * 4, 20);
				gDC.setColor(Color.LIGHT_GRAY);
				gDC.drawRect(50, 170, 400, 20);
				gDC.fillRect(50, 170, this.progressLvl * 4, 20);
				gDC.setColor(Color.BLACK);
				gDC.drawString("Progress: " + this.progressLvl + "%", 195, 187);
				gDC.setColor(Color.BLUE);
				gDC.drawString("Score: " + this.coin, 600, 60);
				gDC.setColor(Color.RED);
				if (!this.inventoryActive) {
					gDC.setColor(Color.YELLOW);
					gDC.fillRect(1100, 550, 200, 200);
					gDC.fillRect(1095, 545, 200, 200);
					gDC.fillRect(1090, 540, 200, 200);
					gDC.fillRect(1085, 535, 200, 200);
					gDC.fillRect(1080, 530, 200, 200);
					gDC.fillRect(1075, 525, 200, 200);
					gDC.fillRect(1070, 520, 200, 200);
					gDC.fillRect(1065, 515, 200, 200);
					gDC.fillRect(1060, 510, 200, 200);
					gDC.fillRect(1055, 505, 200, 200);
					gDC.fillRect(1050, 500, 200, 200);
					gDC.fillRect(1045, 495, 200, 200);
					gDC.fillRect(1040, 490, 200, 200);
					gDC.fillRect(1035, 485, 200, 200);
					gDC.fillRect(1030, 480, 200, 200);
					gDC.fillRect(1025, 475, 200, 200);
					gDC.fillRect(1020, 470, 200, 200);
					gDC.fillRect(1015, 465, 200, 200);
					gDC.fillRect(1010, 460, 200, 200);
					gDC.fillRect(1005, 455, 200, 200);
					gDC.fillRect(1000, 450, 200, 200);
					gDC.fillRect(995, 445, 200, 200);
					gDC.fillRect(990, 440, 200, 200);
					gDC.fillRect(985, 435, 200, 200);
					gDC.fillRect(980, 430, 200, 200);
					gDC.fillRect(975, 425, 200, 200);
					gDC.fillRect(970, 420, 200, 200);
					gDC.fillRect(965, 415, 200, 200);
					gDC.fillRect(960, 410, 200, 200);
					gDC.fillRect(955, 405, 200, 200);
					gDC.fillRect(950, 400, 200, 200);
					if (this.infected) {
						gDC.setColor(Color.GREEN);
						gDC.fillOval(1120, 570, 20, 20);
						gDC.fillOval(1050, 520, 20, 20);
						gDC.fillOval(1090, 530, 20, 20);
						gDC.fillOval(1060, 580, 20, 20);
						gDC.fillOval(1150, 490, 20, 20);
						gDC.fillOval(1030, 470, 20, 20);
						gDC.fillOval(1090, 640, 20, 20);
						gDC.fillOval(1120, 520, 20, 20);
						gDC.drawLine(1134, 493, 1129, 505 + this.infection / 100);
					}
				}
				gDC.setColor(Color.RED);
				if (this.tlenLvl <= 25 && this.tlenLvl > 0)
					gDC.drawString("Uwaga: Masz " + this.tlenLvl + '%' + ' ' + "tlenu!!!", 550, 120);
				if (this.tlenLvl <= 5 && this.tlenLvl > 0)
					gDC.drawString("Pna powierzchni", 550, 150);
				if (this.tlenLvl <= 0)
					gDC.drawString("Dusisz si", 600, 120);
				if (this.snapshot) {
					gDC.setColor(Color.WHITE);
				}
				if (!this.inventoryActive) {
					gDC.setColor(Color.BLUE);
					if (this.timer > 100 && this.timer < 400)
						gDC.drawString(
								"RAPORT: ok 3. godziny od upadku na powierzchnie, Statek kosmiczny: upadna planete 2km od obecnej lokalizacji",
								175, 675);
					if (this.timer > 700 && this.timer < 1000)
						gDC.drawString("Pamio jedzeniu (" + this.foodLvl + '%' + ") i piciu" + ' ' + '(' + this.waterLvl
								+ '%' + ')', 520, 675);
					if (this.timer > 1200 && this.timer < 1400)
						gDC.drawString("UCraftera by craftowa", 550, 675);
				}
				this.timer++;
				this.infection++;
				if (this.infection > 2000)
					this.infected = true;
			}
		}
		gDC.setColor(Color.BLACK);
		this.licznikStat++;
		if (this.licznikStat == 100 && !this.dead) {
			this.licznikStat = 0;
			this.foodLvl -= 3;
			this.waterLvl -= 2;
			this.coin++;
			if (this.underWater)
				this.tlenLvl -= 5;
			this.sunAnim += 5;
			if (this.sunAnim == 300)
				this.sunAnim = 200;
		}
		if (this.tlenLvl <= 0)
			this.healLvl--;
		if (this.healLvl <= 0) {
			setBackground(Color.BLACK);
			this.tlenLvl = 0;
			this.jedz.setVisible(false);
			this.pij.setVisible(false);
			this.lecz.setVisible(false);
			this.inventory.setVisible(false);
			this.jezioro.setVisible(false);
			this.biomeE.setVisible(false);
			this.biome = 0;
			this.dead = true;
			this.inventoryActive = false;
			this.closeInventory.setVisible(false);
		}
		if (this.foodLvl <= 0 || this.waterLvl <= 0)
			this.healLvl--;
		if (this.tlenLvl > 100) {
			this.tlenLvl = 100;
			repaint();
		}
		if (this.foodLvl > 100) {
			this.foodLvl = 100;
			repaint();
		}
		if (this.healLvl > 100) {
			this.healLvl = 100;
			repaint();
		}
		if (this.waterLvl > 100) {
			this.waterLvl = 100;
			repaint();
		}
		if (this.tlenLvl < 0) {
			this.tlenLvl = 0;
			repaint();
		}
		if (this.foodLvl < 0) {
			this.foodLvl = 0;
			repaint();
		}
		if (this.healLvl < 0) {
			this.healLvl = 0;
			repaint();
		}
		if (this.waterLvl < 0) {
			this.waterLvl = 0;
			repaint();
		}
		if (this.infDmg >= 200) {
			this.infDmg = 0;
			this.healLvl--;
		}
		if (this.infected)
			this.infDmg++;
		if (this.inventoryActive) {
			gDC.setFont(this.font);
			gDC.setColor(Color.GRAY);
			gDC.fillRect(20, 200, 1250, 500);
			gDC.setColor(Color.WHITE);
			gDC.fillRect(20, 200, 100, 500);
			gDC.setColor(Color.BLUE);
			gDC.fillOval(30, 210, 70, 70);
			gDC.setColor(Color.BLACK);
			gDC.drawString(this.tlenLvl + "%", 225, 67);
			gDC.drawString(this.healLvl + "%", 225, 97);
			gDC.drawString(this.foodLvl + "%", 225, 127);
			gDC.drawString(this.waterLvl + "%", 225, 157);
			this.inventory.setVisible(false);
			this.jezioro.setVisible(false);
			if (this.biome != 0)
				this.biomeE.setVisible(false);
			setCursor(this.normal_cur);
			gDC.setColor(Color.LIGHT_GRAY);
			gDC.setColor(Color.WHITE);
			gDC.drawString("Slot 5: " + this.invHB5.toUpperCase() + ' ' + '[' + this.invHB5c + ']', 130, 362);
			gDC.drawString("Slot 6: " + this.invHB6.toUpperCase() + ' ' + '[' + this.invHB6c + ']', 130, 390);
			gDC.drawString("Slot 7: " + this.invHB7.toUpperCase() + ' ' + '[' + this.invHB7c + ']', 130, 418);
			gDC.drawString("Slot 8: " + this.invHB8.toUpperCase() + ' ' + '[' + this.invHB8c + ']', 130, 446);
			gDC.drawString("Slot 9: " + this.invHB9.toUpperCase() + ' ' + '[' + this.invHB9c + ']', 130, 474);
			gDC.drawString("Slot 10: " + this.invHB10.toUpperCase() + ' ' + '[' + this.invHB10c + ']', 130, 502);
		} else if (!this.fabula && !this.gameStarted) {
			gDC.setColor(Color.BLACK);
			gDC.drawString("Witaj " + this.gameUser + ' ' + "w grze: Sodrotion" + ' ' + this.gameVer, 50, 50);
			if (this.gameVeryDev) {
				gDC.setColor(Color.RED);
				gDC.drawString("warning: this game version is in very development!!!".toUpperCase(), 50, 75);
				gDC.drawString("please, do not play!!!".toUpperCase(), 50, 100);
			}
		}
	}

	public void mouseDragged(MouseEvent e) {
		if (!this.inventoryActive) {
			this.height = e.getY();
			this.compX = e.getX();
			this.compY = e.getY();
		}
		this.mouseX = e.getX();
		this.mouseY = e.getY();
		repaint();
		System.out.println("Mouse pointer is on position: " + this.pointer.x + ' ' + this.pointer.y);
	}

	public void mouseMoved(MouseEvent e) {
		if (!this.inventoryActive) {
			this.height = e.getY();
			this.compX = e.getX();
			this.compY = e.getY();
		}
		this.mouseX = e.getX();
		this.mouseY = e.getY();
		repaint();
	}

	public void windowOpened(WindowEvent e) {
	}

	public void windowClosing(WindowEvent e) {
		dispose();
	}

	public void windowClosed(WindowEvent e) {
	}

	public void windowIconified(WindowEvent e) {
	}

	public void windowDeiconified(WindowEvent e) {
	}

	public void windowActivated(WindowEvent e) {
	}

	public void windowDeactivated(WindowEvent e) {
	}

	public static void main(String[] args) { 
		new notPlagiat("HOLY FUCKING SHIT‼️‼️‼️‼️ IS THAT A MOTHERFUCKING JOJO REFERENCE??????!!!!!!!!!!");
	}

	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		int truj = 0;
		if (cmd.equals("jedz")) {
			truj = this.rand.nextInt(5);
			if (this.coin >= 5 && !this.inventoryActive) {
				this.invHB1c++;
				this.coin -= 5;
			}
			if (this.inventoryActive && this.invHB1c >= 1 && this.foodLvl != 100) {
				if (truj != 1) {
					this.foodLvl += 20;
					this.waterLvl -= 5;
					this.invHB1c--;
				}
				if (truj == 1) {
					this.foodLvl -= 10;
					this.waterLvl -= 5;
					this.invHB1c--;
				}
			}
			repaint();
		}
		if (cmd.equals("pij")) {
			truj = this.rand.nextInt(5);
			if (this.coin >= 2 && !this.inventoryActive && this.biome == 0) {
				this.invHB2c++;
				this.coin -= 2;
			}
			if (this.coin >= 2 && !this.inventoryActive && this.biome == 1)
				this.invHB2c++;
			if (this.inventoryActive && this.invHB2c >= 1 && this.waterLvl != 100 && this.biome == 0) {
				if (truj != 1) {
					this.waterLvl += 20;
					this.foodLvl--;
					this.invHB2c--;
				}
				if (truj == 1) {
					this.waterLvl -= 10;
					this.foodLvl--;
					this.invHB2c--;
				}
			} else if (this.inventoryActive && this.invHB2c >= 1 && this.waterLvl != 100 && this.biome == 1) {
				this.waterLvl += 10;
				this.foodLvl--;
				this.invHB2c--;
			}
			repaint();
		}
		if (cmd.equals("lecz")) {
			truj = this.rand.nextInt(5);
			if (this.coin >= 3 && !this.inventoryActive) {
				this.invHB3c++;
				this.coin -= 3;
			}
			if (this.inventoryActive && this.invHB3c >= 1 && this.healLvl != 100) {
				if (truj != 1) {
					this.healLvl += 20;
					this.foodLvl -= 2;
					this.waterLvl -= 5;
					this.invHB3c--;
				}
				if (truj == 1) {
					this.healLvl -= 10;
					this.foodLvl -= 2;
					this.waterLvl -= 5;
					this.invHB3c--;
				}
			}
			repaint();
		}
		if (cmd.equals("exitBiome")) {
			this.biome = 0;
			this.biomeE.setVisible(false);
			this.jezioro.setVisible(true);
			repaint();
		}
		if (cmd.equals("jezioro")) {
			this.biome = 1;
			this.biomeE.setVisible(true);
			this.jezioro.setVisible(false);
			repaint();
		}
		if (cmd.equals("exitInventory")) {
			this.inventoryActive = false;
			this.closeInventory.setVisible(false);
			this.lecz.setVisible(true);
			this.pij.setVisible(true);
			this.jedz.setVisible(true);
			this.inventory.setVisible(true);
			if (this.biome != 0)
				this.biomeE.setVisible(true);
			if (this.biome != 1)
				this.jezioro.setVisible(true);
			setCursor(this.default_cur);
			repaint();
		}
		if (cmd.equals("startGry")) {
			this.acceptHistory.setVisible(true);
			this.startGame.setVisible(false);
			this.option.setVisible(false);
			this.exitGame.setVisible(false);
			this.fabula = true;
		}
		cmd.equals("opcje");
		if (cmd.equals("exitGame"))
			dispose();
		if (cmd.equals("inventory")) {
			this.inventoryActive = true;
			this.closeInventory.setVisible(true);
			repaint();
		}
		if (cmd.equals("acceptHistory")) {
			this.gameStarted = true;
			this.startGame.setVisible(false);
			this.option.setVisible(false);
			this.exitGame.setVisible(false);
			this.jedz.setVisible(true);
			this.pij.setVisible(true);
			this.lecz.setVisible(true);
			this.jezioro.setVisible(true);
			this.inventory.setVisible(true);
			this.fabula = false;
			repaint();
		}
	}

	public notPlagiat(String player) {
		this.zxc = 1;
		addWindowListener(this);
		addMouseMotionListener(this);
		setTitle("Sodrotion " + this.gameVer);
		setBounds(-10, 0, 1300, 750);
		setLayout((LayoutManager) null);
		setBackground(Color.GREEN);
		setCursor(this.normal_cur);
		this.gameUser = player;
		this.jedz = new Button("Jedz");
		this.pij = new Button("Napij si");
		this.lecz = new Button("Lecz si");
		this.inventory = new Button("Inventory");
		this.closeInventory = new Button("X");
		this.biomeE = new Button("Exit");
		this.jezioro = new Button("Jezioro");
		this.startGame = new Button("Graj");
		this.option = new Button("Opcje [Comming soon!!!]");
		this.exitGame = new Button("Wyj");
		this.acceptHistory = new Button("OK");
		this.jedz.addActionListener(this);
		this.jedz.setActionCommand("jedz");
		this.jedz.setBounds(1090, 140, 200, 20);
		this.jedz.setBackground(Color.GRAY);
		this.jedz.setForeground(Color.WHITE);
		this.jedz.setCursor(this.hand);
		this.jedz.setVisible(false);
		this.pij.addActionListener(this);
		this.pij.setActionCommand("pij");
		this.pij.setBounds(1090, 80, 200, 20);
		this.pij.setBackground(Color.GRAY);
		this.pij.setForeground(Color.WHITE);
		this.pij.setCursor(this.hand);
		this.pij.setVisible(false);
		this.lecz.addActionListener(this);
		this.lecz.setActionCommand("lecz");
		this.lecz.setBounds(1090, 110, 200, 20);
		this.lecz.setBackground(Color.GRAY);
		this.lecz.setForeground(Color.WHITE);
		this.lecz.setCursor(this.hand);
		this.lecz.setVisible(false);
		this.inventory.addActionListener(this);
		this.inventory.setActionCommand("inventory");
		this.inventory.setBounds(1090, 50, 200, 20);
		this.inventory.setBackground(Color.GRAY);
		this.inventory.setForeground(Color.WHITE);
		this.inventory.setCursor(this.hand);
		this.inventory.setVisible(false);
		this.closeInventory.addActionListener(this);
		this.closeInventory.setActionCommand("exitInventory");
		this.closeInventory.setBounds(1090, 50, 200, 20);
		this.closeInventory.setBackground(Color.GRAY);
		this.closeInventory.setForeground(Color.WHITE);
		this.closeInventory.setVisible(false);
		this.closeInventory.setCursor(this.hand);
		this.biomeE.addActionListener(this);
		this.biomeE.setActionCommand("exitBiome");
		this.biomeE.setBounds(75, 200, 50, 50);
		this.biomeE.setBackground(Color.GRAY);
		this.biomeE.setForeground(Color.WHITE);
		this.biomeE.setCursor(this.hand);
		this.biomeE.setVisible(false);
		this.jezioro.addActionListener(this);
		this.jezioro.setActionCommand("jezioro");
		this.jezioro.setBounds(1090, 170, 200, 20);
		this.jezioro.setBackground(Color.GRAY);
		this.jezioro.setForeground(Color.WHITE);
		this.jezioro.setCursor(this.hand);
		this.jezioro.setVisible(false);
		this.startGame.addActionListener(this);
		this.startGame.setActionCommand("startGry");
		this.startGame.setBounds(200, 200, 500, 50);
		this.startGame.setBackground(Color.GRAY);
		this.startGame.setForeground(Color.WHITE);
		this.startGame.setCursor(this.hand);
		this.option.addActionListener(this);
		this.option.setActionCommand("opcje");
		this.option.setBounds(200, 270, 500, 50);
		this.option.setBackground(Color.GRAY);
		this.option.setForeground(Color.WHITE);
		this.option.setCursor(this.hand);
		this.exitGame.addActionListener(this);
		this.exitGame.setActionCommand("exitGame");
		this.exitGame.setBounds(200, 340, 500, 50);
		this.exitGame.setBackground(Color.GRAY);
		this.exitGame.setForeground(Color.WHITE);
		this.exitGame.setCursor(this.hand);
		this.acceptHistory.addActionListener(this);
		this.acceptHistory.setActionCommand("acceptHistory");
		this.acceptHistory.setBounds(400, 680, 500, 50);
		this.acceptHistory.setBackground(Color.GRAY);
		this.acceptHistory.setForeground(Color.WHITE);
		this.acceptHistory.setCursor(this.hand);
		this.acceptHistory.setVisible(false);
		add(this.jedz);
		add(this.pij);
		add(this.lecz);
		add(this.inventory);
		add(this.closeInventory);
		add(this.biomeE);
		add(this.jezioro);
		add(this.startGame);
		add(this.option);
		add(this.exitGame);
		add(this.acceptHistory);
		setVisible(true);
	}

	public void modLoader() {
		if (this.zxc == 1)
			this.zxc = 0;
	}
}