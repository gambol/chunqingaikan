package net.slidingmenu.tools.d.a; class q { void a() { int a;
a=0;// .class public Lnet/slidingmenu/tools/d/a/q;
a=0;// .super Landroid/widget/ImageView;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private a:F
a=0;// 
a=0;// .field private b:F
a=0;// 
a=0;// .field private c:Landroid/view/ViewTreeObserver$OnPreDrawListener;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 1
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, p1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #p0=(Reference,Lnet/slidingmenu/tools/d/a/q;);
a=0;//     iput v0, p0, Lnet/slidingmenu/tools/d/a/q;->a:F
a=0;// 
a=0;//     iput v0, p0, Lnet/slidingmenu/tools/d/a/q;->b:F
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     iput-object v0, p0, Lnet/slidingmenu/tools/d/a/q;->c:Landroid/view/ViewTreeObserver$OnPreDrawListener;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lnet/slidingmenu/tools/d/a/q;)Landroid/view/ViewTreeObserver$OnPreDrawListener;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/d/a/q;->c:Landroid/view/ViewTreeObserver$OnPreDrawListener;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/ViewTreeObserver$OnPreDrawListener;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic b(Lnet/slidingmenu/tools/d/a/q;)F
a=0;//     .locals 1
a=0;// 
a=0;//     iget v0, p0, Lnet/slidingmenu/tools/d/a/q;->a:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic c(Lnet/slidingmenu/tools/d/a/q;)F
a=0;//     .locals 1
a=0;// 
a=0;//     iget v0, p0, Lnet/slidingmenu/tools/d/a/q;->b:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public setAccordionPivotWidth(F)V
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-virtual {p0, p1}, Lnet/slidingmenu/tools/d/a/q;->setScaleX(F)V
a=0;// 
a=0;//     invoke-virtual {p0}, Lnet/slidingmenu/tools/d/a/q;->getWidth()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     invoke-virtual {p0, v0}, Lnet/slidingmenu/tools/d/a/q;->setPivotX(F)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setAccordionPivotZero(F)V
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-virtual {p0, p1}, Lnet/slidingmenu/tools/d/a/q;->setScaleX(F)V
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0, v0}, Lnet/slidingmenu/tools/d/a/q;->setPivotX(F)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setCube(F)V
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-virtual {p0}, Lnet/slidingmenu/tools/d/a/q;->getWidth()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     mul-float/2addr v0, p1
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lnet/slidingmenu/tools/d/a/q;->setTranslationX(F)V
a=0;// 
a=0;//     const/high16 v0, 0x42b40000    # 90.0f
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     mul-float/2addr v0, p1
a=0;// 
a=0;//     #v0=(Float);
a=0;//     invoke-virtual {p0, v0}, Lnet/slidingmenu/tools/d/a/q;->setRotationY(F)V
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0, v0}, Lnet/slidingmenu/tools/d/a/q;->setPivotX(F)V
a=0;// 
a=0;//     invoke-virtual {p0}, Lnet/slidingmenu/tools/d/a/q;->getHeight()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     div-int/lit8 v0, v0, 0x2
a=0;// 
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     invoke-virtual {p0, v0}, Lnet/slidingmenu/tools/d/a/q;->setPivotY(F)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setCubeBack(F)V
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-virtual {p0}, Lnet/slidingmenu/tools/d/a/q;->getWidth()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     mul-float/2addr v0, p1
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lnet/slidingmenu/tools/d/a/q;->setTranslationX(F)V
a=0;// 
a=0;//     const/high16 v0, 0x42b40000    # 90.0f
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     mul-float/2addr v0, p1
a=0;// 
a=0;//     #v0=(Float);
a=0;//     invoke-virtual {p0, v0}, Lnet/slidingmenu/tools/d/a/q;->setRotationY(F)V
a=0;// 
a=0;//     invoke-virtual {p0}, Lnet/slidingmenu/tools/d/a/q;->getHeight()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     div-int/lit8 v0, v0, 0x2
a=0;// 
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     invoke-virtual {p0, v0}, Lnet/slidingmenu/tools/d/a/q;->setPivotY(F)V
a=0;// 
a=0;//     invoke-virtual {p0}, Lnet/slidingmenu/tools/d/a/q;->getWidth()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     invoke-virtual {p0, v0}, Lnet/slidingmenu/tools/d/a/q;->setPivotX(F)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setGlide(F)V
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-virtual {p0}, Lnet/slidingmenu/tools/d/a/q;->getWidth()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     mul-float/2addr v0, p1
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lnet/slidingmenu/tools/d/a/q;->setTranslationX(F)V
a=0;// 
a=0;//     const/high16 v0, 0x42b40000    # 90.0f
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     mul-float/2addr v0, p1
a=0;// 
a=0;//     #v0=(Float);
a=0;//     invoke-virtual {p0, v0}, Lnet/slidingmenu/tools/d/a/q;->setRotationY(F)V
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0, v0}, Lnet/slidingmenu/tools/d/a/q;->setPivotX(F)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setGlideBack(F)V
a=0;//     .locals 2
a=0;// 
a=0;//     invoke-virtual {p0}, Lnet/slidingmenu/tools/d/a/q;->getWidth()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     mul-float/2addr v0, p1
a=0;// 
a=0;//     const/high16 v1, 0x3fc00000    # 1.5f
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     mul-float/2addr v0, v1
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lnet/slidingmenu/tools/d/a/q;->setTranslationX(F)V
a=0;// 
a=0;//     const/high16 v0, 0x42340000    # 45.0f
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     mul-float/2addr v0, p1
a=0;// 
a=0;//     #v0=(Float);
a=0;//     invoke-virtual {p0, v0}, Lnet/slidingmenu/tools/d/a/q;->setRotationY(F)V
a=0;// 
a=0;//     const/high16 v0, 0x3f800000    # 1.0f
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/high16 v1, 0x40000000    # 2.0f
a=0;// 
a=0;//     div-float v1, p1, v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     sub-float/2addr v0, v1
a=0;// 
a=0;//     #v0=(Float);
a=0;//     invoke-virtual {p0, v0}, Lnet/slidingmenu/tools/d/a/q;->setScaleY(F)V
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0, v0}, Lnet/slidingmenu/tools/d/a/q;->setPivotX(F)V
a=0;// 
a=0;//     invoke-virtual {p0}, Lnet/slidingmenu/tools/d/a/q;->getHeight()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     div-int/lit8 v0, v0, 0x2
a=0;// 
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     invoke-virtual {p0, v0}, Lnet/slidingmenu/tools/d/a/q;->setPivotY(F)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setLeftGlideBack(F)V
a=0;//     .locals 2
a=0;// 
a=0;//     invoke-virtual {p0}, Lnet/slidingmenu/tools/d/a/q;->getWidth()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     mul-float/2addr v0, p1
a=0;// 
a=0;//     const/high16 v1, -0x40400000    # -1.5f
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     mul-float/2addr v0, v1
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lnet/slidingmenu/tools/d/a/q;->setTranslationX(F)V
a=0;// 
a=0;//     const/high16 v0, -0x3dcc0000    # -45.0f
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     mul-float/2addr v0, p1
a=0;// 
a=0;//     #v0=(Float);
a=0;//     invoke-virtual {p0, v0}, Lnet/slidingmenu/tools/d/a/q;->setRotationY(F)V
a=0;// 
a=0;//     const/high16 v0, 0x3f800000    # 1.0f
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/high16 v1, 0x40000000    # 2.0f
a=0;// 
a=0;//     div-float v1, p1, v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     sub-float/2addr v0, v1
a=0;// 
a=0;//     #v0=(Float);
a=0;//     invoke-virtual {p0, v0}, Lnet/slidingmenu/tools/d/a/q;->setScaleY(F)V
a=0;// 
a=0;//     invoke-virtual {p0}, Lnet/slidingmenu/tools/d/a/q;->getWidth()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     invoke-virtual {p0, v0}, Lnet/slidingmenu/tools/d/a/q;->setPivotX(F)V
a=0;// 
a=0;//     invoke-virtual {p0}, Lnet/slidingmenu/tools/d/a/q;->getHeight()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     div-int/lit8 v0, v0, 0x2
a=0;// 
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     invoke-virtual {p0, v0}, Lnet/slidingmenu/tools/d/a/q;->setPivotY(F)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setRotateDown(F)V
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-virtual {p0}, Lnet/slidingmenu/tools/d/a/q;->getWidth()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     mul-float/2addr v0, p1
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lnet/slidingmenu/tools/d/a/q;->setTranslationX(F)V
a=0;// 
a=0;//     const/high16 v0, 0x41a00000    # 20.0f
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     mul-float/2addr v0, p1
a=0;// 
a=0;//     #v0=(Float);
a=0;//     invoke-virtual {p0, v0}, Lnet/slidingmenu/tools/d/a/q;->setRotation(F)V
a=0;// 
a=0;//     invoke-virtual {p0}, Lnet/slidingmenu/tools/d/a/q;->getHeight()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     invoke-virtual {p0, v0}, Lnet/slidingmenu/tools/d/a/q;->setPivotY(F)V
a=0;// 
a=0;//     invoke-virtual {p0}, Lnet/slidingmenu/tools/d/a/q;->getWidth()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     div-int/lit8 v0, v0, 0x2
a=0;// 
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     invoke-virtual {p0, v0}, Lnet/slidingmenu/tools/d/a/q;->setPivotX(F)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setRotateUp(F)V
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-virtual {p0}, Lnet/slidingmenu/tools/d/a/q;->getWidth()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     mul-float/2addr v0, p1
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lnet/slidingmenu/tools/d/a/q;->setTranslationX(F)V
a=0;// 
a=0;//     const/high16 v0, -0x3e600000    # -20.0f
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     mul-float/2addr v0, p1
a=0;// 
a=0;//     #v0=(Float);
a=0;//     invoke-virtual {p0, v0}, Lnet/slidingmenu/tools/d/a/q;->setRotation(F)V
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0, v0}, Lnet/slidingmenu/tools/d/a/q;->setPivotY(F)V
a=0;// 
a=0;//     invoke-virtual {p0}, Lnet/slidingmenu/tools/d/a/q;->getWidth()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     div-int/lit8 v0, v0, 0x2
a=0;// 
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     invoke-virtual {p0, v0}, Lnet/slidingmenu/tools/d/a/q;->setPivotX(F)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setTableHorizontalPivotWidth(F)V
a=0;//     .locals 1
a=0;// 
a=0;//     const/high16 v0, -0x3d4c0000    # -90.0f
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     mul-float/2addr v0, p1
a=0;// 
a=0;//     #v0=(Float);
a=0;//     invoke-virtual {p0, v0}, Lnet/slidingmenu/tools/d/a/q;->setRotationY(F)V
a=0;// 
a=0;//     invoke-virtual {p0}, Lnet/slidingmenu/tools/d/a/q;->getWidth()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     invoke-virtual {p0, v0}, Lnet/slidingmenu/tools/d/a/q;->setPivotX(F)V
a=0;// 
a=0;//     invoke-virtual {p0}, Lnet/slidingmenu/tools/d/a/q;->getHeight()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     div-int/lit8 v0, v0, 0x2
a=0;// 
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     invoke-virtual {p0, v0}, Lnet/slidingmenu/tools/d/a/q;->setPivotY(F)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setTableHorizontalPivotZero(F)V
a=0;//     .locals 1
a=0;// 
a=0;//     const/high16 v0, 0x42b40000    # 90.0f
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     mul-float/2addr v0, p1
a=0;// 
a=0;//     #v0=(Float);
a=0;//     invoke-virtual {p0, v0}, Lnet/slidingmenu/tools/d/a/q;->setRotationY(F)V
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0, v0}, Lnet/slidingmenu/tools/d/a/q;->setPivotX(F)V
a=0;// 
a=0;//     invoke-virtual {p0}, Lnet/slidingmenu/tools/d/a/q;->getHeight()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     div-int/lit8 v0, v0, 0x2
a=0;// 
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     invoke-virtual {p0, v0}, Lnet/slidingmenu/tools/d/a/q;->setPivotY(F)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setTableVerticalPivotHeight(F)V
a=0;//     .locals 1
a=0;// 
a=0;//     const/high16 v0, 0x42b40000    # 90.0f
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     mul-float/2addr v0, p1
a=0;// 
a=0;//     #v0=(Float);
a=0;//     invoke-virtual {p0, v0}, Lnet/slidingmenu/tools/d/a/q;->setRotationX(F)V
a=0;// 
a=0;//     invoke-virtual {p0}, Lnet/slidingmenu/tools/d/a/q;->getWidth()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     div-int/lit8 v0, v0, 0x2
a=0;// 
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     invoke-virtual {p0, v0}, Lnet/slidingmenu/tools/d/a/q;->setPivotX(F)V
a=0;// 
a=0;//     invoke-virtual {p0}, Lnet/slidingmenu/tools/d/a/q;->getHeight()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     invoke-virtual {p0, v0}, Lnet/slidingmenu/tools/d/a/q;->setPivotY(F)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setTableVerticalPivotZero(F)V
a=0;//     .locals 1
a=0;// 
a=0;//     const/high16 v0, -0x3d4c0000    # -90.0f
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     mul-float/2addr v0, p1
a=0;// 
a=0;//     #v0=(Float);
a=0;//     invoke-virtual {p0, v0}, Lnet/slidingmenu/tools/d/a/q;->setRotationX(F)V
a=0;// 
a=0;//     invoke-virtual {p0}, Lnet/slidingmenu/tools/d/a/q;->getWidth()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     div-int/lit8 v0, v0, 0x2
a=0;// 
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     invoke-virtual {p0, v0}, Lnet/slidingmenu/tools/d/a/q;->setPivotX(F)V
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0, v0}, Lnet/slidingmenu/tools/d/a/q;->setPivotY(F)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setXFraction(F)V
a=0;//     .locals 2
a=0;// 
a=0;//     iput p1, p0, Lnet/slidingmenu/tools/d/a/q;->b:F
a=0;// 
a=0;//     invoke-virtual {p0}, Lnet/slidingmenu/tools/d/a/q;->getWidth()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/d/a/q;->c:Landroid/view/ViewTreeObserver$OnPreDrawListener;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/ViewTreeObserver$OnPreDrawListener;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     new-instance v0, Lnet/slidingmenu/tools/d/a/s;
a=0;// 
a=0;//     #v0=(UninitRef,Lnet/slidingmenu/tools/d/a/s;);
a=0;//     invoke-direct {v0, p0}, Lnet/slidingmenu/tools/d/a/s;-><init>(Lnet/slidingmenu/tools/d/a/q;)V
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/d/a/s;);
a=0;//     iput-object v0, p0, Lnet/slidingmenu/tools/d/a/q;->c:Landroid/view/ViewTreeObserver$OnPreDrawListener;
a=0;// 
a=0;//     invoke-virtual {p0}, Lnet/slidingmenu/tools/d/a/q;->getViewTreeObserver()Landroid/view/ViewTreeObserver;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/d/a/q;->c:Landroid/view/ViewTreeObserver$OnPreDrawListener;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/ViewTreeObserver$OnPreDrawListener;);
a=0;//     invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(Uninit);
a=0;//     invoke-virtual {p0}, Lnet/slidingmenu/tools/d/a/q;->getWidth()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     mul-float/2addr v0, p1
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lnet/slidingmenu/tools/d/a/q;->setTranslationX(F)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setYFraction(F)V
a=0;//     .locals 2
a=0;// 
a=0;//     iput p1, p0, Lnet/slidingmenu/tools/d/a/q;->a:F
a=0;// 
a=0;//     invoke-virtual {p0}, Lnet/slidingmenu/tools/d/a/q;->getHeight()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/d/a/q;->c:Landroid/view/ViewTreeObserver$OnPreDrawListener;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/ViewTreeObserver$OnPreDrawListener;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     new-instance v0, Lnet/slidingmenu/tools/d/a/r;
a=0;// 
a=0;//     #v0=(UninitRef,Lnet/slidingmenu/tools/d/a/r;);
a=0;//     invoke-direct {v0, p0}, Lnet/slidingmenu/tools/d/a/r;-><init>(Lnet/slidingmenu/tools/d/a/q;)V
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/d/a/r;);
a=0;//     iput-object v0, p0, Lnet/slidingmenu/tools/d/a/q;->c:Landroid/view/ViewTreeObserver$OnPreDrawListener;
a=0;// 
a=0;//     invoke-virtual {p0}, Lnet/slidingmenu/tools/d/a/q;->getViewTreeObserver()Landroid/view/ViewTreeObserver;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/d/a/q;->c:Landroid/view/ViewTreeObserver$OnPreDrawListener;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/ViewTreeObserver$OnPreDrawListener;);
a=0;//     invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(Uninit);
a=0;//     invoke-virtual {p0}, Lnet/slidingmenu/tools/d/a/q;->getHeight()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     mul-float/2addr v0, p1
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lnet/slidingmenu/tools/d/a/q;->setTranslationY(F)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setZoomFromCornerPivotHG(F)V
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-virtual {p0, p1}, Lnet/slidingmenu/tools/d/a/q;->setScaleX(F)V
a=0;// 
a=0;//     invoke-virtual {p0, p1}, Lnet/slidingmenu/tools/d/a/q;->setScaleY(F)V
a=0;// 
a=0;//     invoke-virtual {p0}, Lnet/slidingmenu/tools/d/a/q;->getWidth()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     invoke-virtual {p0, v0}, Lnet/slidingmenu/tools/d/a/q;->setPivotX(F)V
a=0;// 
a=0;//     invoke-virtual {p0}, Lnet/slidingmenu/tools/d/a/q;->getHeight()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     invoke-virtual {p0, v0}, Lnet/slidingmenu/tools/d/a/q;->setPivotY(F)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setZoomFromCornerPivotHeight(F)V
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-virtual {p0, p1}, Lnet/slidingmenu/tools/d/a/q;->setScaleX(F)V
a=0;// 
a=0;//     invoke-virtual {p0, p1}, Lnet/slidingmenu/tools/d/a/q;->setScaleY(F)V
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0, v0}, Lnet/slidingmenu/tools/d/a/q;->setPivotX(F)V
a=0;// 
a=0;//     invoke-virtual {p0}, Lnet/slidingmenu/tools/d/a/q;->getHeight()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     invoke-virtual {p0, v0}, Lnet/slidingmenu/tools/d/a/q;->setPivotY(F)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setZoomFromCornerPivotWidth(F)V
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-virtual {p0, p1}, Lnet/slidingmenu/tools/d/a/q;->setScaleX(F)V
a=0;// 
a=0;//     invoke-virtual {p0, p1}, Lnet/slidingmenu/tools/d/a/q;->setScaleY(F)V
a=0;// 
a=0;//     invoke-virtual {p0}, Lnet/slidingmenu/tools/d/a/q;->getWidth()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     invoke-virtual {p0, v0}, Lnet/slidingmenu/tools/d/a/q;->setPivotX(F)V
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0, v0}, Lnet/slidingmenu/tools/d/a/q;->setPivotY(F)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setZoomFromCornerPivotZero(F)V
a=0;//     .locals 1
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0, p1}, Lnet/slidingmenu/tools/d/a/q;->setScaleX(F)V
a=0;// 
a=0;//     invoke-virtual {p0, p1}, Lnet/slidingmenu/tools/d/a/q;->setScaleY(F)V
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lnet/slidingmenu/tools/d/a/q;->setPivotX(F)V
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lnet/slidingmenu/tools/d/a/q;->setPivotY(F)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setZoomSlideHorizontal(F)V
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-virtual {p0}, Lnet/slidingmenu/tools/d/a/q;->getWidth()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     mul-float/2addr v0, p1
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lnet/slidingmenu/tools/d/a/q;->setTranslationX(F)V
a=0;// 
a=0;//     invoke-virtual {p0}, Lnet/slidingmenu/tools/d/a/q;->getWidth()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     div-int/lit8 v0, v0, 0x2
a=0;// 
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     invoke-virtual {p0, v0}, Lnet/slidingmenu/tools/d/a/q;->setPivotX(F)V
a=0;// 
a=0;//     invoke-virtual {p0}, Lnet/slidingmenu/tools/d/a/q;->getHeight()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     div-int/lit8 v0, v0, 0x2
a=0;// 
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     invoke-virtual {p0, v0}, Lnet/slidingmenu/tools/d/a/q;->setPivotY(F)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setZoomSlideVertical(F)V
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-virtual {p0}, Lnet/slidingmenu/tools/d/a/q;->getHeight()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     mul-float/2addr v0, p1
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lnet/slidingmenu/tools/d/a/q;->setTranslationY(F)V
a=0;// 
a=0;//     invoke-virtual {p0}, Lnet/slidingmenu/tools/d/a/q;->getWidth()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     div-int/lit8 v0, v0, 0x2
a=0;// 
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     invoke-virtual {p0, v0}, Lnet/slidingmenu/tools/d/a/q;->setPivotX(F)V
a=0;// 
a=0;//     invoke-virtual {p0}, Lnet/slidingmenu/tools/d/a/q;->getHeight()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     div-int/lit8 v0, v0, 0x2
a=0;// 
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     invoke-virtual {p0, v0}, Lnet/slidingmenu/tools/d/a/q;->setPivotY(F)V
a=0;// 
a=0;//     return-void
a=0;// .end method
}}
