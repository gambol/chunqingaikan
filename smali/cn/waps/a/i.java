package cn.waps.a; class i { void a() { int a;
a=0;// .class public Lcn/waps/a/i;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static b:Lcn/waps/a/i;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field a:Landroid/util/DisplayMetrics;
a=0;// 
a=0;// .field private c:Lcom/tencent/mm/sdk/openapi/IWXAPI;
a=0;// 
a=0;// .field private d:Landroid/content/Context;
a=0;// 
a=0;// .field private e:Landroid/content/SharedPreferences;
a=0;// 
a=0;// .field private f:Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;// .field private g:Z
a=0;// 
a=0;// .field private h:Landroid/os/Handler;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method private constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 3
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcn/waps/a/i;);
a=0;//     new-instance v0, Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/os/Handler;);
a=0;//     invoke-direct {v0}, Landroid/os/Handler;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     iput-object v0, p0, Lcn/waps/a/i;->h:Landroid/os/Handler;
a=0;// 
a=0;//     iput-object p1, p0, Lcn/waps/a/i;->d:Landroid/content/Context;
a=0;// 
a=0;//     invoke-direct {p0, p1}, Lcn/waps/a/i;->c(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {p1, v0, v2}, Lcom/tencent/mm/sdk/openapi/WXAPIFactory;->createWXAPI(Landroid/content/Context;Ljava/lang/String;Z)Lcom/tencent/mm/sdk/openapi/IWXAPI;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/mm/sdk/openapi/IWXAPI;);
a=0;//     iput-object v1, p0, Lcn/waps/a/i;->c:Lcom/tencent/mm/sdk/openapi/IWXAPI;
a=0;// 
a=0;//     iget-object v1, p0, Lcn/waps/a/i;->c:Lcom/tencent/mm/sdk/openapi/IWXAPI;
a=0;// 
a=0;//     invoke-interface {v1, v0}, Lcom/tencent/mm/sdk/openapi/IWXAPI;->registerApp(Ljava/lang/String;)Z
a=0;// 
a=0;//     iput-boolean v2, p0, Lcn/waps/a/i;->g:Z
a=0;// 
a=0;//     const-string v0, "see"
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcn/waps/a/i;->e:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/a/i;->e:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcn/waps/a/i;->f:Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     new-instance v0, Landroid/util/DisplayMetrics;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/util/DisplayMetrics;);
a=0;//     invoke-direct {v0}, Landroid/util/DisplayMetrics;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/util/DisplayMetrics;);
a=0;//     iput-object v0, p0, Lcn/waps/a/i;->a:Landroid/util/DisplayMetrics;
a=0;// 
a=0;//     check-cast p1, Landroid/app/Activity;
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcn/waps/a/i;->a:Landroid/util/DisplayMetrics;
a=0;// 
a=0;//     #v1=(Reference,Landroid/util/DisplayMetrics;);
a=0;//     invoke-virtual {v0, v1}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcn/waps/a/i;)Landroid/content/Context;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/a/i;->d:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method protected static a(Landroid/content/Context;)Lcn/waps/a/i;
a=0;//     .locals 1
a=0;// 
a=0;//     sget-object v0, Lcn/waps/a/i;->b:Lcn/waps/a/i;
a=0;// 
a=0;//     #v0=(Reference,Lcn/waps/a/i;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     new-instance v0, Lcn/waps/a/i;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/waps/a/i;);
a=0;//     invoke-direct {v0, p0}, Lcn/waps/a/i;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Lcn/waps/a/i;);
a=0;//     sput-object v0, Lcn/waps/a/i;->b:Lcn/waps/a/i;
a=0;// 
a=0;//     :cond_0
a=0;//     sget-object v0, Lcn/waps/a/i;->b:Lcn/waps/a/i;
a=0;// 
a=0;//     invoke-direct {v0, p0}, Lcn/waps/a/i;->b(Landroid/content/Context;)V
a=0;// 
a=0;//     sget-object v0, Lcn/waps/a/i;->b:Lcn/waps/a/i;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic b(Lcn/waps/a/i;)Landroid/os/Handler;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/a/i;->h:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private b(Landroid/content/Context;)V
a=0;//     .locals 1
a=0;// 
a=0;//     sget-object v0, Lcn/waps/a/i;->b:Lcn/waps/a/i;
a=0;// 
a=0;//     #v0=(Reference,Lcn/waps/a/i;);
a=0;//     iput-object p1, v0, Lcn/waps/a/i;->d:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {p1}, Lcn/waps/a/g;->a(Landroid/content/Context;)Lcn/waps/a/g;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Lcn/waps/a/g;->b(Landroid/content/Context;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private c(Landroid/content/Context;)Ljava/lang/String;
a=0;//     .locals 3
a=0;// 
a=0;//     const-string v0, "Shared_settings"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const-string v1, "wx_appid"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, ""
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Null);v2=(Uninit);
a=0;//     const-string v0, ""
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private c(ILcn/waps/a/p;I)V
a=0;//     .locals 1
a=0;// 
a=0;//     packed-switch p3, :pswitch_data_0
a=0;// 
a=0;//     :goto_0
a=0;//     :pswitch_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :pswitch_1
a=0;//     #v0=(Uninit);
a=0;//     iget-object v0, p0, Lcn/waps/a/i;->d:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v0}, Lcn/waps/a/g;->a(Landroid/content/Context;)Lcn/waps/a/g;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p1, p2}, Lcn/waps/a/g;->c(ILcn/waps/a/p;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :pswitch_2
a=0;//     #v0=(Uninit);
a=0;//     iget-object v0, p0, Lcn/waps/a/i;->d:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v0}, Lcn/waps/a/g;->a(Landroid/content/Context;)Lcn/waps/a/g;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p1, p2}, Lcn/waps/a/g;->a(ILcn/waps/a/p;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :pswitch_3
a=0;//     #v0=(Uninit);
a=0;//     iget-object v0, p0, Lcn/waps/a/i;->d:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v0}, Lcn/waps/a/g;->a(Landroid/content/Context;)Lcn/waps/a/g;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p1, p2}, Lcn/waps/a/g;->b(ILcn/waps/a/p;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :pswitch_4
a=0;//     #v0=(Uninit);
a=0;//     iget-object v0, p0, Lcn/waps/a/i;->d:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v0}, Lcn/waps/a/g;->a(Landroid/content/Context;)Lcn/waps/a/g;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p1, p2}, Lcn/waps/a/g;->e(ILcn/waps/a/p;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :pswitch_5
a=0;//     #v0=(Uninit);
a=0;//     iget-object v0, p0, Lcn/waps/a/i;->d:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v0}, Lcn/waps/a/g;->a(Landroid/content/Context;)Lcn/waps/a/g;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p1, p2}, Lcn/waps/a/g;->d(ILcn/waps/a/p;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x1
a=0;//         :pswitch_2
a=0;//         :pswitch_1
a=0;//         :pswitch_5
a=0;//         :pswitch_0
a=0;//         :pswitch_0
a=0;//         :pswitch_0
a=0;//         :pswitch_0
a=0;//         :pswitch_3
a=0;//         :pswitch_4
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected a(Lcn/waps/a/p;IZI[I)Lcn/waps/a/b;
a=0;//     .locals 7
a=0;// 
a=0;//     new-instance v0, Lcn/waps/a/b;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/waps/a/b;);
a=0;//     iget-object v1, p0, Lcn/waps/a/i;->d:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     iget-object v2, p0, Lcn/waps/a/i;->c:Lcom/tencent/mm/sdk/openapi/IWXAPI;
a=0;// 
a=0;//     #v2=(Reference,Lcom/tencent/mm/sdk/openapi/IWXAPI;);
a=0;//     move v3, p4
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     move v4, p3
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     move-object v5, p5
a=0;// 
a=0;//     #v5=(Reference,[I);
a=0;//     invoke-direct/range {v0 .. v5}, Lcn/waps/a/b;-><init>(Landroid/content/Context;Lcom/tencent/mm/sdk/openapi/IWXAPI;IZ[I)V
a=0;// 
a=0;//     #v0=(Reference,Lcn/waps/a/b;);
a=0;//     iget-object v1, p0, Lcn/waps/a/i;->d:Landroid/content/Context;
a=0;// 
a=0;//     const/4 v2, 0x4
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     iget-object v3, p0, Lcn/waps/a/i;->a:Landroid/util/DisplayMetrics;
a=0;// 
a=0;//     #v3=(Reference,Landroid/util/DisplayMetrics;);
a=0;//     invoke-static {v1, v2, v3}, Lcn/waps/a/o;->a(Landroid/content/Context;ILandroid/util/DisplayMetrics;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/16 v2, 0x8
a=0;// 
a=0;//     new-array v2, v2, [F
a=0;// 
a=0;//     #v2=(Reference,[F);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     int-to-float v4, v1
a=0;// 
a=0;//     #v4=(Float);
a=0;//     aput v4, v2, v3
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     int-to-float v4, v1
a=0;// 
a=0;//     aput v4, v2, v3
a=0;// 
a=0;//     const/4 v3, 0x2
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     int-to-float v4, v1
a=0;// 
a=0;//     aput v4, v2, v3
a=0;// 
a=0;//     const/4 v3, 0x3
a=0;// 
a=0;//     int-to-float v4, v1
a=0;// 
a=0;//     aput v4, v2, v3
a=0;// 
a=0;//     const/4 v3, 0x4
a=0;// 
a=0;//     int-to-float v4, v1
a=0;// 
a=0;//     aput v4, v2, v3
a=0;// 
a=0;//     const/4 v3, 0x5
a=0;// 
a=0;//     int-to-float v4, v1
a=0;// 
a=0;//     aput v4, v2, v3
a=0;// 
a=0;//     const/4 v3, 0x6
a=0;// 
a=0;//     int-to-float v4, v1
a=0;// 
a=0;//     aput v4, v2, v3
a=0;// 
a=0;//     const/4 v3, 0x7
a=0;// 
a=0;//     int-to-float v1, v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     aput v1, v2, v3
a=0;// 
a=0;//     new-instance v1, Landroid/graphics/drawable/ShapeDrawable;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/graphics/drawable/ShapeDrawable;);
a=0;//     new-instance v3, Landroid/graphics/drawable/shapes/RoundRectShape;
a=0;// 
a=0;//     #v3=(UninitRef,Landroid/graphics/drawable/shapes/RoundRectShape;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-direct {v3, v2, v4, v5}, Landroid/graphics/drawable/shapes/RoundRectShape;-><init>([FLandroid/graphics/RectF;[F)V
a=0;// 
a=0;//     #v3=(Reference,Landroid/graphics/drawable/shapes/RoundRectShape;);
a=0;//     invoke-direct {v1, v3}, Landroid/graphics/drawable/ShapeDrawable;-><init>(Landroid/graphics/drawable/shapes/Shape;)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/drawable/ShapeDrawable;);
a=0;//     invoke-virtual {v1}, Landroid/graphics/drawable/ShapeDrawable;->getPaint()Landroid/graphics/Paint;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "#00FFFFFF"
a=0;// 
a=0;//     invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setColor(I)V
a=0;// 
a=0;//     const/16 v2, 0x14
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     const/16 v3, 0x14
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     const/16 v4, 0x14
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     const/16 v5, 0x14
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     invoke-virtual {v1, v2, v3, v4, v5}, Landroid/graphics/drawable/ShapeDrawable;->setPadding(IIII)V
a=0;// 
a=0;//     invoke-virtual {v0}, Lcn/waps/a/b;->getWindow()Landroid/view/Window;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/Window;);
a=0;//     invoke-virtual {v2, v1}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-virtual {v0, v2}, Lcn/waps/a/b;->requestWindowFeature(I)Z
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Lcn/waps/a/b;->setCanceledOnTouchOutside(Z)V
a=0;// 
a=0;//     new-instance v4, Landroid/app/Dialog;
a=0;// 
a=0;//     #v4=(UninitRef,Landroid/app/Dialog;);
a=0;//     iget-object v2, p0, Lcn/waps/a/i;->d:Landroid/content/Context;
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v4, v2}, Landroid/app/Dialog;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v4=(Reference,Landroid/app/Dialog;);
a=0;//     invoke-virtual {v4}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, v1}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {v4, v1}, Landroid/app/Dialog;->requestWindowFeature(I)Z
a=0;// 
a=0;//     iget-object v1, p0, Lcn/waps/a/i;->d:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v0, v1}, Lcn/waps/a/b;->a(Landroid/content/Context;)Landroid/widget/LinearLayout;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v4, v1}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V
a=0;// 
a=0;//     invoke-virtual {v4}, Landroid/app/Dialog;->show()V
a=0;// 
a=0;//     new-instance v1, Lcn/waps/a/j;
a=0;// 
a=0;//     #v1=(UninitRef,Lcn/waps/a/j;);
a=0;//     move-object v2, p0
a=0;// 
a=0;//     move-object v3, v0
a=0;// 
a=0;//     #v3=(Reference,Lcn/waps/a/b;);
a=0;//     move-object v5, p1
a=0;// 
a=0;//     #v5=(Reference,Lcn/waps/a/p;);
a=0;//     move v6, p2
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-direct/range {v1 .. v6}, Lcn/waps/a/j;-><init>(Lcn/waps/a/i;Lcn/waps/a/b;Landroid/app/Dialog;Lcn/waps/a/p;I)V
a=0;// 
a=0;//     #v1=(Reference,Lcn/waps/a/j;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     new-array v2, v2, [Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Lcn/waps/a/j;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method protected a(ILcn/waps/a/p;I)V
a=0;//     .locals 1
a=0;// 
a=0;//     const/4 v0, 0x3
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     if-ne p1, v0, :cond_1
a=0;// 
a=0;//     invoke-direct {p0, p1, p2, p3}, Lcn/waps/a/i;->c(ILcn/waps/a/p;I)V
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     if-ne p1, v0, :cond_2
a=0;// 
a=0;//     invoke-direct {p0, p1, p2, p3}, Lcn/waps/a/i;->c(ILcn/waps/a/p;I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     if-ne p1, v0, :cond_3
a=0;// 
a=0;//     invoke-virtual {p0, p1, p2, p3}, Lcn/waps/a/i;->b(ILcn/waps/a/p;I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_3
a=0;//     const/4 v0, 0x6
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     if-ne p1, v0, :cond_4
a=0;// 
a=0;//     invoke-direct {p0, p1, p2, p3}, Lcn/waps/a/i;->c(ILcn/waps/a/p;I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_4
a=0;//     const/4 v0, 0x4
a=0;// 
a=0;//     if-ne p1, v0, :cond_5
a=0;// 
a=0;//     invoke-direct {p0, p1, p2, p3}, Lcn/waps/a/i;->c(ILcn/waps/a/p;I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_5
a=0;//     const/4 v0, 0x5
a=0;// 
a=0;//     if-ne p1, v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {p0, p1, p2, p3}, Lcn/waps/a/i;->b(ILcn/waps/a/p;I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected a()Z
a=0;//     .locals 3
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcn/waps/a/i;->d:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "com.tencent.mm"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/16 v2, 0x2000
a=0;// 
a=0;//     #v2=(PosShort);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;
a=0;//     :try_end_0
a=0;//     .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/pm/PackageManager$NameNotFoundException;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected b(ILcn/waps/a/p;I)V
a=0;//     .locals 3
a=0;// 
a=0;//     invoke-virtual {p0}, Lcn/waps/a/i;->a()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/a/i;->d:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     const-string v1, "\u4eb2~\u4f60\u8fd8\u6ca1\u6709\u5b89\u88c5\u5fae\u4fe1\uff0c\u5148\u53bb\u4e0b\u8f7d\u4e00\u4e2a\u5427"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/widget/Toast;->show()V
a=0;// 
a=0;//     const-string v0, "market://details?id=com.tencent.mm"
a=0;// 
a=0;//     invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-instance v1, Landroid/content/Intent;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/content/Intent;);
a=0;//     const-string v2, "android.intent.action.VIEW"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V
a=0;// 
a=0;//     :try_start_0
a=0;//     #v1=(Reference,Landroid/content/Intent;);
a=0;//     iget-object v0, p0, Lcn/waps/a/i;->d:Landroid/content/Context;
a=0;// 
a=0;//     const-string v2, "\u8bf7\u9009\u62e9\u4e00\u4e2a\u5e73\u53f0\u4e0b\u8f7d\u5fae\u4fe1"
a=0;// 
a=0;//     invoke-static {v1, v2}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const/high16 v2, 0x10000000
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :goto_0
a=0;//     :pswitch_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);
a=0;//     new-instance v0, Lcn/waps/a/n;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/waps/a/n;);
a=0;//     invoke-direct {v0, p1}, Lcn/waps/a/n;-><init>(I)V
a=0;// 
a=0;//     #v0=(Reference,Lcn/waps/a/n;);
a=0;//     packed-switch p3, :pswitch_data_0
a=0;// 
a=0;//     :pswitch_1
a=0;//     goto :goto_0
a=0;// 
a=0;//     :pswitch_2
a=0;//     iget-boolean v1, p0, Lcn/waps/a/i;->g:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     iget-object v1, p0, Lcn/waps/a/i;->c:Lcom/tencent/mm/sdk/openapi/IWXAPI;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/mm/sdk/openapi/IWXAPI;);
a=0;//     invoke-virtual {v0, v1, p2}, Lcn/waps/a/n;->a(Lcom/tencent/mm/sdk/openapi/IWXAPI;Lcn/waps/a/p;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :pswitch_3
a=0;//     #v1=(Uninit);
a=0;//     iget-boolean v1, p0, Lcn/waps/a/i;->g:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     iget-object v1, p0, Lcn/waps/a/i;->c:Lcom/tencent/mm/sdk/openapi/IWXAPI;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/mm/sdk/openapi/IWXAPI;);
a=0;//     invoke-virtual {v0, v1, p2}, Lcn/waps/a/n;->c(Lcom/tencent/mm/sdk/openapi/IWXAPI;Lcn/waps/a/p;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v1=(Boolean);
a=0;//     iget-object v0, p0, Lcn/waps/a/i;->d:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v0}, Lcn/waps/a/g;->a(Landroid/content/Context;)Lcn/waps/a/g;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p1, p2}, Lcn/waps/a/g;->c(ILcn/waps/a/p;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     iget-object v0, p0, Lcn/waps/a/i;->d:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v0}, Lcn/waps/a/g;->a(Landroid/content/Context;)Lcn/waps/a/g;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p1, p2}, Lcn/waps/a/g;->a(ILcn/waps/a/p;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :pswitch_4
a=0;//     #v1=(Uninit);
a=0;//     iget-boolean v1, p0, Lcn/waps/a/i;->g:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     iget-object v1, p0, Lcn/waps/a/i;->c:Lcom/tencent/mm/sdk/openapi/IWXAPI;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/mm/sdk/openapi/IWXAPI;);
a=0;//     invoke-virtual {v0, v1, p2}, Lcn/waps/a/n;->b(Lcom/tencent/mm/sdk/openapi/IWXAPI;Lcn/waps/a/p;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_3
a=0;//     #v1=(Boolean);
a=0;//     iget-object v0, p0, Lcn/waps/a/i;->d:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v0}, Lcn/waps/a/g;->a(Landroid/content/Context;)Lcn/waps/a/g;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p1, p2}, Lcn/waps/a/g;->b(ILcn/waps/a/p;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :pswitch_5
a=0;//     #v1=(Uninit);
a=0;//     iget-boolean v1, p0, Lcn/waps/a/i;->g:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_4
a=0;// 
a=0;//     iget-object v1, p0, Lcn/waps/a/i;->c:Lcom/tencent/mm/sdk/openapi/IWXAPI;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/mm/sdk/openapi/IWXAPI;);
a=0;//     invoke-virtual {v0, v1, p2}, Lcn/waps/a/n;->e(Lcom/tencent/mm/sdk/openapi/IWXAPI;Lcn/waps/a/p;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_4
a=0;//     #v1=(Boolean);
a=0;//     iget-object v0, p0, Lcn/waps/a/i;->d:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v0}, Lcn/waps/a/g;->a(Landroid/content/Context;)Lcn/waps/a/g;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p1, p2}, Lcn/waps/a/g;->e(ILcn/waps/a/p;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :pswitch_6
a=0;//     #v1=(Uninit);
a=0;//     iget-boolean v1, p0, Lcn/waps/a/i;->g:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_5
a=0;// 
a=0;//     iget-object v1, p0, Lcn/waps/a/i;->c:Lcom/tencent/mm/sdk/openapi/IWXAPI;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/mm/sdk/openapi/IWXAPI;);
a=0;//     invoke-virtual {v0, v1, p2}, Lcn/waps/a/n;->d(Lcom/tencent/mm/sdk/openapi/IWXAPI;Lcn/waps/a/p;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_5
a=0;//     #v1=(Boolean);
a=0;//     iget-object v0, p0, Lcn/waps/a/i;->d:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v0}, Lcn/waps/a/g;->a(Landroid/content/Context;)Lcn/waps/a/g;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p1, p2}, Lcn/waps/a/g;->d(ILcn/waps/a/p;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v1=(Reference,Landroid/content/Intent;);v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x1
a=0;//         :pswitch_2
a=0;//         :pswitch_3
a=0;//         :pswitch_6
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//         :pswitch_0
a=0;//         :pswitch_0
a=0;//         :pswitch_4
a=0;//         :pswitch_5
a=0;//     .end packed-switch
a=0;// .end method
}}
