package com.ffcs.inapppaylib.widget; class BorderText { void a() { int a;
a=0;// .class public Lcom/ffcs/inapppaylib/widget/BorderText;
a=0;// .super Landroid/widget/TextView;
a=0;// .source "BorderText.java"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private w:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 1
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 16
a=0;//     invoke-direct {p0, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 13
a=0;//     #p0=(Reference,Lcom/ffcs/inapppaylib/widget/BorderText;);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput v0, p0, Lcom/ffcs/inapppaylib/widget/BorderText;->w:I
a=0;// 
a=0;//     .line 17
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;//     .locals 1
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "attrs"    # Landroid/util/AttributeSet;
a=0;// 
a=0;//     .prologue
a=0;//     .line 20
a=0;//     invoke-direct {p0, p1, p2}, Landroid/widget/TextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;// 
a=0;//     .line 13
a=0;//     #p0=(Reference,Lcom/ffcs/inapppaylib/widget/BorderText;);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput v0, p0, Lcom/ffcs/inapppaylib/widget/BorderText;->w:I
a=0;// 
a=0;//     .line 21
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected onDraw(Landroid/graphics/Canvas;)V
a=0;//     .locals 6
a=0;//     .param p1, "canvas"    # Landroid/graphics/Canvas;
a=0;// 
a=0;//     .prologue
a=0;//     const/high16 v5, 0x40a00000    # 5.0f
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     const/high16 v4, 0x3f800000    # 1.0f
a=0;// 
a=0;//     .line 24
a=0;//     #v4=(Integer);
a=0;//     new-instance v0, Landroid/graphics/Paint;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/graphics/Paint;);
a=0;//     invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V
a=0;// 
a=0;//     .line 25
a=0;//     .local v0, "paint":Landroid/graphics/Paint;
a=0;//     #v0=(Reference,Landroid/graphics/Paint;);
a=0;//     const-string v2, "#BDC3C7"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setColor(I)V
a=0;// 
a=0;//     .line 26
a=0;//     sget-object v2, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;
a=0;// 
a=0;//     #v2=(Reference,Landroid/graphics/Paint$Style;);
a=0;//     invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V
a=0;// 
a=0;//     .line 28
a=0;//     new-instance v1, Landroid/graphics/RectF;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/graphics/RectF;);
a=0;//     invoke-virtual {p0}, Lcom/ffcs/inapppaylib/widget/BorderText;->getWidth()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     int-to-float v2, v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     invoke-virtual {p0}, Lcom/ffcs/inapppaylib/widget/BorderText;->getHeight()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     int-to-float v3, v3
a=0;// 
a=0;//     #v3=(Float);
a=0;//     invoke-direct {v1, v4, v4, v2, v3}, Landroid/graphics/RectF;-><init>(FFFF)V
a=0;// 
a=0;//     .line 29
a=0;//     .local v1, "rf":Landroid/graphics/RectF;
a=0;//     #v1=(Reference,Landroid/graphics/RectF;);
a=0;//     invoke-virtual {p1, v1, v5, v5, v0}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V
a=0;// 
a=0;//     .line 31
a=0;//     invoke-super {p0, p1}, Landroid/widget/TextView;->onDraw(Landroid/graphics/Canvas;)V
a=0;// 
a=0;//     .line 32
a=0;//     return-void
a=0;// .end method
}}
