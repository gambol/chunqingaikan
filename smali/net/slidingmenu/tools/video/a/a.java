package net.slidingmenu.tools.video.a; class a { void a() { int a;
a=0;// .class public abstract Lnet/slidingmenu/tools/video/a/a;
a=0;// .super Landroid/widget/RelativeLayout;
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/view/View$OnClickListener;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static e:[F
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field protected a:Landroid/widget/ImageButton;
a=0;// 
a=0;// .field protected b:Lnet/slidingmenu/tools/d/a/p;
a=0;// 
a=0;// .field protected c:Landroid/widget/TextView;
a=0;// 
a=0;// .field protected d:Z
a=0;// 
a=0;// .field private final f:I
a=0;// 
a=0;// .field private final g:I
a=0;// 
a=0;// .field private h:Landroid/content/Context;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     const/16 v0, 0x8
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     new-array v0, v0, [F
a=0;// 
a=0;//     #v0=(Reference,[F);
a=0;//     fill-array-data v0, :array_0
a=0;// 
a=0;//     sput-object v0, Lnet/slidingmenu/tools/video/a/a;->e:[F
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     :array_0
a=0;//     .array-data 4
a=0;//         0x41200000    # 10.0f
a=0;//         0x41200000    # 10.0f
a=0;//         0x41200000    # 10.0f
a=0;//         0x41200000    # 10.0f
a=0;//         0x41200000    # 10.0f
a=0;//         0x41200000    # 10.0f
a=0;//         0x41200000    # 10.0f
a=0;//         0x41200000    # 10.0f
a=0;//     .end array-data
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 3
a=0;// 
a=0;//     invoke-direct {p0, p1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #p0=(Reference,Lnet/slidingmenu/tools/video/a/a;);
a=0;//     const/16 v0, 0x3e9
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     iput v0, p0, Lnet/slidingmenu/tools/video/a/a;->f:I
a=0;// 
a=0;//     const/16 v0, 0x3eb
a=0;// 
a=0;//     iput v0, p0, Lnet/slidingmenu/tools/video/a/a;->g:I
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lnet/slidingmenu/tools/video/a/a;->d:Z
a=0;// 
a=0;//     iput-object p1, p0, Lnet/slidingmenu/tools/video/a/a;->h:Landroid/content/Context;
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-direct {p0}, Lnet/slidingmenu/tools/video/a/a;->d()V
a=0;// 
a=0;//     invoke-direct {p0}, Lnet/slidingmenu/tools/video/a/a;->f()V
a=0;// 
a=0;//     invoke-direct {p0}, Lnet/slidingmenu/tools/video/a/a;->e()V
a=0;// 
a=0;//     new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/widget/RelativeLayout$LayoutParams;);
a=0;//     const/4 v1, -0x1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     const/4 v2, -0x1
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     invoke-direct {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/RelativeLayout$LayoutParams;);
a=0;//     invoke-virtual {p0, v0}, Lnet/slidingmenu/tools/video/a/a;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private a(F)I
a=0;//     .locals 2
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/video/a/a;->h:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v0, p1, v1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     float-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method private d()V
a=0;//     .locals 3
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-static {}, Lnet/slidingmenu/tools/d/a/c;->b()Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Bitmap;);
a=0;//     new-instance v1, Landroid/widget/ImageButton;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/widget/ImageButton;);
a=0;//     iget-object v2, p0, Lnet/slidingmenu/tools/video/a/a;->h:Landroid/content/Context;
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v1, v2}, Landroid/widget/ImageButton;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/ImageButton;);
a=0;//     iput-object v1, p0, Lnet/slidingmenu/tools/video/a/a;->a:Landroid/widget/ImageButton;
a=0;// 
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/video/a/a;->a:Landroid/widget/ImageButton;
a=0;// 
a=0;//     const/16 v2, 0x3e9
a=0;// 
a=0;//     #v2=(PosShort);
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/ImageButton;->setId(I)V
a=0;// 
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/video/a/a;->a:Landroid/widget/ImageButton;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/widget/ImageButton;->setImageBitmap(Landroid/graphics/Bitmap;)V
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/a/a;->a:Landroid/widget/ImageButton;
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setBackgroundColor(I)V
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/a/a;->a:Landroid/widget/ImageButton;
a=0;// 
a=0;//     sget-object v1, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/ImageView$ScaleType;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setScaleType(Landroid/widget/ImageView$ScaleType;)V
a=0;// 
a=0;//     const/high16 v0, 0x42480000    # 50.0f
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-direct {p0, v0}, Lnet/slidingmenu/tools/video/a/a;->a(F)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     new-instance v1, Landroid/widget/RelativeLayout$LayoutParams;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/widget/RelativeLayout$LayoutParams;);
a=0;//     invoke-direct {v1, v0, v0}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/RelativeLayout$LayoutParams;);
a=0;//     const/16 v0, 0xa
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {v1, v0}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V
a=0;// 
a=0;//     const/16 v0, 0x9
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V
a=0;// 
a=0;//     const/high16 v0, 0x41000000    # 8.0f
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-direct {p0, v0}, Lnet/slidingmenu/tools/video/a/a;->a(F)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     iput v0, v1, Landroid/widget/RelativeLayout$LayoutParams;->topMargin:I
a=0;// 
a=0;//     const/high16 v0, 0x41000000    # 8.0f
a=0;// 
a=0;//     invoke-direct {p0, v0}, Lnet/slidingmenu/tools/video/a/a;->a(F)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     iput v0, v1, Landroid/widget/RelativeLayout$LayoutParams;->leftMargin:I
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/a/a;->a:Landroid/widget/ImageButton;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/ImageButton;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/a/a;->a:Landroid/widget/ImageButton;
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lnet/slidingmenu/tools/video/a/a;->addView(Landroid/view/View;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private e()V
a=0;//     .locals 2
a=0;// 
a=0;//     :try_start_0
a=0;//     new-instance v0, Lnet/slidingmenu/tools/d/a/p;
a=0;// 
a=0;//     #v0=(UninitRef,Lnet/slidingmenu/tools/d/a/p;);
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/video/a/a;->h:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v0, v1}, Lnet/slidingmenu/tools/d/a/p;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/d/a/p;);
a=0;//     iput-object v0, p0, Lnet/slidingmenu/tools/video/a/a;->b:Lnet/slidingmenu/tools/d/a/p;
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/a/a;->b:Lnet/slidingmenu/tools/d/a/p;
a=0;// 
a=0;//     const/16 v1, 0x3eb
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     invoke-virtual {v0, v1}, Lnet/slidingmenu/tools/d/a/p;->setId(I)V
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/a/a;->b:Lnet/slidingmenu/tools/d/a/p;
a=0;// 
a=0;//     sget-object v1, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/ImageView$ScaleType;);
a=0;//     invoke-virtual {v0, v1}, Lnet/slidingmenu/tools/d/a/p;->setScaleType(Landroid/widget/ImageView$ScaleType;)V
a=0;// 
a=0;//     const/high16 v0, 0x42000000    # 32.0f
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-direct {p0, v0}, Lnet/slidingmenu/tools/video/a/a;->a(F)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     new-instance v1, Landroid/widget/RelativeLayout$LayoutParams;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/widget/RelativeLayout$LayoutParams;);
a=0;//     invoke-direct {v1, v0, v0}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/RelativeLayout$LayoutParams;);
a=0;//     const/16 v0, 0xc
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {v1, v0}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V
a=0;// 
a=0;//     const/16 v0, 0xb
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V
a=0;// 
a=0;//     const/high16 v0, 0x41000000    # 8.0f
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-direct {p0, v0}, Lnet/slidingmenu/tools/video/a/a;->a(F)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     iput v0, v1, Landroid/widget/RelativeLayout$LayoutParams;->bottomMargin:I
a=0;// 
a=0;//     const/high16 v0, 0x41000000    # 8.0f
a=0;// 
a=0;//     invoke-direct {p0, v0}, Lnet/slidingmenu/tools/video/a/a;->a(F)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     iput v0, v1, Landroid/widget/RelativeLayout$LayoutParams;->rightMargin:I
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/a/a;->b:Lnet/slidingmenu/tools/d/a/p;
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/d/a/p;);
a=0;//     invoke-virtual {v0, v1}, Lnet/slidingmenu/tools/d/a/p;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/a/a;->b:Lnet/slidingmenu/tools/d/a/p;
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lnet/slidingmenu/tools/video/a/a;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/a/a;->b:Lnet/slidingmenu/tools/d/a/p;
a=0;// 
a=0;//     new-instance v1, Lnet/slidingmenu/tools/video/a/b;
a=0;// 
a=0;//     #v1=(UninitRef,Lnet/slidingmenu/tools/video/a/b;);
a=0;//     invoke-direct {v1, p0}, Lnet/slidingmenu/tools/video/a/b;-><init>(Lnet/slidingmenu/tools/video/a/a;)V
a=0;// 
a=0;//     #v1=(Reference,Lnet/slidingmenu/tools/video/a/b;);
a=0;//     invoke-virtual {v0, v1}, Lnet/slidingmenu/tools/d/a/p;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private f()V
a=0;//     .locals 5
a=0;// 
a=0;//     :try_start_0
a=0;//     new-instance v0, Landroid/widget/TextView;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/widget/TextView;);
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/video/a/a;->h:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v0, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/TextView;);
a=0;//     iput-object v0, p0, Lnet/slidingmenu/tools/video/a/a;->c:Landroid/widget/TextView;
a=0;// 
a=0;//     new-instance v0, Landroid/graphics/drawable/ShapeDrawable;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/graphics/drawable/ShapeDrawable;);
a=0;//     new-instance v1, Landroid/graphics/drawable/shapes/RoundRectShape;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/graphics/drawable/shapes/RoundRectShape;);
a=0;//     sget-object v2, Lnet/slidingmenu/tools/video/a/a;->e:[F
a=0;// 
a=0;//     #v2=(Reference,[F);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-direct {v1, v2, v3, v4}, Landroid/graphics/drawable/shapes/RoundRectShape;-><init>([FLandroid/graphics/RectF;[F)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/drawable/shapes/RoundRectShape;);
a=0;//     invoke-direct {v0, v1}, Landroid/graphics/drawable/ShapeDrawable;-><init>(Landroid/graphics/drawable/shapes/Shape;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/drawable/ShapeDrawable;);
a=0;//     invoke-virtual {v0}, Landroid/graphics/drawable/ShapeDrawable;->getPaint()Landroid/graphics/Paint;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "#D82c2c38"
a=0;// 
a=0;//     invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setColor(I)V
a=0;// 
a=0;//     const/high16 v1, 0x41000000    # 8.0f
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-direct {p0, v1}, Lnet/slidingmenu/tools/video/a/a;->a(F)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     invoke-virtual {v0, v1, v1, v1, v1}, Landroid/graphics/drawable/ShapeDrawable;->setPadding(IIII)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
a=0;// 
a=0;//     :try_start_1
a=0;//     sget v1, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     const/16 v2, 0xf
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-le v1, v2, :cond_0
a=0;// 
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/video/a/a;->c:Landroid/widget/TextView;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/TextView;);
a=0;//     invoke-virtual {v1, v0}, Landroid/widget/TextView;->setBackground(Landroid/graphics/drawable/Drawable;)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     :goto_0
a=0;//     :try_start_2
a=0;//     #v2=(Integer);
a=0;//     new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/widget/RelativeLayout$LayoutParams;);
a=0;//     const/4 v1, -0x2
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     const/4 v2, -0x2
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     invoke-direct {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/RelativeLayout$LayoutParams;);
a=0;//     const/16 v1, 0xa
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V
a=0;// 
a=0;//     const/16 v1, 0xb
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V
a=0;// 
a=0;//     const/high16 v1, 0x41400000    # 12.0f
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-direct {p0, v1}, Lnet/slidingmenu/tools/video/a/a;->a(F)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     iput v1, v0, Landroid/widget/RelativeLayout$LayoutParams;->rightMargin:I
a=0;// 
a=0;//     iput v1, v0, Landroid/widget/RelativeLayout$LayoutParams;->topMargin:I
a=0;// 
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/video/a/a;->c:Landroid/widget/TextView;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/TextView;);
a=0;//     invoke-virtual {p0, v1, v0}, Lnet/slidingmenu/tools/video/a/a;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/a/a;->c:Landroid/widget/TextView;
a=0;// 
a=0;//     const/16 v1, 0x8
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
a=0;// 
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_0
a=0;//     :try_start_3
a=0;//     #v1=(Integer);v2=(PosByte);v3=(Null);v4=(Null);
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/video/a/a;->c:Landroid/widget/TextView;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/TextView;);
a=0;//     invoke-virtual {v1, v0}, Landroid/widget/TextView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;//     :try_end_3
a=0;//     .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v1=(Conflicted);v2=(Integer);
a=0;//     move-exception v1
a=0;// 
a=0;//     :try_start_4
a=0;//     #v1=(Reference,Ljava/lang/Exception;);
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/video/a/a;->c:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/widget/TextView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;//     :try_end_4
a=0;//     .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_1
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public a()V
a=0;//     .locals 1
a=0;// 
a=0;//     const/4 v0, 0x4
a=0;// 
a=0;//     :try_start_0
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {p0, v0}, Lnet/slidingmenu/tools/video/a/a;->setVisibility(I)V
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-virtual {p0, v0}, Lnet/slidingmenu/tools/video/a/a;->setFocusable(Z)V
a=0;// 
a=0;//     invoke-virtual {p0}, Lnet/slidingmenu/tools/video/a/a;->requestFocus()Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(PosByte);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public b()V
a=0;//     .locals 2
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-virtual {p0}, Lnet/slidingmenu/tools/video/a/a;->c()V
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/a/a;->a:Landroid/widget/ImageButton;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/ImageButton;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setVisibility(I)V
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/a/a;->c:Landroid/widget/TextView;
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/a/a;->b:Lnet/slidingmenu/tools/d/a/p;
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lnet/slidingmenu/tools/d/a/p;->setVisibility(I)V
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0, v0}, Lnet/slidingmenu/tools/video/a/a;->setVisibility(I)V
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lnet/slidingmenu/tools/video/a/a;->setFocusable(Z)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/Exception;);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected c()V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-virtual {p0}, Lnet/slidingmenu/tools/video/a/a;->requestLayout()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public getView()Landroid/view/View;
a=0;//     .locals 0
a=0;// 
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public onKeyDown(ILandroid/view/KeyEvent;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-super {p0, p1, p2}, Landroid/widget/RelativeLayout;->onKeyDown(ILandroid/view/KeyEvent;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public onTouchEvent(Landroid/view/MotionEvent;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-super {p0, p1}, Landroid/widget/RelativeLayout;->onTouchEvent(Landroid/view/MotionEvent;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setOnCloseBtnListener(Landroid/view/View$OnClickListener;)V
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/a/a;->a:Landroid/widget/ImageButton;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/ImageButton;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/a/a;->a:Landroid/widget/ImageButton;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setTime(I)V
a=0;//     .locals 2
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/a/a;->c:Landroid/widget/TextView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/TextView;);
a=0;//     invoke-virtual {v0}, Landroid/widget/TextView;->getVisibility()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/a/a;->c:Landroid/widget/TextView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/TextView;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/a/a;->c:Landroid/widget/TextView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/TextView;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "<font color=\'white\'>\u89c6\u9891\u8fd8\u6709 </font><font color=\'#DC193F\'>"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "</font>"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "<font color=\'white\'> \u79d2\u7ed3\u675f</font>"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/video/a/a;->c:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-static {v0}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_0
a=0;// .end method
}}
