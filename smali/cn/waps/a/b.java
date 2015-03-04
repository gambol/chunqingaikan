package cn.waps.a; class b { void a() { int a;
a=0;// .class public Lcn/waps/a/b;
a=0;// .super Landroid/app/Dialog;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field a:Landroid/content/Context;
a=0;// 
a=0;// .field private b:Lcn/waps/a/g;
a=0;// 
a=0;// .field private c:Landroid/util/DisplayMetrics;
a=0;// 
a=0;// .field private d:Lcn/waps/a/c;
a=0;// 
a=0;// .field private e:Lcom/tencent/mm/sdk/openapi/IWXAPI;
a=0;// 
a=0;// .field private f:Z
a=0;// 
a=0;// .field private g:I
a=0;// 
a=0;// .field private h:Z
a=0;// 
a=0;// .field private i:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method protected constructor <init>(Landroid/content/Context;Lcom/tencent/mm/sdk/openapi/IWXAPI;IZ[I)V
a=0;//     .locals 3
a=0;// 
a=0;//     invoke-direct {p0, p1}, Landroid/app/Dialog;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #p0=(Reference,Lcn/waps/a/b;);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcn/waps/a/b;->f:Z
a=0;// 
a=0;//     iput p3, p0, Lcn/waps/a/b;->g:I
a=0;// 
a=0;//     iput-object p2, p0, Lcn/waps/a/b;->e:Lcom/tencent/mm/sdk/openapi/IWXAPI;
a=0;// 
a=0;//     iput-boolean p4, p0, Lcn/waps/a/b;->h:Z
a=0;// 
a=0;//     invoke-static {p1}, Lcn/waps/a/g;->a(Landroid/content/Context;)Lcn/waps/a/g;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcn/waps/a/g;);
a=0;//     iput-object v0, p0, Lcn/waps/a/b;->b:Lcn/waps/a/g;
a=0;// 
a=0;//     new-instance v0, Landroid/util/DisplayMetrics;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/util/DisplayMetrics;);
a=0;//     invoke-direct {v0}, Landroid/util/DisplayMetrics;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/util/DisplayMetrics;);
a=0;//     iput-object v0, p0, Lcn/waps/a/b;->c:Landroid/util/DisplayMetrics;
a=0;// 
a=0;//     move-object v0, p1
a=0;// 
a=0;//     check-cast v0, Landroid/app/Activity;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcn/waps/a/b;->c:Landroid/util/DisplayMetrics;
a=0;// 
a=0;//     #v1=(Reference,Landroid/util/DisplayMetrics;);
a=0;//     invoke-virtual {v0, v1}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0, v0}, Lcn/waps/a/b;->setCanceledOnTouchOutside(Z)V
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/a/b;->c:Landroid/util/DisplayMetrics;
a=0;// 
a=0;//     #v0=(Reference,Landroid/util/DisplayMetrics;);
a=0;//     iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget-object v1, p0, Lcn/waps/a/b;->c:Landroid/util/DisplayMetrics;
a=0;// 
a=0;//     iget v1, v1, Landroid/util/DisplayMetrics;->heightPixels:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     iput v0, p0, Lcn/waps/a/b;->i:I
a=0;// 
a=0;//     new-instance v0, Lcn/waps/a/c;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/waps/a/c;);
a=0;//     iget-object v1, p0, Lcn/waps/a/b;->b:Lcn/waps/a/g;
a=0;// 
a=0;//     #v1=(Reference,Lcn/waps/a/g;);
a=0;//     invoke-virtual {v1, p5}, Lcn/waps/a/g;->a([I)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v2, p0, Lcn/waps/a/b;->c:Landroid/util/DisplayMetrics;
a=0;// 
a=0;//     #v2=(Reference,Landroid/util/DisplayMetrics;);
a=0;//     invoke-direct {v0, p1, v1, v2}, Lcn/waps/a/c;-><init>(Landroid/content/Context;Ljava/util/List;Landroid/util/DisplayMetrics;)V
a=0;// 
a=0;//     #v0=(Reference,Lcn/waps/a/c;);
a=0;//     iput-object v0, p0, Lcn/waps/a/b;->d:Lcn/waps/a/c;
a=0;// 
a=0;//     iput-object p1, p0, Lcn/waps/a/b;->a:Landroid/content/Context;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected a(Landroid/content/Context;)Landroid/widget/LinearLayout;
a=0;//     .locals 10
a=0;// 
a=0;//     const/4 v9, 0x1
a=0;// 
a=0;//     #v9=(One);
a=0;//     const/4 v8, -0x1
a=0;// 
a=0;//     #v8=(Byte);
a=0;//     const/4 v7, -0x2
a=0;// 
a=0;//     #v7=(Byte);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     new-instance v0, Landroid/widget/LinearLayout;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/widget/LinearLayout;);
a=0;//     invoke-direct {v0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/LinearLayout;);
a=0;//     const/4 v1, 0x7
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     iget-object v2, p0, Lcn/waps/a/b;->c:Landroid/util/DisplayMetrics;
a=0;// 
a=0;//     #v2=(Reference,Landroid/util/DisplayMetrics;);
a=0;//     invoke-static {p1, v1, v2}, Lcn/waps/a/o;->a(Landroid/content/Context;ILandroid/util/DisplayMetrics;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v5, v1, v5, v1}, Landroid/widget/LinearLayout;->setPadding(IIII)V
a=0;// 
a=0;//     const/4 v2, 0x4
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     iget-object v3, p0, Lcn/waps/a/b;->c:Landroid/util/DisplayMetrics;
a=0;// 
a=0;//     #v3=(Reference,Landroid/util/DisplayMetrics;);
a=0;//     invoke-static {p1, v2, v3}, Lcn/waps/a/o;->a(Landroid/content/Context;ILandroid/util/DisplayMetrics;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const/16 v3, 0x8
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     new-array v3, v3, [F
a=0;// 
a=0;//     #v3=(Reference,[F);
a=0;//     int-to-float v4, v2
a=0;// 
a=0;//     #v4=(Float);
a=0;//     aput v4, v3, v5
a=0;// 
a=0;//     int-to-float v4, v2
a=0;// 
a=0;//     aput v4, v3, v9
a=0;// 
a=0;//     const/4 v4, 0x2
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     int-to-float v5, v2
a=0;// 
a=0;//     #v5=(Float);
a=0;//     aput v5, v3, v4
a=0;// 
a=0;//     const/4 v4, 0x3
a=0;// 
a=0;//     int-to-float v5, v2
a=0;// 
a=0;//     aput v5, v3, v4
a=0;// 
a=0;//     const/4 v4, 0x4
a=0;// 
a=0;//     int-to-float v5, v2
a=0;// 
a=0;//     aput v5, v3, v4
a=0;// 
a=0;//     const/4 v4, 0x5
a=0;// 
a=0;//     int-to-float v5, v2
a=0;// 
a=0;//     aput v5, v3, v4
a=0;// 
a=0;//     const/4 v4, 0x6
a=0;// 
a=0;//     int-to-float v5, v2
a=0;// 
a=0;//     aput v5, v3, v4
a=0;// 
a=0;//     const/4 v4, 0x7
a=0;// 
a=0;//     int-to-float v2, v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     aput v2, v3, v4
a=0;// 
a=0;//     new-instance v2, Landroid/graphics/drawable/ShapeDrawable;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/graphics/drawable/ShapeDrawable;);
a=0;//     new-instance v4, Landroid/graphics/drawable/shapes/RoundRectShape;
a=0;// 
a=0;//     #v4=(UninitRef,Landroid/graphics/drawable/shapes/RoundRectShape;);
a=0;//     invoke-direct {v4, v3, v6, v6}, Landroid/graphics/drawable/shapes/RoundRectShape;-><init>([FLandroid/graphics/RectF;[F)V
a=0;// 
a=0;//     #v4=(Reference,Landroid/graphics/drawable/shapes/RoundRectShape;);
a=0;//     invoke-direct {v2, v4}, Landroid/graphics/drawable/ShapeDrawable;-><init>(Landroid/graphics/drawable/shapes/Shape;)V
a=0;// 
a=0;//     #v2=(Reference,Landroid/graphics/drawable/ShapeDrawable;);
a=0;//     invoke-virtual {v2}, Landroid/graphics/drawable/ShapeDrawable;->getPaint()Landroid/graphics/Paint;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, "#FFFFFFFF"
a=0;// 
a=0;//     invoke-static {v4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Landroid/graphics/Paint;->setColor(I)V
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     new-instance v2, Landroid/widget/LinearLayout;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/widget/LinearLayout;);
a=0;//     invoke-direct {v2, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/LinearLayout;);
a=0;//     new-instance v3, Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     #v3=(UninitRef,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     invoke-direct {v3, v8, v8}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     const/16 v3, 0x11
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/LinearLayout;->setGravity(I)V
a=0;// 
a=0;//     invoke-virtual {v2, v1, v1, v1, v1}, Landroid/widget/LinearLayout;->setPadding(IIII)V
a=0;// 
a=0;//     new-instance v1, Landroid/widget/LinearLayout;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/widget/LinearLayout;);
a=0;//     invoke-direct {v1, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/LinearLayout;);
a=0;//     const/16 v3, 0x11
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Landroid/widget/LinearLayout;->setGravity(I)V
a=0;// 
a=0;//     new-instance v3, Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     #v3=(UninitRef,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     invoke-direct {v3, v7, v7}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     new-instance v3, Landroid/widget/ProgressBar;
a=0;// 
a=0;//     #v3=(UninitRef,Landroid/widget/ProgressBar;);
a=0;//     const v4, 0x1010288
a=0;// 
a=0;//     invoke-direct {v3, p1, v6, v4}, Landroid/widget/ProgressBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
a=0;// 
a=0;//     #v3=(Reference,Landroid/widget/ProgressBar;);
a=0;//     invoke-virtual {v3, v9}, Landroid/widget/ProgressBar;->setEnabled(Z)V
a=0;// 
a=0;//     new-instance v4, Landroid/widget/TextView;
a=0;// 
a=0;//     #v4=(UninitRef,Landroid/widget/TextView;);
a=0;//     invoke-direct {v4, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v4=(Reference,Landroid/widget/TextView;);
a=0;//     const-string v5, "\u914d\u7f6e\u5206\u4eab\u6570\u636e\u4e2d\uff0c\u8bf7\u7a0d\u540e"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     const/high16 v5, -0x1000000
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v4, v5}, Landroid/widget/TextView;->setTextColor(I)V
a=0;// 
a=0;//     invoke-virtual {v1, v4}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     invoke-virtual {v2, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method protected a(Landroid/content/Context;Lcn/waps/a/p;)Landroid/widget/LinearLayout;
a=0;//     .locals 12
a=0;// 
a=0;//     const/4 v11, -0x1
a=0;// 
a=0;//     #v11=(Byte);
a=0;//     const/4 v10, 0x2
a=0;// 
a=0;//     #v10=(PosByte);
a=0;//     const/4 v9, -0x2
a=0;// 
a=0;//     #v9=(Byte);
a=0;//     const/4 v8, 0x1
a=0;// 
a=0;//     #v8=(One);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     const/4 v0, 0x7
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     iget-object v1, p0, Lcn/waps/a/b;->c:Landroid/util/DisplayMetrics;
a=0;// 
a=0;//     #v1=(Reference,Landroid/util/DisplayMetrics;);
a=0;//     invoke-static {p1, v0, v1}, Lcn/waps/a/o;->a(Landroid/content/Context;ILandroid/util/DisplayMetrics;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     new-instance v1, Landroid/widget/LinearLayout;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/widget/LinearLayout;);
a=0;//     invoke-direct {v1, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/LinearLayout;);
a=0;//     invoke-virtual {v1, v8}, Landroid/widget/LinearLayout;->setOrientation(I)V
a=0;// 
a=0;//     invoke-virtual {v1, v7, v0, v7, v0}, Landroid/widget/LinearLayout;->setPadding(IIII)V
a=0;// 
a=0;//     const/16 v2, 0x11
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->setGravity(I)V
a=0;// 
a=0;//     const/4 v2, 0x4
a=0;// 
a=0;//     iget-object v3, p0, Lcn/waps/a/b;->c:Landroid/util/DisplayMetrics;
a=0;// 
a=0;//     #v3=(Reference,Landroid/util/DisplayMetrics;);
a=0;//     invoke-static {p1, v2, v3}, Lcn/waps/a/o;->a(Landroid/content/Context;ILandroid/util/DisplayMetrics;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const/16 v3, 0x8
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     new-array v3, v3, [F
a=0;// 
a=0;//     #v3=(Reference,[F);
a=0;//     int-to-float v4, v2
a=0;// 
a=0;//     #v4=(Float);
a=0;//     aput v4, v3, v7
a=0;// 
a=0;//     int-to-float v4, v2
a=0;// 
a=0;//     aput v4, v3, v8
a=0;// 
a=0;//     int-to-float v4, v2
a=0;// 
a=0;//     aput v4, v3, v10
a=0;// 
a=0;//     const/4 v4, 0x3
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     int-to-float v5, v2
a=0;// 
a=0;//     #v5=(Float);
a=0;//     aput v5, v3, v4
a=0;// 
a=0;//     const/4 v4, 0x4
a=0;// 
a=0;//     int-to-float v5, v2
a=0;// 
a=0;//     aput v5, v3, v4
a=0;// 
a=0;//     const/4 v4, 0x5
a=0;// 
a=0;//     int-to-float v5, v2
a=0;// 
a=0;//     aput v5, v3, v4
a=0;// 
a=0;//     const/4 v4, 0x6
a=0;// 
a=0;//     int-to-float v5, v2
a=0;// 
a=0;//     aput v5, v3, v4
a=0;// 
a=0;//     const/4 v4, 0x7
a=0;// 
a=0;//     int-to-float v2, v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     aput v2, v3, v4
a=0;// 
a=0;//     new-instance v2, Landroid/graphics/drawable/ShapeDrawable;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/graphics/drawable/ShapeDrawable;);
a=0;//     new-instance v4, Landroid/graphics/drawable/shapes/RoundRectShape;
a=0;// 
a=0;//     #v4=(UninitRef,Landroid/graphics/drawable/shapes/RoundRectShape;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     invoke-direct {v4, v3, v5, v6}, Landroid/graphics/drawable/shapes/RoundRectShape;-><init>([FLandroid/graphics/RectF;[F)V
a=0;// 
a=0;//     #v4=(Reference,Landroid/graphics/drawable/shapes/RoundRectShape;);
a=0;//     invoke-direct {v2, v4}, Landroid/graphics/drawable/ShapeDrawable;-><init>(Landroid/graphics/drawable/shapes/Shape;)V
a=0;// 
a=0;//     #v2=(Reference,Landroid/graphics/drawable/ShapeDrawable;);
a=0;//     invoke-virtual {v2}, Landroid/graphics/drawable/ShapeDrawable;->getPaint()Landroid/graphics/Paint;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, "#FFFFFFFF"
a=0;// 
a=0;//     invoke-static {v4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Landroid/graphics/Paint;->setColor(I)V
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     new-instance v2, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/widget/RelativeLayout;);
a=0;//     invoke-direct {v2, p1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/RelativeLayout;);
a=0;//     new-instance v3, Landroid/widget/LinearLayout$LayoutParams;
a=0;// 
a=0;//     #v3=(UninitRef,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     invoke-direct {v3, v11, v9}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     #v3=(Reference,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/RelativeLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     new-instance v3, Landroid/widget/TextView;
a=0;// 
a=0;//     #v3=(UninitRef,Landroid/widget/TextView;);
a=0;//     invoke-direct {v3, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v3=(Reference,Landroid/widget/TextView;);
a=0;//     new-instance v4, Landroid/widget/RelativeLayout$LayoutParams;
a=0;// 
a=0;//     #v4=(UninitRef,Landroid/widget/RelativeLayout$LayoutParams;);
a=0;//     invoke-direct {v4, v9, v9}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     #v4=(Reference,Landroid/widget/RelativeLayout$LayoutParams;);
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/TextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     const-string v4, "\u5206\u4eab\u81f3..."
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     const/high16 v4, 0x41900000    # 18.0f
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/TextView;->setTextSize(F)V
a=0;// 
a=0;//     const/high16 v4, -0x1000000
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/TextView;->setTextColor(I)V
a=0;// 
a=0;//     invoke-virtual {v3, v8}, Landroid/widget/TextView;->setId(I)V
a=0;// 
a=0;//     invoke-virtual {v3, v0, v0, v7, v0}, Landroid/widget/TextView;->setPadding(IIII)V
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     new-instance v0, Landroid/widget/LinearLayout;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/widget/LinearLayout;);
a=0;//     invoke-direct {v0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/LinearLayout;);
a=0;//     new-instance v3, Landroid/widget/LinearLayout$LayoutParams;
a=0;// 
a=0;//     #v3=(UninitRef,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     const/4 v4, 0x5
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     invoke-direct {v3, v11, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     #v3=(Reference,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     invoke-virtual {v0, v3}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     new-instance v3, Landroid/graphics/drawable/GradientDrawable;
a=0;// 
a=0;//     #v3=(UninitRef,Landroid/graphics/drawable/GradientDrawable;);
a=0;//     sget-object v4, Landroid/graphics/drawable/GradientDrawable$Orientation;->TOP_BOTTOM:Landroid/graphics/drawable/GradientDrawable$Orientation;
a=0;// 
a=0;//     #v4=(Reference,Landroid/graphics/drawable/GradientDrawable$Orientation;);
a=0;//     const/4 v5, 0x3
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     new-array v5, v5, [I
a=0;// 
a=0;//     #v5=(Reference,[I);
a=0;//     const-string v6, "#cccccc"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v6}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     aput v6, v5, v7
a=0;// 
a=0;//     const-string v6, "#ffffff"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v6}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     aput v6, v5, v8
a=0;// 
a=0;//     const-string v6, "#bbbbbb"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v6}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     aput v6, v5, v10
a=0;// 
a=0;//     invoke-direct {v3, v4, v5}, Landroid/graphics/drawable/GradientDrawable;-><init>(Landroid/graphics/drawable/GradientDrawable$Orientation;[I)V
a=0;// 
a=0;//     #v3=(Reference,Landroid/graphics/drawable/GradientDrawable;);
a=0;//     invoke-virtual {v0, v3}, Landroid/widget/LinearLayout;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     new-instance v3, Landroid/widget/LinearLayout;
a=0;// 
a=0;//     #v3=(UninitRef,Landroid/widget/LinearLayout;);
a=0;//     invoke-direct {v3, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v3=(Reference,Landroid/widget/LinearLayout;);
a=0;//     invoke-virtual {v3, v8}, Landroid/widget/LinearLayout;->setOrientation(I)V
a=0;// 
a=0;//     new-instance v4, Landroid/widget/GridView;
a=0;// 
a=0;//     #v4=(UninitRef,Landroid/widget/GridView;);
a=0;//     invoke-virtual {p0}, Lcn/waps/a/b;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-direct {v4, v5}, Landroid/widget/GridView;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v4=(Reference,Landroid/widget/GridView;);
a=0;//     new-instance v5, Landroid/graphics/drawable/ColorDrawable;
a=0;// 
a=0;//     #v5=(UninitRef,Landroid/graphics/drawable/ColorDrawable;);
a=0;//     invoke-direct {v5, v7}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V
a=0;// 
a=0;//     #v5=(Reference,Landroid/graphics/drawable/ColorDrawable;);
a=0;//     invoke-virtual {v4, v5}, Landroid/widget/GridView;->setSelector(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     const/16 v5, 0x11
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     invoke-virtual {v4, v5}, Landroid/widget/GridView;->setGravity(I)V
a=0;// 
a=0;//     invoke-virtual {v4, v10}, Landroid/widget/GridView;->setNumColumns(I)V
a=0;// 
a=0;//     iget-object v5, p0, Lcn/waps/a/b;->d:Lcn/waps/a/c;
a=0;// 
a=0;//     #v5=(Reference,Lcn/waps/a/c;);
a=0;//     invoke-virtual {v4, v5}, Landroid/widget/GridView;->setAdapter(Landroid/widget/ListAdapter;)V
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     return-object v1
a=0;// .end method
a=0;// 
a=0;// .method protected a(Lcn/waps/a/f;)V
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/a/b;->d:Lcn/waps/a/c;
a=0;// 
a=0;//     #v0=(Reference,Lcn/waps/a/c;);
a=0;//     invoke-virtual {v0, p1}, Lcn/waps/a/c;->a(Lcn/waps/a/f;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
}}
