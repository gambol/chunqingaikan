package com.twocloooo; class v { void a() { int a;
a=0;// .class public Lcom/twocloooo/v;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloooo/v;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcom/twocloooo/v;Landroid/content/Context;Lcom/twocloooo/ay;Ljava/lang/String;)V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-direct {p0, p1, p2, p3}, Lcom/twocloooo/v;->b(Landroid/content/Context;Lcom/twocloooo/ay;Ljava/lang/String;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private b(Landroid/content/Context;Lcom/twocloooo/ay;Ljava/lang/String;)V
a=0;//     .locals 1
a=0;// 
a=0;//     new-instance v0, Lcom/twocloooo/ae;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloooo/ae;);
a=0;//     invoke-direct {v0, p0, p2, p1, p3}, Lcom/twocloooo/ae;-><init>(Lcom/twocloooo/v;Lcom/twocloooo/ay;Landroid/content/Context;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloooo/ae;);
a=0;//     invoke-virtual {v0}, Lcom/twocloooo/ae;->start()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public a(Landroid/app/AlertDialog;Landroid/util/DisplayMetrics;Landroid/content/Context;Lcom/twocloooo/ay;Ljava/lang/String;)V
a=0;//     .locals 11
a=0;// 
a=0;//     iget v0, p2, Landroid/util/DisplayMetrics;->widthPixels:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     const/high16 v1, 0x43960000    # 300.0f
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     div-float v6, v0, v1
a=0;// 
a=0;//     #v6=(Float);
a=0;//     invoke-virtual {p1}, Landroid/app/AlertDialog;->getWindow()Landroid/view/Window;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Landroid/view/Window;);
a=0;//     invoke-virtual {v7}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/WindowManager$LayoutParams;);
a=0;//     const/high16 v1, 0x43960000    # 300.0f
a=0;// 
a=0;//     mul-float/2addr v1, v6
a=0;// 
a=0;//     #v1=(Float);
a=0;//     float-to-int v1, v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, v0, Landroid/view/WindowManager$LayoutParams;->width:I
a=0;// 
a=0;//     const/high16 v1, 0x3f800000    # 1.0f
a=0;// 
a=0;//     iput v1, v0, Landroid/view/WindowManager$LayoutParams;->alpha:F
a=0;// 
a=0;//     invoke-virtual {v7, v0}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V
a=0;// 
a=0;//     new-instance v8, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     #v8=(UninitRef,Landroid/widget/RelativeLayout;);
a=0;//     invoke-direct {v8, p3}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v8=(Reference,Landroid/widget/RelativeLayout;);
a=0;//     new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/widget/RelativeLayout$LayoutParams;);
a=0;//     const/high16 v1, 0x43960000    # 300.0f
a=0;// 
a=0;//     mul-float/2addr v1, v6
a=0;// 
a=0;//     #v1=(Float);
a=0;//     float-to-int v1, v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, -0x2
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     invoke-direct {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/RelativeLayout$LayoutParams;);
a=0;//     invoke-virtual {v8, v0}, Landroid/widget/RelativeLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     new-instance v0, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/widget/RelativeLayout;);
a=0;//     invoke-direct {v0, p3}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/RelativeLayout;);
a=0;//     new-instance v1, Landroid/widget/RelativeLayout$LayoutParams;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/widget/RelativeLayout$LayoutParams;);
a=0;//     const/high16 v2, 0x43960000    # 300.0f
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     mul-float/2addr v2, v6
a=0;// 
a=0;//     #v2=(Float);
a=0;//     float-to-int v2, v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const/4 v3, -0x2
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     invoke-direct {v1, v2, v3}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/RelativeLayout$LayoutParams;);
a=0;//     const v2, 0x732413
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->setId(I)V
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/16 v3, 0xa
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     const/16 v5, 0xa
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     invoke-virtual {v0, v2, v3, v4, v5}, Landroid/widget/RelativeLayout;->setPadding(IIII)V
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     const-string v1, "#FFFFFF"
a=0;// 
a=0;//     invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setBackgroundColor(I)V
a=0;// 
a=0;//     invoke-virtual {v8, v0}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     new-instance v1, Landroid/widget/ImageView;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/widget/ImageView;);
a=0;//     invoke-direct {v1, p3}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/ImageView;);
a=0;//     new-instance v2, Landroid/widget/RelativeLayout$LayoutParams;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/widget/RelativeLayout$LayoutParams;);
a=0;//     const/4 v3, -0x2
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     const/4 v4, -0x2
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     invoke-direct {v2, v3, v4}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/RelativeLayout$LayoutParams;);
a=0;//     const/16 v3, 0xf
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V
a=0;// 
a=0;//     const/16 v3, 0x9
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V
a=0;// 
a=0;//     const/16 v3, 0xa
a=0;// 
a=0;//     iput v3, v2, Landroid/widget/RelativeLayout$LayoutParams;->leftMargin:I
a=0;// 
a=0;//     const v3, 0x732414
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v1, v3}, Landroid/widget/ImageView;->setId(I)V
a=0;// 
a=0;//     invoke-virtual {p3}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     :try_start_0
a=0;//     #v3=(Reference,Landroid/content/res/AssetManager;);
a=0;//     const-string v4, "back.png"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v3}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v4=(Conflicted);
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     new-instance v2, Lcom/twocloooo/aa;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/twocloooo/aa;);
a=0;//     invoke-direct {v2, p0, p1}, Lcom/twocloooo/aa;-><init>(Lcom/twocloooo/v;Landroid/app/AlertDialog;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloooo/aa;);
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     new-instance v9, Landroid/widget/TextView;
a=0;// 
a=0;//     #v9=(UninitRef,Landroid/widget/TextView;);
a=0;//     invoke-direct {v9, p3}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v9=(Reference,Landroid/widget/TextView;);
a=0;//     new-instance v1, Landroid/widget/RelativeLayout$LayoutParams;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/widget/RelativeLayout$LayoutParams;);
a=0;//     const/4 v2, -0x2
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     const/4 v3, -0x2
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     invoke-direct {v1, v2, v3}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/RelativeLayout$LayoutParams;);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     const v3, 0x732414
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v1, v2, v3}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V
a=0;// 
a=0;//     const/4 v2, 0x5
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     iput v2, v1, Landroid/widget/RelativeLayout$LayoutParams;->leftMargin:I
a=0;// 
a=0;//     invoke-virtual {v9, v1}, Landroid/widget/TextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     const/high16 v1, 0x41800000    # 16.0f
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v9, v1}, Landroid/widget/TextView;->setTextSize(F)V
a=0;// 
a=0;//     const-string v1, "\u8fd4\u56de"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v9, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     const-string v1, "#0078FF"
a=0;// 
a=0;//     invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v9, v1}, Landroid/widget/TextView;->setTextColor(I)V
a=0;// 
a=0;//     invoke-virtual {v0, v9}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     new-instance v10, Landroid/widget/TextView;
a=0;// 
a=0;//     #v10=(UninitRef,Landroid/widget/TextView;);
a=0;//     invoke-direct {v10, p3}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v10=(Reference,Landroid/widget/TextView;);
a=0;//     new-instance v1, Landroid/widget/RelativeLayout$LayoutParams;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/widget/RelativeLayout$LayoutParams;);
a=0;//     const/4 v2, -0x2
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     const/4 v3, -0x2
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     invoke-direct {v1, v2, v3}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/RelativeLayout$LayoutParams;);
a=0;//     const/16 v2, 0xd
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V
a=0;// 
a=0;//     invoke-virtual {v10, v1}, Landroid/widget/TextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     const/high16 v1, 0x41800000    # 16.0f
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v10, v1}, Landroid/widget/TextView;->setTextSize(F)V
a=0;// 
a=0;//     iget-object v1, p4, Lcom/twocloooo/ay;->l:Ljava/lang/Integer;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     if-ne v1, v2, :cond_1
a=0;// 
a=0;//     const-string v1, "\u70b9\u51fb\u5b89\u88c5"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v10, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);
a=0;//     const/high16 v1, -0x1000000
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v10, v1}, Landroid/widget/TextView;->setTextColor(I)V
a=0;// 
a=0;//     invoke-virtual {v0, v10}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     new-instance v0, Lcom/twocloooo/ab;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloooo/ab;);
a=0;//     move-object v1, p0
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloooo/v;);
a=0;//     move-object v2, p1
a=0;// 
a=0;//     #v2=(Reference,Landroid/app/AlertDialog;);
a=0;//     move-object v3, p4
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloooo/ay;);
a=0;//     move-object v4, p3
a=0;// 
a=0;//     #v4=(Reference,Landroid/content/Context;);
a=0;//     move-object/from16 v5, p5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct/range {v0 .. v5}, Lcom/twocloooo/ab;-><init>(Lcom/twocloooo/v;Landroid/app/AlertDialog;Lcom/twocloooo/ay;Landroid/content/Context;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloooo/ab;);
a=0;//     invoke-virtual {v10, v0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     new-instance v0, Lcom/twocloooo/ac;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloooo/ac;);
a=0;//     invoke-direct {v0, p0, p1}, Lcom/twocloooo/ac;-><init>(Lcom/twocloooo/v;Landroid/app/AlertDialog;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloooo/ac;);
a=0;//     invoke-virtual {v9, v0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     new-instance v0, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/widget/RelativeLayout;);
a=0;//     invoke-direct {v0, p3}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/RelativeLayout;);
a=0;//     new-instance v1, Landroid/widget/RelativeLayout$LayoutParams;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/widget/RelativeLayout$LayoutParams;);
a=0;//     const/high16 v2, 0x43960000    # 300.0f
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     mul-float/2addr v2, v6
a=0;// 
a=0;//     #v2=(Float);
a=0;//     float-to-int v2, v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const/4 v3, -0x2
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     invoke-direct {v1, v2, v3}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/RelativeLayout$LayoutParams;);
a=0;//     const/4 v2, 0x3
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     const v3, 0x732413
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v1, v2, v3}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/16 v3, 0xa
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     const/16 v5, 0xa
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     invoke-virtual {v0, v2, v3, v4, v5}, Landroid/widget/RelativeLayout;->setPadding(IIII)V
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     const-string v1, "#FFFFFF"
a=0;// 
a=0;//     invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setBackgroundColor(I)V
a=0;// 
a=0;//     invoke-virtual {v8, v0}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     new-instance v6, Landroid/widget/TextView;
a=0;// 
a=0;//     #v6=(UninitRef,Landroid/widget/TextView;);
a=0;//     invoke-direct {v6, p3}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v6=(Reference,Landroid/widget/TextView;);
a=0;//     new-instance v1, Landroid/widget/RelativeLayout$LayoutParams;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/widget/RelativeLayout$LayoutParams;);
a=0;//     const/4 v2, -0x2
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     const/4 v3, -0x2
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     invoke-direct {v1, v2, v3}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/RelativeLayout$LayoutParams;);
a=0;//     invoke-virtual {v6, v1}, Landroid/widget/TextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     iget-object v1, p4, Lcom/twocloooo/ay;->j:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v1}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v6, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     const/high16 v1, 0x41800000    # 16.0f
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v6, v1}, Landroid/widget/TextView;->setTextSize(F)V
a=0;// 
a=0;//     const/high16 v1, -0x1000000
a=0;// 
a=0;//     invoke-virtual {v6, v1}, Landroid/widget/TextView;->setTextColor(I)V
a=0;// 
a=0;//     invoke-virtual {v0, v6}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     new-instance v0, Lcom/twocloooo/ad;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloooo/ad;);
a=0;//     move-object v1, p0
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloooo/v;);
a=0;//     move-object v2, p1
a=0;// 
a=0;//     #v2=(Reference,Landroid/app/AlertDialog;);
a=0;//     move-object v3, p4
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloooo/ay;);
a=0;//     move-object v4, p3
a=0;// 
a=0;//     #v4=(Reference,Landroid/content/Context;);
a=0;//     move-object/from16 v5, p5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct/range {v0 .. v5}, Lcom/twocloooo/ad;-><init>(Lcom/twocloooo/v;Landroid/app/AlertDialog;Lcom/twocloooo/ay;Landroid/content/Context;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloooo/ad;);
a=0;//     invoke-virtual {v6, v0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     invoke-virtual {v7, v8}, Landroid/view/Window;->setContentView(Landroid/view/View;)V
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v1=(Integer);v2=(One);v3=(Byte);v4=(Conflicted);v5=(PosByte);v6=(Float);
a=0;//     iget-object v1, p4, Lcom/twocloooo/ay;->l:Ljava/lang/Integer;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     const-string v1, "\u70b9\u51fb\u4e0b\u8f7d"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v10, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :catch_0
a=0;//     #v2=(Reference,Landroid/widget/RelativeLayout$LayoutParams;);v3=(Reference,Ujava/lang/Object;);v9=(Uninit);v10=(Uninit);
a=0;//     move-exception v3
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public a(Landroid/content/Context;Lcom/twocloooo/ay;Ljava/lang/String;)V
a=0;//     .locals 11
a=0;// 
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     #v10=(Null);
a=0;//     new-instance v0, Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/app/AlertDialog$Builder;);
a=0;//     invoke-direct {v0, p1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/AlertDialog$Builder;);
a=0;//     invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/app/AlertDialog;);
a=0;//     invoke-virtual {v3}, Landroid/app/AlertDialog;->getWindow()Landroid/view/Window;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/16 v1, 0x7d3
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     invoke-virtual {v0, v1}, Landroid/view/Window;->setType(I)V
a=0;// 
a=0;//     invoke-virtual {v3, v10}, Landroid/app/AlertDialog;->setCanceledOnTouchOutside(Z)V
a=0;// 
a=0;//     invoke-virtual {v3}, Landroid/app/AlertDialog;->show()V
a=0;// 
a=0;//     new-instance v2, Landroid/util/DisplayMetrics;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/util/DisplayMetrics;);
a=0;//     invoke-direct {v2}, Landroid/util/DisplayMetrics;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Landroid/util/DisplayMetrics;);
a=0;//     const-string v0, "window"
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/view/WindowManager;
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V
a=0;// 
a=0;//     iget-object v0, p2, Lcom/twocloooo/ay;->b:Ljava/lang/Integer;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     if-ne v0, v1, :cond_2
a=0;// 
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloooo/v;);
a=0;//     move-object v1, p2
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloooo/ay;);
a=0;//     move-object v4, p1
a=0;// 
a=0;//     #v4=(Reference,Landroid/content/Context;);
a=0;//     move-object v5, p3
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual/range {v0 .. v5}, Lcom/twocloooo/v;->a(Lcom/twocloooo/ay;Landroid/util/DisplayMetrics;Landroid/app/AlertDialog;Landroid/content/Context;Ljava/lang/String;)V
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     const-string v0, "xp_show"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iget-object v1, p2, Lcom/twocloooo/ay;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget-object v2, p2, Lcom/twocloooo/ay;->g:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {p1, v0, v1, v2, p3}, Lcom/twocloooo/bg;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v0, "al"
a=0;// 
a=0;//     const-string v1, ""
a=0;// 
a=0;//     invoke-static {p1, v0, v1}, Lcom/twocloooo/bm;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-instance v2, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v3, ""
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     const-string v1, ","
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     array-length v3, v1
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     move v0, v10
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Integer);
a=0;//     if-lt v0, v3, :cond_3
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);
a=0;//     iget-object v0, p2, Lcom/twocloooo/ay;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     move v1, v10
a=0;// 
a=0;//     :goto_2
a=0;//     #v0=(Conflicted);v1=(Integer);
a=0;//     invoke-virtual {v2}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lt v1, v0, :cond_4
a=0;// 
a=0;//     const-string v0, "al"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p1, v0, v1}, Lcom/twocloooo/bm;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v0, "stp"
a=0;// 
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {p3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "&xp_active&1"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {p1, v0, v1}, Lcom/twocloooo/bm;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Integer);v1=(One);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);
a=0;//     iget-object v0, p2, Lcom/twocloooo/ay;->b:Ljava/lang/Integer;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     move-object v4, p0
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloooo/v;);
a=0;//     move-object v5, v3
a=0;// 
a=0;//     #v5=(Reference,Landroid/app/AlertDialog;);
a=0;//     move-object v6, v2
a=0;// 
a=0;//     #v6=(Reference,Landroid/util/DisplayMetrics;);
a=0;//     move-object v7, p1
a=0;// 
a=0;//     #v7=(Reference,Landroid/content/Context;);
a=0;//     move-object v8, p2
a=0;// 
a=0;//     #v8=(Reference,Lcom/twocloooo/ay;);
a=0;//     move-object v9, p3
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual/range {v4 .. v9}, Lcom/twocloooo/v;->a(Landroid/app/AlertDialog;Landroid/util/DisplayMetrics;Landroid/content/Context;Lcom/twocloooo/ay;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_3
a=0;//     #v1=(Reference,[Ljava/lang/String;);v3=(Integer);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     aget-object v4, v1, v0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_4
a=0;//     #v1=(Integer);v3=(Reference,Ljava/lang/StringBuilder;);v4=(Conflicted);
a=0;//     invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-int/lit8 v0, v0, -0x1
a=0;// 
a=0;//     if-eq v1, v0, :cond_5
a=0;// 
a=0;//     const-string v0, ","
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     :cond_5
a=0;//     #v0=(Conflicted);
a=0;//     add-int/lit8 v0, v1, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method public a(Lcom/twocloooo/ay;Landroid/util/DisplayMetrics;Landroid/app/AlertDialog;Landroid/content/Context;Ljava/lang/String;)V
a=0;//     .locals 13
a=0;// 
a=0;//     iget-object v1, p1, Lcom/twocloooo/ay;->k:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p4
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v0, v1}, Lcom/twocloooo/ba;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, ""
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v2=(Boolean);v3=(Reference,Ljava/lang/String;);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);
a=0;//     invoke-static {v1}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iget v4, p2, Landroid/util/DisplayMetrics;->widthPixels:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     int-to-float v4, v4
a=0;// 
a=0;//     #v4=(Float);
a=0;//     invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     int-to-float v5, v5
a=0;// 
a=0;//     #v5=(Float);
a=0;//     const/high16 v6, 0x3f800000    # 1.0f
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     mul-float/2addr v5, v6
a=0;// 
a=0;//     div-float/2addr v4, v5
a=0;// 
a=0;//     invoke-virtual/range {p3 .. p3}, Landroid/app/AlertDialog;->getWindow()Landroid/view/Window;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Landroid/view/Window;);
a=0;//     invoke-virtual {v7}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Landroid/view/WindowManager$LayoutParams;);
a=0;//     int-to-float v6, v2
a=0;// 
a=0;//     #v6=(Float);
a=0;//     mul-float/2addr v6, v4
a=0;// 
a=0;//     float-to-int v6, v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     iput v6, v5, Landroid/view/WindowManager$LayoutParams;->width:I
a=0;// 
a=0;//     const/high16 v6, 0x3f800000    # 1.0f
a=0;// 
a=0;//     iput v6, v5, Landroid/view/WindowManager$LayoutParams;->alpha:F
a=0;// 
a=0;//     invoke-virtual {v7, v5}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V
a=0;// 
a=0;//     new-instance v8, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     #v8=(UninitRef,Landroid/widget/RelativeLayout;);
a=0;//     move-object/from16 v0, p4
a=0;// 
a=0;//     invoke-direct {v8, v0}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v8=(Reference,Landroid/widget/RelativeLayout;);
a=0;//     new-instance v5, Landroid/widget/RelativeLayout$LayoutParams;
a=0;// 
a=0;//     #v5=(UninitRef,Landroid/widget/RelativeLayout$LayoutParams;);
a=0;//     int-to-float v6, v2
a=0;// 
a=0;//     #v6=(Float);
a=0;//     mul-float/2addr v6, v4
a=0;// 
a=0;//     float-to-int v6, v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     const/4 v9, -0x2
a=0;// 
a=0;//     #v9=(Byte);
a=0;//     invoke-direct {v5, v6, v9}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     #v5=(Reference,Landroid/widget/RelativeLayout$LayoutParams;);
a=0;//     invoke-virtual {v8, v5}, Landroid/widget/RelativeLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     invoke-static {v1, v4, v4}, Lcom/twocloooo/ba;->a(Landroid/graphics/Bitmap;FF)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     new-instance v9, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     #v9=(UninitRef,Landroid/widget/RelativeLayout;);
a=0;//     move-object/from16 v0, p4
a=0;// 
a=0;//     invoke-direct {v9, v0}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v9=(Reference,Landroid/widget/RelativeLayout;);
a=0;//     new-instance v5, Landroid/widget/RelativeLayout$LayoutParams;
a=0;// 
a=0;//     #v5=(UninitRef,Landroid/widget/RelativeLayout$LayoutParams;);
a=0;//     int-to-float v6, v2
a=0;// 
a=0;//     #v6=(Float);
a=0;//     mul-float/2addr v6, v4
a=0;// 
a=0;//     float-to-int v6, v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     const/4 v10, -0x2
a=0;// 
a=0;//     #v10=(Byte);
a=0;//     invoke-direct {v5, v6, v10}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     #v5=(Reference,Landroid/widget/RelativeLayout$LayoutParams;);
a=0;//     const v6, 0x732409
a=0;// 
a=0;//     invoke-virtual {v9, v6}, Landroid/widget/RelativeLayout;->setId(I)V
a=0;// 
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     const/16 v10, 0xa
a=0;// 
a=0;//     #v10=(PosByte);
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     #v11=(Null);
a=0;//     const/16 v12, 0xa
a=0;// 
a=0;//     #v12=(PosByte);
a=0;//     invoke-virtual {v9, v6, v10, v11, v12}, Landroid/widget/RelativeLayout;->setPadding(IIII)V
a=0;// 
a=0;//     invoke-virtual {v9, v5}, Landroid/widget/RelativeLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     const-string v5, "#FFFFFF"
a=0;// 
a=0;//     invoke-static {v5}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v9, v5}, Landroid/widget/RelativeLayout;->setBackgroundColor(I)V
a=0;// 
a=0;//     new-instance v10, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     #v10=(UninitRef,Landroid/widget/RelativeLayout;);
a=0;//     move-object/from16 v0, p4
a=0;// 
a=0;//     invoke-direct {v10, v0}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v10=(Reference,Landroid/widget/RelativeLayout;);
a=0;//     new-instance v5, Landroid/widget/RelativeLayout$LayoutParams;
a=0;// 
a=0;//     #v5=(UninitRef,Landroid/widget/RelativeLayout$LayoutParams;);
a=0;//     int-to-float v2, v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     mul-float/2addr v2, v4
a=0;// 
a=0;//     float-to-int v2, v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     int-to-float v3, v3
a=0;// 
a=0;//     #v3=(Float);
a=0;//     mul-float/2addr v3, v4
a=0;// 
a=0;//     float-to-int v3, v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-direct {v5, v2, v3}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     #v5=(Reference,Landroid/widget/RelativeLayout$LayoutParams;);
a=0;//     const/4 v2, 0x3
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     const v3, 0x732409
a=0;// 
a=0;//     invoke-virtual {v5, v2, v3}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V
a=0;// 
a=0;//     const/16 v2, 0xe
a=0;// 
a=0;//     invoke-virtual {v5, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V
a=0;// 
a=0;//     invoke-virtual {v10, v5}, Landroid/widget/RelativeLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     new-instance v2, Landroid/graphics/drawable/BitmapDrawable;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/graphics/drawable/BitmapDrawable;);
a=0;//     invoke-direct {v2, v1}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/graphics/Bitmap;)V
a=0;// 
a=0;//     #v2=(Reference,Landroid/graphics/drawable/BitmapDrawable;);
a=0;//     invoke-virtual {v10, v2}, Landroid/widget/RelativeLayout;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     invoke-virtual {v8, v10}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     new-instance v1, Lcom/twocloooo/w;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloooo/w;);
a=0;//     move-object v2, p0
a=0;// 
a=0;//     move-object/from16 v3, p3
a=0;// 
a=0;//     #v3=(Reference,Landroid/app/AlertDialog;);
a=0;//     move-object v4, p1
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloooo/ay;);
a=0;//     move-object/from16 v5, p4
a=0;// 
a=0;//     move-object/from16 v6, p5
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct/range {v1 .. v6}, Lcom/twocloooo/w;-><init>(Lcom/twocloooo/v;Landroid/app/AlertDialog;Lcom/twocloooo/ay;Landroid/content/Context;Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloooo/w;);
a=0;//     invoke-virtual {v10, v1}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     new-instance v1, Landroid/widget/ImageView;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/widget/ImageView;);
a=0;//     move-object/from16 v0, p4
a=0;// 
a=0;//     invoke-direct {v1, v0}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/ImageView;);
a=0;//     new-instance v2, Landroid/widget/RelativeLayout$LayoutParams;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/widget/RelativeLayout$LayoutParams;);
a=0;//     const/4 v3, -0x2
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     const/4 v4, -0x2
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     invoke-direct {v2, v3, v4}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/RelativeLayout$LayoutParams;);
a=0;//     const/16 v3, 0xf
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V
a=0;// 
a=0;//     const/16 v3, 0x9
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V
a=0;// 
a=0;//     const/16 v3, 0xa
a=0;// 
a=0;//     iput v3, v2, Landroid/widget/RelativeLayout$LayoutParams;->leftMargin:I
a=0;// 
a=0;//     const v3, 0x73240a
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v1, v3}, Landroid/widget/ImageView;->setId(I)V
a=0;// 
a=0;//     invoke-virtual/range {p4 .. p4}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     :try_start_0
a=0;//     #v3=(Reference,Landroid/content/res/AssetManager;);
a=0;//     const-string v4, "back.png"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v3}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :goto_1
a=0;//     #v4=(Conflicted);
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     invoke-virtual {v9, v1}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     new-instance v2, Lcom/twocloooo/x;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/twocloooo/x;);
a=0;//     move-object/from16 v0, p3
a=0;// 
a=0;//     invoke-direct {v2, p0, v0}, Lcom/twocloooo/x;-><init>(Lcom/twocloooo/v;Landroid/app/AlertDialog;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloooo/x;);
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     new-instance v10, Landroid/widget/TextView;
a=0;// 
a=0;//     #v10=(UninitRef,Landroid/widget/TextView;);
a=0;//     move-object/from16 v0, p4
a=0;// 
a=0;//     invoke-direct {v10, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v10=(Reference,Landroid/widget/TextView;);
a=0;//     new-instance v1, Landroid/widget/RelativeLayout$LayoutParams;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/widget/RelativeLayout$LayoutParams;);
a=0;//     const/4 v2, -0x2
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     const/4 v3, -0x2
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     invoke-direct {v1, v2, v3}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/RelativeLayout$LayoutParams;);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     const v3, 0x73240a
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v1, v2, v3}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V
a=0;// 
a=0;//     const/4 v2, 0x5
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     iput v2, v1, Landroid/widget/RelativeLayout$LayoutParams;->leftMargin:I
a=0;// 
a=0;//     invoke-virtual {v10, v1}, Landroid/widget/TextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     const/high16 v1, 0x41800000    # 16.0f
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v10, v1}, Landroid/widget/TextView;->setTextSize(F)V
a=0;// 
a=0;//     const-string v1, "\u8fd4\u56de"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v10, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     const-string v1, "#0078FF"
a=0;// 
a=0;//     invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v10, v1}, Landroid/widget/TextView;->setTextColor(I)V
a=0;// 
a=0;//     invoke-virtual {v9, v10}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     new-instance v11, Landroid/widget/TextView;
a=0;// 
a=0;//     #v11=(UninitRef,Landroid/widget/TextView;);
a=0;//     move-object/from16 v0, p4
a=0;// 
a=0;//     invoke-direct {v11, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v11=(Reference,Landroid/widget/TextView;);
a=0;//     new-instance v1, Landroid/widget/RelativeLayout$LayoutParams;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/widget/RelativeLayout$LayoutParams;);
a=0;//     const/4 v2, -0x2
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     const/4 v3, -0x2
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     invoke-direct {v1, v2, v3}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/RelativeLayout$LayoutParams;);
a=0;//     const/16 v2, 0xd
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V
a=0;// 
a=0;//     invoke-virtual {v11, v1}, Landroid/widget/TextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     const/high16 v1, 0x41800000    # 16.0f
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v11, v1}, Landroid/widget/TextView;->setTextSize(F)V
a=0;// 
a=0;//     iget-object v1, p1, Lcom/twocloooo/ay;->l:Ljava/lang/Integer;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     if-ne v1, v2, :cond_3
a=0;// 
a=0;//     const-string v1, "\u70b9\u51fb\u5b89\u88c5"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v11, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     :cond_2
a=0;//     :goto_2
a=0;//     #v1=(Conflicted);
a=0;//     const/high16 v1, -0x1000000
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v11, v1}, Landroid/widget/TextView;->setTextColor(I)V
a=0;// 
a=0;//     invoke-virtual {v9, v11}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     new-instance v1, Lcom/twocloooo/y;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloooo/y;);
a=0;//     move-object v2, p0
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloooo/v;);
a=0;//     move-object/from16 v3, p3
a=0;// 
a=0;//     #v3=(Reference,Landroid/app/AlertDialog;);
a=0;//     move-object v4, p1
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloooo/ay;);
a=0;//     move-object/from16 v5, p4
a=0;// 
a=0;//     move-object/from16 v6, p5
a=0;// 
a=0;//     invoke-direct/range {v1 .. v6}, Lcom/twocloooo/y;-><init>(Lcom/twocloooo/v;Landroid/app/AlertDialog;Lcom/twocloooo/ay;Landroid/content/Context;Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloooo/y;);
a=0;//     invoke-virtual {v11, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     new-instance v1, Lcom/twocloooo/z;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloooo/z;);
a=0;//     move-object/from16 v0, p3
a=0;// 
a=0;//     invoke-direct {v1, p0, v0}, Lcom/twocloooo/z;-><init>(Lcom/twocloooo/v;Landroid/app/AlertDialog;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloooo/z;);
a=0;//     invoke-virtual {v10, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     invoke-virtual {v7, v8}, Landroid/view/Window;->setContentView(Landroid/view/View;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_3
a=0;//     #v1=(Integer);v2=(One);v3=(Byte);v4=(Conflicted);
a=0;//     iget-object v1, p1, Lcom/twocloooo/ay;->l:Ljava/lang/Integer;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-nez v1, :cond_2
a=0;// 
a=0;//     const-string v1, "\u70b9\u51fb\u4e0b\u8f7d"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v11, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :catch_0
a=0;//     #v2=(Reference,Landroid/widget/RelativeLayout$LayoutParams;);v3=(Reference,Ujava/lang/Object;);v11=(Null);
a=0;//     move-exception v3
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// .end method
}}
