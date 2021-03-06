package cz.grossik.farmcraft2.tractor;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelTractor extends ModelBase
{
  //fields
    ModelRenderer predek1;
    ModelRenderer predek2;
    ModelRenderer kabina1;
    ModelRenderer kabina2;
    ModelRenderer kabina3;
    ModelRenderer kabina4;
    ModelRenderer kabina5;
    ModelRenderer kabina6;
    ModelRenderer kabina7;
    ModelRenderer kabina8;
    ModelRenderer strecha1;
    ModelRenderer vyfuk;
    ModelRenderer okno1;
    ModelRenderer okno2;
    ModelRenderer okno3;
    ModelRenderer strecha2;
    ModelRenderer kolopredniprave1;
    ModelRenderer kolopredniprave2;
    ModelRenderer kolopredniprave3;
    ModelRenderer kolopredniprave4;
    ModelRenderer kolopredniprave5;
    ModelRenderer kolopredniprave6;
    ModelRenderer kolopredniprave7;
    ModelRenderer kolopredniprave8;
    ModelRenderer kolopredniprave9;
    ModelRenderer hridelpredekpravo;
    ModelRenderer hridelpredeklevo;
    ModelRenderer koloprednileve1;
    ModelRenderer koloprednileve2;
    ModelRenderer koloprednileve3;
    ModelRenderer koloprednileve4;
    ModelRenderer koloprednileve5;
    ModelRenderer koloprednileve6;
    ModelRenderer koloprednileve7;
    ModelRenderer koloprednileve8;
    ModelRenderer koloprednileve9;
    ModelRenderer kolozadniprave1;
    ModelRenderer kolozadniprave2;
    ModelRenderer kolozadniprave3;
    ModelRenderer kolozadniprave4;
    ModelRenderer kolozadniprave5;
    ModelRenderer kolozadniprave6;
    ModelRenderer kolozadniprave7;
    ModelRenderer kolozadniprave8;
    ModelRenderer kolozadniprave9;
    ModelRenderer kolozadniprave10;
    ModelRenderer kolozadniprave11;
    ModelRenderer kolozadniprave12;
    ModelRenderer kolozadniprave13;
    ModelRenderer hridelzadekpravo;
    ModelRenderer kolozadnileve1;
    ModelRenderer kolozadnileve2;
    ModelRenderer kolozadnileve3;
    ModelRenderer kolozadnileve4;
    ModelRenderer kolozadnileve5;
    ModelRenderer kolozadnileve6;
    ModelRenderer kolozadnileve7;
    ModelRenderer kolozadnileve8;
    ModelRenderer kolozadnileve9;
    ModelRenderer kolozadnileve10;
    ModelRenderer kolozadnileve11;
    ModelRenderer kolozadnileve12;
    ModelRenderer kolozadnileve13;
    ModelRenderer hridelzadeklevo;
    ModelRenderer kabina9;
    ModelRenderer okno4;
    ModelRenderer sedacka;
    
  public ModelTractor()
  {
	    textureWidth = 128;
	    textureHeight = 128;
	    
	      predek1 = new ModelRenderer(this, 56, 0);
	      predek1.addBox(0F, 0F, 0F, 10, 10, 26);
	      predek1.setRotationPoint(0F, 0F, -23F);
	      predek1.setTextureSize(128, 128);
	      predek1.mirror = true;
	      setRotation(predek1, 0F, 0F, 0F);
	      predek2 = new ModelRenderer(this, 0, 0);
	      predek2.addBox(0F, 0F, 0F, 12, 3, 27);
	      predek2.setRotationPoint(-1F, 10F, -24F);
	      predek2.setTextureSize(128, 128);
	      predek2.mirror = true;
	      setRotation(predek2, 0F, 0F, 0F);
	      kabina1 = new ModelRenderer(this, 0, 69);
	      kabina1.addBox(0F, 0F, 0F, 18, 10, 1);
	      kabina1.setRotationPoint(-4F, -4F, 3F);
	      kabina1.setTextureSize(128, 128);
	      kabina1.mirror = true;
	      setRotation(kabina1, 0F, 0F, 0F);
	      kabina2 = new ModelRenderer(this, 0, 38);
	      kabina2.addBox(0F, 0F, 0F, 18, 7, 19);
	      kabina2.setRotationPoint(-4F, 6F, 3F);
	      kabina2.setTextureSize(128, 128);
	      kabina2.mirror = true;
	      setRotation(kabina2, 0F, 0F, 0F);
	      kabina3 = new ModelRenderer(this, 39, 65);
	      kabina3.addBox(0F, 0F, 0F, 1, 10, 18);
	      kabina3.setRotationPoint(-4F, -4F, 4F);
	      kabina3.setTextureSize(128, 128);
	      kabina3.mirror = true;
	      setRotation(kabina3, 0F, 0F, 0F);
	      kabina4 = new ModelRenderer(this, 39, 65);
	      kabina4.addBox(0F, 0F, 0F, 1, 10, 18);
	      kabina4.setRotationPoint(13F, -4F, 4F);
	      kabina4.setTextureSize(128, 128);
	      kabina4.mirror = true;
	      setRotation(kabina4, 0F, 0F, 0F);
	      kabina5 = new ModelRenderer(this, 93, 92);
	      kabina5.addBox(0F, 0F, 0F, 1, 7, 1);
	      kabina5.setRotationPoint(-4F, -11F, 3F);
	      kabina5.setTextureSize(128, 128);
	      kabina5.mirror = true;
	      setRotation(kabina5, 0F, 0F, 0F);
	      kabina6 = new ModelRenderer(this, 93, 92);
	      kabina6.addBox(0F, 0F, 0F, 1, 7, 1);
	      kabina6.setRotationPoint(13F, -11F, 3F);
	      kabina6.setTextureSize(128, 128);
	      kabina6.mirror = true;
	      setRotation(kabina6, 0F, 0F, 0F);
	      kabina7 = new ModelRenderer(this, 93, 92);
	      kabina7.addBox(0F, 0F, 0F, 1, 7, 1);
	      kabina7.setRotationPoint(-4F, -11F, 21F);
	      kabina7.setTextureSize(128, 128);
	      kabina7.mirror = true;
	      setRotation(kabina7, 0F, 0F, 0F);
	      kabina8 = new ModelRenderer(this, 93, 92);
	      kabina8.addBox(0F, 0F, 0F, 1, 7, 1);
	      kabina8.setRotationPoint(13F, -11F, 21F);
	      kabina8.setTextureSize(128, 128);
	      kabina8.mirror = true;
	      setRotation(kabina8, 0F, 0F, 0F);
	      strecha1 = new ModelRenderer(this, 0, 0);
	      strecha1.addBox(0F, 0F, 0F, 20, 1, 21);
	      strecha1.setRotationPoint(-5F, -12F, 2F);
	      strecha1.setTextureSize(128, 128);
	      strecha1.mirror = true;
	      setRotation(strecha1, 0F, 0F, 0F);
	      vyfuk = new ModelRenderer(this, 85, 92);
	      vyfuk.addBox(0F, 0F, 0F, 1, 5, 1);
	      vyfuk.setRotationPoint(1F, -5F, -14F);
	      vyfuk.setTextureSize(128, 128);
	      vyfuk.mirror = true;
	      setRotation(vyfuk, 0F, 0F, 0F);
	      okno1 = new ModelRenderer(this, 80, 55);
	      okno1.addBox(0F, 0F, 0F, 16, 7, 1);
	      okno1.setRotationPoint(-3F, -11F, 3F);
	      okno1.setTextureSize(128, 128);
	      okno1.mirror = true;
	      setRotation(okno1, 0F, 0F, 0F);
	      okno2 = new ModelRenderer(this, 80, 65);
	      okno2.addBox(0F, 0F, 0F, 1, 7, 17);
	      okno2.setRotationPoint(-4F, -11F, 4F);
	      okno2.setTextureSize(128, 128);
	      okno2.mirror = true;
	      setRotation(okno2, 0F, 0F, 0F);
	      okno3 = new ModelRenderer(this, 80, 65);
	      okno3.addBox(0F, 0F, 0F, 1, 7, 17);
	      okno3.setRotationPoint(13F, -11F, 4F);
	      okno3.setTextureSize(128, 128);
	      okno3.mirror = true;
	      setRotation(okno3, 0F, 0F, 0F);
	      strecha2 = new ModelRenderer(this, 0, 0);
	      strecha2.addBox(0F, 0F, 0F, 18, 1, 19);
	      strecha2.setRotationPoint(-4F, -13F, 3F);
	      strecha2.setTextureSize(128, 128);
	      strecha2.mirror = true;
	      setRotation(strecha2, 0F, 0F, 0F);
	      kolopredniprave1 = new ModelRenderer(this, 0, 95);
	      kolopredniprave1.addBox(0F, -4.5F, -1.5F, 1, 1, 3);
	      kolopredniprave1.setRotationPoint(-3F, 11.5F, -16.5F);
	      kolopredniprave1.setTextureSize(128, 128);
	      kolopredniprave1.mirror = true;
	      setRotation(kolopredniprave1, 0F, 0F, 0F);
	      kolopredniprave2 = new ModelRenderer(this, 9, 95);
	      kolopredniprave2.addBox(0F, -3.5F, -2.5F, 1, 1, 5);
	      kolopredniprave2.setRotationPoint(-3F, 11.5F, -16.5F);
	      kolopredniprave2.setTextureSize(128, 128);
	      kolopredniprave2.mirror = true;
	      setRotation(kolopredniprave2, 0F, 0F, 0F);
	      kolopredniprave3 = new ModelRenderer(this, 22, 95);
	      kolopredniprave3.addBox(0F, -2.5F, -3.5F, 1, 1, 7);
	      kolopredniprave3.setRotationPoint(-3F, 11.5F, -16.5F);
	      kolopredniprave3.setTextureSize(128, 128);
	      kolopredniprave3.mirror = true;
	      setRotation(kolopredniprave3, 0F, 0F, 0F);
	      kolopredniprave4 = new ModelRenderer(this, 39, 95);
	      kolopredniprave4.addBox(0F, -1.5F, -4.5F, 1, 1, 9);
	      kolopredniprave4.setRotationPoint(-3F, 11.5F, -16.5F);
	      kolopredniprave4.setTextureSize(128, 128);
	      kolopredniprave4.mirror = true;
	      setRotation(kolopredniprave4, 0F, 0F, 0F);
	      kolopredniprave5 = new ModelRenderer(this, 39, 95);
	      kolopredniprave5.addBox(0F, -0.5F, -4.5F, 1, 1, 9);
	      kolopredniprave5.setRotationPoint(-3F, 11.5F, -16.5F);
	      kolopredniprave5.setTextureSize(128, 128);
	      kolopredniprave5.mirror = true;
	      setRotation(kolopredniprave5, 0F, 0F, 0F);
	      kolopredniprave6 = new ModelRenderer(this, 39, 95);
	      kolopredniprave6.addBox(0F, 0.5F, -4.5F, 1, 1, 9);
	      kolopredniprave6.setRotationPoint(-3F, 11.5F, -16.5F);
	      kolopredniprave6.setTextureSize(128, 128);
	      kolopredniprave6.mirror = true;
	      setRotation(kolopredniprave6, 0F, 0F, 0F);
	      kolopredniprave7 = new ModelRenderer(this, 22, 95);
	      kolopredniprave7.addBox(0F, 1.5F, -3.5F, 1, 1, 7);
	      kolopredniprave7.setRotationPoint(-3F, 11.5F, -16.5F);
	      kolopredniprave7.setTextureSize(128, 128);
	      kolopredniprave7.mirror = true;
	      setRotation(kolopredniprave7, 0F, 0F, 0F);
	      kolopredniprave8 = new ModelRenderer(this, 9, 95);
	      kolopredniprave8.addBox(0F, 2.5F, -2.5F, 1, 1, 5);
	      kolopredniprave8.setRotationPoint(-3F, 11.5F, -16.5F);
	      kolopredniprave8.setTextureSize(128, 128);
	      kolopredniprave8.mirror = true;
	      setRotation(kolopredniprave8, 0F, 0F, 0F);
	      kolopredniprave9 = new ModelRenderer(this, 0, 95);
	      kolopredniprave9.addBox(0F, 3.5F, -1.5F, 1, 1, 3);
	      kolopredniprave9.setRotationPoint(-3F, 11.5F, -16.5F);
	      kolopredniprave9.setTextureSize(128, 128);
	      kolopredniprave9.mirror = true;
	      setRotation(kolopredniprave9, 0F, 0F, 0F);
	      hridelpredekpravo = new ModelRenderer(this, 0, 124);
	      hridelpredekpravo.addBox(0F, 0F, 0F, 1, 1, 1);
	      hridelpredekpravo.setRotationPoint(-2F, 11F, -17F);
	      hridelpredekpravo.setTextureSize(128, 128);
	      hridelpredekpravo.mirror = true;
	      setRotation(hridelpredekpravo, 0F, 0F, 0F);
	      hridelpredeklevo = new ModelRenderer(this, 0, 124);
	      hridelpredeklevo.addBox(0F, 0F, 0F, 1, 1, 1);
	      hridelpredeklevo.setRotationPoint(11F, 11F, -17F);
	      hridelpredeklevo.setTextureSize(128, 128);
	      hridelpredeklevo.mirror = true;
	      setRotation(hridelpredeklevo, 0F, 0F, 0F);
	      koloprednileve1 = new ModelRenderer(this, 0, 95);
	      koloprednileve1.addBox(-1F, -4.5F, -1.5F, 1, 1, 3);
	      koloprednileve1.setRotationPoint(13F, 11.5F, -16.5F);
	      koloprednileve1.setTextureSize(128, 128);
	      koloprednileve1.mirror = true;
	      setRotation(koloprednileve1, 0F, 0F, 0F);
	      koloprednileve2 = new ModelRenderer(this, 9, 95);
	      koloprednileve2.addBox(-1F, -3.5F, -2.5F, 1, 1, 5);
	      koloprednileve2.setRotationPoint(13F, 11.5F, -16.5F);
	      koloprednileve2.setTextureSize(128, 128);
	      koloprednileve2.mirror = true;
	      setRotation(koloprednileve2, 0F, 0F, 0F);
	      koloprednileve3 = new ModelRenderer(this, 22, 95);
	      koloprednileve3.addBox(-1F, -2.5F, -3.5F, 1, 1, 7);
	      koloprednileve3.setRotationPoint(13F, 11.5F, -16.5F);
	      koloprednileve3.setTextureSize(128, 128);
	      koloprednileve3.mirror = true;
	      setRotation(koloprednileve3, 0F, 0F, 0F);
	      koloprednileve4 = new ModelRenderer(this, 39, 95);
	      koloprednileve4.addBox(-1F, -1.5F, -4.5F, 1, 1, 9);
	      koloprednileve4.setRotationPoint(13F, 11.5F, -16.5F);
	      koloprednileve4.setTextureSize(128, 128);
	      koloprednileve4.mirror = true;
	      setRotation(koloprednileve4, 0F, 0F, 0F);
	      koloprednileve5 = new ModelRenderer(this, 39, 95);
	      koloprednileve5.addBox(-1F, -0.5F, -4.5F, 1, 1, 9);
	      koloprednileve5.setRotationPoint(13F, 11.5F, -16.5F);
	      koloprednileve5.setTextureSize(128, 128);
	      koloprednileve5.mirror = true;
	      setRotation(koloprednileve5, 0F, 0F, 0F);
	      koloprednileve6 = new ModelRenderer(this, 39, 95);
	      koloprednileve6.addBox(-1F, 0.5F, -4.5F, 1, 1, 9);
	      koloprednileve6.setRotationPoint(13F, 11.5F, -16.5F);
	      koloprednileve6.setTextureSize(128, 128);
	      koloprednileve6.mirror = true;
	      setRotation(koloprednileve6, 0F, 0F, 0F);
	      koloprednileve7 = new ModelRenderer(this, 22, 95);
	      koloprednileve7.addBox(-1F, 1.5F, -3.5F, 1, 1, 7);
	      koloprednileve7.setRotationPoint(13F, 11.5F, -16.5F);
	      koloprednileve7.setTextureSize(128, 128);
	      koloprednileve7.mirror = true;
	      setRotation(koloprednileve7, 0F, 0F, 0F);
	      koloprednileve8 = new ModelRenderer(this, 9, 95);
	      koloprednileve8.addBox(-1F, 2.5F, -2.5F, 1, 1, 5);
	      koloprednileve8.setRotationPoint(13F, 11.5F, -16.5F);
	      koloprednileve8.setTextureSize(128, 128);
	      koloprednileve8.mirror = true;
	      setRotation(koloprednileve8, 0F, 0F, 0F);
	      koloprednileve9 = new ModelRenderer(this, 0, 95);
	      koloprednileve9.addBox(-1F, 3.5F, -1.5F, 1, 1, 3);
	      koloprednileve9.setRotationPoint(13F, 11.5F, -16.5F);
	      koloprednileve9.setTextureSize(128, 128);
	      koloprednileve9.mirror = true;
	      setRotation(koloprednileve9, 0F, 0F, 0F);
	      kolozadniprave1 = new ModelRenderer(this, 0, 116);
	      kolozadniprave1.addBox(0F, 5.5F, -2.5F, 1, 1, 5);
	      kolozadniprave1.setRotationPoint(-6F, 9.5F, 12.5F);
	      kolozadniprave1.setTextureSize(128, 128);
	      kolozadniprave1.mirror = true;
	      setRotation(kolozadniprave1, 0F, 0F, 0F);
	      kolozadniprave2 = new ModelRenderer(this, 13, 115);
	      kolozadniprave2.addBox(0F, 4.5F, -3.5F, 1, 1, 7);
	      kolozadniprave2.setRotationPoint(-6F, 9.5F, 12.5F);
	      kolozadniprave2.setTextureSize(128, 128);
	      kolozadniprave2.mirror = true;
	      setRotation(kolozadniprave2, 0F, 0F, 0F);
	      kolozadniprave3 = new ModelRenderer(this, 30, 115);
	      kolozadniprave3.addBox(0F, 3.5F, -4.5F, 1, 1, 9);
	      kolozadniprave3.setRotationPoint(-6F, 9.5F, 12.5F);
	      kolozadniprave3.setTextureSize(128, 128);
	      kolozadniprave3.mirror = true;
	      setRotation(kolozadniprave3, 0F, 0F, 0F);
	      kolozadniprave4 = new ModelRenderer(this, 51, 115);
	      kolozadniprave4.addBox(0F, 2.5F, -5.5F, 1, 1, 11);
	      kolozadniprave4.setRotationPoint(-6F, 9.5F, 12.5F);
	      kolozadniprave4.setTextureSize(128, 128);
	      kolozadniprave4.mirror = true;
	      setRotation(kolozadniprave4, 0F, 0F, 0F);
	      kolozadniprave5 = new ModelRenderer(this, 76, 113);
	      kolozadniprave5.addBox(0F, 1.5F, -6.5F, 1, 1, 13);
	      kolozadniprave5.setRotationPoint(-6F, 9.5F, 12.5F);
	      kolozadniprave5.setTextureSize(128, 128);
	      kolozadniprave5.mirror = true;
	      setRotation(kolozadniprave5, 0F, 0F, 0F);
	      kolozadniprave6 = new ModelRenderer(this, 76, 113);
	      kolozadniprave6.addBox(0F, 0.5F, -6.5F, 1, 1, 13);
	      kolozadniprave6.setRotationPoint(-6F, 9.5F, 12.5F);
	      kolozadniprave6.setTextureSize(128, 128);
	      kolozadniprave6.mirror = true;
	      setRotation(kolozadniprave6, 0F, 0F, 0F);
	      kolozadniprave7 = new ModelRenderer(this, 76, 113);
	      kolozadniprave7.addBox(0F, -0.5F, -6.5F, 1, 1, 13);
	      kolozadniprave7.setRotationPoint(-6F, 9.5F, 12.5F);
	      kolozadniprave7.setTextureSize(128, 128);
	      kolozadniprave7.mirror = true;
	      setRotation(kolozadniprave7, 0F, 0F, 0F);
	      kolozadniprave8 = new ModelRenderer(this, 76, 113);
	      kolozadniprave8.addBox(0F, -1.5F, -6.5F, 1, 1, 13);
	      kolozadniprave8.setRotationPoint(-6F, 9.5F, 12.5F);
	      kolozadniprave8.setTextureSize(128, 128);
	      kolozadniprave8.mirror = true;
	      setRotation(kolozadniprave8, 0F, 0F, 0F);
	      kolozadniprave9 = new ModelRenderer(this, 76, 113);
	      kolozadniprave9.addBox(0F, -2.5F, -6.5F, 1, 1, 13);
	      kolozadniprave9.setRotationPoint(-6F, 9.5F, 12.5F);
	      kolozadniprave9.setTextureSize(128, 128);
	      kolozadniprave9.mirror = true;
	      setRotation(kolozadniprave9, 0F, 0F, 0F);
	      kolozadniprave10 = new ModelRenderer(this, 51, 115);
	      kolozadniprave10.addBox(0F, -3.5F, -5.5F, 1, 1, 11);
	      kolozadniprave10.setRotationPoint(-6F, 9.5F, 12.5F);
	      kolozadniprave10.setTextureSize(128, 128);
	      kolozadniprave10.mirror = true;
	      setRotation(kolozadniprave10, 0F, 0F, 0F);
	      kolozadniprave11 = new ModelRenderer(this, 30, 115);
	      kolozadniprave11.addBox(0F, -4.5F, -4.5F, 1, 1, 9);
	      kolozadniprave11.setRotationPoint(-6F, 9.5F, 12.5F);
	      kolozadniprave11.setTextureSize(128, 128);
	      kolozadniprave11.mirror = true;
	      setRotation(kolozadniprave11, 0F, 0F, 0F);
	      kolozadniprave12 = new ModelRenderer(this, 13, 115);
	      kolozadniprave12.addBox(0F, -5.5F, -3.5F, 1, 1, 7);
	      kolozadniprave12.setRotationPoint(-6F, 9.5F, 12.5F);
	      kolozadniprave12.setTextureSize(128, 128);
	      kolozadniprave12.mirror = true;
	      setRotation(kolozadniprave12, 0F, 0F, 0F);
	      kolozadniprave13 = new ModelRenderer(this, 0, 116);
	      kolozadniprave13.addBox(0F, -6.5F, -2.5F, 1, 1, 5);
	      kolozadniprave13.setRotationPoint(-6F, 9.5F, 12.5F);
	      kolozadniprave13.setTextureSize(128, 128);
	      kolozadniprave13.mirror = true;
	      setRotation(kolozadniprave13, 0F, 0F, 0F);
	      hridelzadekpravo = new ModelRenderer(this, 0, 124);
	      hridelzadekpravo.addBox(0F, 0F, 0F, 1, 1, 1);
	      hridelzadekpravo.setRotationPoint(-5F, 9F, 12F);
	      hridelzadekpravo.setTextureSize(128, 128);
	      hridelzadekpravo.mirror = true;
	      setRotation(hridelzadekpravo, 0F, 0F, 0F);
	      kolozadnileve1 = new ModelRenderer(this, 0, 116);
	      kolozadnileve1.addBox(-1F, -6.5F, -2.5F, 1, 1, 5);
	      kolozadnileve1.setRotationPoint(16F, 9.5F, 12.5F);
	      kolozadnileve1.setTextureSize(128, 128);
	      kolozadnileve1.mirror = true;
	      setRotation(kolozadnileve1, 0F, 0F, 0F);
	      kolozadnileve2 = new ModelRenderer(this, 13, 115);
	      kolozadnileve2.addBox(-1F, -5.5F, -3.5F, 1, 1, 7);
	      kolozadnileve2.setRotationPoint(16F, 9.5F, 12.5F);
	      kolozadnileve2.setTextureSize(128, 128);
	      kolozadnileve2.mirror = true;
	      setRotation(kolozadnileve2, 0F, 0F, 0F);
	      kolozadnileve3 = new ModelRenderer(this, 30, 115);
	      kolozadnileve3.addBox(-1F, -4.5F, -4.5F, 1, 1, 9);
	      kolozadnileve3.setRotationPoint(16F, 9.5F, 12.5F);
	      kolozadnileve3.setTextureSize(128, 128);
	      kolozadnileve3.mirror = true;
	      setRotation(kolozadnileve3, 0F, 0F, 0F);
	      kolozadnileve4 = new ModelRenderer(this, 51, 115);
	      kolozadnileve4.addBox(-1F, -3.5F, -5.5F, 1, 1, 11);
	      kolozadnileve4.setRotationPoint(16F, 9.5F, 12.5F);
	      kolozadnileve4.setTextureSize(128, 128);
	      kolozadnileve4.mirror = true;
	      setRotation(kolozadnileve4, 0F, 0F, 0F);
	      kolozadnileve5 = new ModelRenderer(this, 76, 113);
	      kolozadnileve5.addBox(-1F, -2.5F, -6.5F, 1, 1, 13);
	      kolozadnileve5.setRotationPoint(16F, 9.5F, 12.5F);
	      kolozadnileve5.setTextureSize(128, 128);
	      kolozadnileve5.mirror = true;
	      setRotation(kolozadnileve5, 0F, 0F, 0F);
	      kolozadnileve6 = new ModelRenderer(this, 76, 113);
	      kolozadnileve6.addBox(-1F, -1.5F, -6.5F, 1, 1, 13);
	      kolozadnileve6.setRotationPoint(16F, 9.5F, 12.5F);
	      kolozadnileve6.setTextureSize(128, 128);
	      kolozadnileve6.mirror = true;
	      setRotation(kolozadnileve6, 0F, 0F, 0F);
	      kolozadnileve7 = new ModelRenderer(this, 76, 113);
	      kolozadnileve7.addBox(-1F, -0.5F, -6.5F, 1, 1, 13);
	      kolozadnileve7.setRotationPoint(16F, 9.5F, 12.5F);
	      kolozadnileve7.setTextureSize(128, 128);
	      kolozadnileve7.mirror = true;
	      setRotation(kolozadnileve7, 0F, 0F, 0F);
	      kolozadnileve8 = new ModelRenderer(this, 51, 115);
	      kolozadnileve8.addBox(-1F, 2.5F, -5.5F, 1, 1, 11);
	      kolozadnileve8.setRotationPoint(16F, 9.5F, 12.5F);
	      kolozadnileve8.setTextureSize(128, 128);
	      kolozadnileve8.mirror = true;
	      setRotation(kolozadnileve8, 0F, 0F, 0F);
	      kolozadnileve9 = new ModelRenderer(this, 30, 115);
	      kolozadnileve9.addBox(-1F, 3.466667F, -4.5F, 1, 1, 9);
	      kolozadnileve9.setRotationPoint(16F, 9.5F, 12.5F);
	      kolozadnileve9.setTextureSize(128, 128);
	      kolozadnileve9.mirror = true;
	      setRotation(kolozadnileve9, 0F, 0F, 0F);
	      kolozadnileve10 = new ModelRenderer(this, 13, 115);
	      kolozadnileve10.addBox(-1F, 4.5F, -3.5F, 1, 1, 7);
	      kolozadnileve10.setRotationPoint(16F, 9.5F, 12.5F);
	      kolozadnileve10.setTextureSize(128, 128);
	      kolozadnileve10.mirror = true;
	      setRotation(kolozadnileve10, 0F, 0F, 0F);
	      kolozadnileve11 = new ModelRenderer(this, 76, 113);
	      kolozadnileve11.addBox(-1F, 0.5F, -6.5F, 1, 1, 13);
	      kolozadnileve11.setRotationPoint(16F, 9.5F, 12.5F);
	      kolozadnileve11.setTextureSize(128, 128);
	      kolozadnileve11.mirror = true;
	      setRotation(kolozadnileve11, 0F, 0F, 0F);
	      kolozadnileve12 = new ModelRenderer(this, 76, 113);
	      kolozadnileve12.addBox(-1F, 1.5F, -6.5F, 1, 1, 13);
	      kolozadnileve12.setRotationPoint(16F, 9.5F, 12.5F);
	      kolozadnileve12.setTextureSize(128, 128);
	      kolozadnileve12.mirror = true;
	      setRotation(kolozadnileve12, 0F, 0F, 0F);
	      kolozadnileve13 = new ModelRenderer(this, 0, 116);
	      kolozadnileve13.addBox(-1F, 5.5F, -2.5F, 1, 1, 5);
	      kolozadnileve13.setRotationPoint(16F, 9.5F, 12.5F);
	      kolozadnileve13.setTextureSize(128, 128);
	      kolozadnileve13.mirror = true;
	      setRotation(kolozadnileve13, 0F, 0F, 0F);
	      hridelzadeklevo = new ModelRenderer(this, 0, 124);
	      hridelzadeklevo.addBox(0F, 0F, 0F, 1, 1, 1);
	      hridelzadeklevo.setRotationPoint(14F, 9F, 12F);
	      hridelzadeklevo.setTextureSize(128, 128);
	      hridelzadeklevo.mirror = true;
	      setRotation(hridelzadeklevo, 0F, 0F, 0F);
      kabina9 = new ModelRenderer(this, 0, 69);
      kabina9.addBox(0F, 0F, 0F, 16, 10, 1);
      kabina9.setRotationPoint(-3F, -4F, 21F);
      kabina9.setTextureSize(128, 128);
      kabina9.mirror = true;
      setRotation(kabina9, 0F, 0F, 0F);
      okno4 = new ModelRenderer(this, 80, 55);
      okno4.addBox(0F, 0F, 0F, 16, 7, 1);
      okno4.setRotationPoint(-3F, -11F, 21F);
      okno4.setTextureSize(128, 128);
      okno4.mirror = true;
      setRotation(okno4, 0F, 0F, 0F);
      sedacka = new ModelRenderer(this, 90, 39);
      sedacka.addBox(0F, 0F, 0F, 8, 5, 5);
      sedacka.setRotationPoint(1F, 1F, 8F);
      sedacka.setTextureSize(128, 128);
      sedacka.mirror = true;
      setRotation(sedacka, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    predek1.render(f5);
    predek2.render(f5);
    kabina1.render(f5);
    kabina2.render(f5);
    kabina3.render(f5);
    kabina4.render(f5);
    kabina5.render(f5);
    kabina6.render(f5);
    kabina7.render(f5);
    kabina8.render(f5);
    strecha1.render(f5);
    vyfuk.render(f5);
    okno1.render(f5);
    okno2.render(f5);
    okno3.render(f5);
    strecha2.render(f5);
    kolopredniprave1.render(f5);
    kolopredniprave2.render(f5);
    kolopredniprave3.render(f5);
    kolopredniprave4.render(f5);
    kolopredniprave5.render(f5);
    kolopredniprave6.render(f5);
    kolopredniprave7.render(f5);
    kolopredniprave8.render(f5);
    kolopredniprave9.render(f5);
    hridelpredekpravo.render(f5);
    hridelpredeklevo.render(f5);
    koloprednileve1.render(f5);
    koloprednileve2.render(f5);
    koloprednileve3.render(f5);
    koloprednileve4.render(f5);
    koloprednileve5.render(f5);
    koloprednileve6.render(f5);
    koloprednileve7.render(f5);
    koloprednileve8.render(f5);
    koloprednileve9.render(f5);
    kolozadniprave1.render(f5);
    kolozadniprave2.render(f5);
    kolozadniprave3.render(f5);
    kolozadniprave4.render(f5);
    kolozadniprave5.render(f5);
    kolozadniprave6.render(f5);
    kolozadniprave7.render(f5);
    kolozadniprave8.render(f5);
    kolozadniprave9.render(f5);
    kolozadniprave10.render(f5);
    kolozadniprave11.render(f5);
    kolozadniprave12.render(f5);
    kolozadniprave13.render(f5);
    hridelzadekpravo.render(f5);
    kolozadnileve1.render(f5);
    kolozadnileve2.render(f5);
    kolozadnileve3.render(f5);
    kolozadnileve4.render(f5);
    kolozadnileve5.render(f5);
    kolozadnileve6.render(f5);
    kolozadnileve7.render(f5);
    kolozadnileve8.render(f5);
    kolozadnileve9.render(f5);
    kolozadnileve10.render(f5);
    kolozadnileve11.render(f5);
    kolozadnileve12.render(f5);
    kolozadnileve13.render(f5);
    hridelzadeklevo.render(f5);
    kabina9.render(f5);
    okno4.render(f5);
    sedacka.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    
    kolozadniprave1.rotateAngleX = f * 0.1F;
    kolozadniprave2.rotateAngleX = kolozadniprave1.rotateAngleX;
    kolozadniprave3.rotateAngleX = kolozadniprave1.rotateAngleX;
    kolozadniprave4.rotateAngleX = kolozadniprave1.rotateAngleX;
    kolozadniprave5.rotateAngleX = kolozadniprave1.rotateAngleX;
    kolozadniprave6.rotateAngleX = kolozadniprave1.rotateAngleX;
    kolozadniprave7.rotateAngleX = kolozadniprave1.rotateAngleX;
    kolozadniprave8.rotateAngleX = kolozadniprave1.rotateAngleX;
    kolozadniprave9.rotateAngleX = kolozadniprave1.rotateAngleX;
    kolozadniprave10.rotateAngleX = kolozadniprave1.rotateAngleX;
    kolozadniprave11.rotateAngleX = kolozadniprave1.rotateAngleX;
    kolozadniprave12.rotateAngleX = kolozadniprave1.rotateAngleX;
    kolozadniprave13.rotateAngleX = kolozadniprave1.rotateAngleX;

    kolopredniprave1.rotateAngleX = f * 0.1F;
    kolopredniprave2.rotateAngleX = kolopredniprave1.rotateAngleX;
    kolopredniprave3.rotateAngleX = kolopredniprave1.rotateAngleX;
    kolopredniprave4.rotateAngleX = kolopredniprave1.rotateAngleX;
    kolopredniprave5.rotateAngleX = kolopredniprave1.rotateAngleX;
    kolopredniprave6.rotateAngleX = kolopredniprave1.rotateAngleX;
    kolopredniprave7.rotateAngleX = kolopredniprave1.rotateAngleX;
    kolopredniprave8.rotateAngleX = kolopredniprave1.rotateAngleX;
    kolopredniprave9.rotateAngleX = kolopredniprave1.rotateAngleX;

    koloprednileve1.rotateAngleX = f * 0.1F;
    koloprednileve2.rotateAngleX = koloprednileve1.rotateAngleX;
    koloprednileve3.rotateAngleX = koloprednileve1.rotateAngleX;
    koloprednileve4.rotateAngleX = koloprednileve1.rotateAngleX;
    koloprednileve5.rotateAngleX = koloprednileve1.rotateAngleX;
    koloprednileve6.rotateAngleX = koloprednileve1.rotateAngleX;
    koloprednileve7.rotateAngleX = koloprednileve1.rotateAngleX;
    koloprednileve8.rotateAngleX = koloprednileve1.rotateAngleX;
    koloprednileve9.rotateAngleX = koloprednileve1.rotateAngleX;

    kolozadnileve1.rotateAngleX = f * 0.1F;
    kolozadnileve2.rotateAngleX = kolozadnileve1.rotateAngleX;
    kolozadnileve3.rotateAngleX = kolozadnileve1.rotateAngleX;
    kolozadnileve4.rotateAngleX = kolozadnileve1.rotateAngleX;
    kolozadnileve5.rotateAngleX = kolozadnileve1.rotateAngleX;
    kolozadnileve6.rotateAngleX = kolozadnileve1.rotateAngleX;
    kolozadnileve7.rotateAngleX = kolozadnileve1.rotateAngleX;
    kolozadnileve8.rotateAngleX = kolozadnileve1.rotateAngleX;
    kolozadnileve9.rotateAngleX = kolozadnileve1.rotateAngleX;
    kolozadnileve10.rotateAngleX = kolozadnileve1.rotateAngleX;
    kolozadnileve11.rotateAngleX = kolozadnileve1.rotateAngleX;
    kolozadnileve12.rotateAngleX = kolozadnileve1.rotateAngleX;
    kolozadnileve13.rotateAngleX = kolozadnileve1.rotateAngleX;
  }
}