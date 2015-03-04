package cn.waps; class bo { void a() { int a;
a=0;// .class public Lcn/waps/bo;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field a:Landroid/app/Dialog;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcn/waps/bo;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected a(Landroid/content/Context;Lcn/waps/bn;)Landroid/app/Dialog;
a=0;//     .locals 5
a=0;// 
a=0;//     const v3, 0x1030006
a=0;// 
a=0;//     :try_start_0
a=0;//     #v3=(Integer);
a=0;//     move-object v0, p1
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     check-cast v0, Landroid/app/Activity;
a=0;// 
a=0;//     move-object v1, v0
a=0;// 
a=0;//     #v1=(Reference,Landroid/app/Activity;);
a=0;//     invoke-virtual {v1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget v1, v1, Landroid/view/WindowManager$LayoutParams;->flags:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const v2, 0x10500
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ne v1, v2, :cond_0
a=0;// 
a=0;//     new-instance v1, Landroid/app/Dialog;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/app/Dialog;);
a=0;//     const v2, 0x1030007
a=0;// 
a=0;//     invoke-direct {v1, p1, v2}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/app/Dialog;);
a=0;//     iput-object v1, p0, Lcn/waps/bo;->a:Landroid/app/Dialog;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);
a=0;//     iget-object v1, p0, Lcn/waps/bo;->a:Landroid/app/Dialog;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const-string v3, "#00000000"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2, v3}, Lcn/waps/da;->a(FLjava/lang/String;)Landroid/graphics/drawable/ShapeDrawable;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/graphics/drawable/ShapeDrawable;);
a=0;//     invoke-virtual {v1, v2}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     iget-object v1, p0, Lcn/waps/bo;->a:Landroid/app/Dialog;
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-virtual {v1, v2}, Landroid/app/Dialog;->requestWindowFeature(I)Z
a=0;// 
a=0;//     iget-object v1, p0, Lcn/waps/bo;->a:Landroid/app/Dialog;
a=0;// 
a=0;//     new-instance v2, Lcn/waps/bp;
a=0;// 
a=0;//     #v2=(UninitRef,Lcn/waps/bp;);
a=0;//     invoke-direct {v2}, Lcn/waps/bp;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Lcn/waps/bp;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     iget-object v4, p0, Lcn/waps/bo;->a:Landroid/app/Dialog;
a=0;// 
a=0;//     #v4=(Reference,Landroid/app/Dialog;);
a=0;//     invoke-virtual {v2, p1, v3, p2, v4}, Lcn/waps/bp;->a(Landroid/content/Context;Landroid/webkit/WebView;Lcn/waps/bn;Landroid/app/Dialog;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V
a=0;// 
a=0;//     iget-object v1, p0, Lcn/waps/bo;->a:Landroid/app/Dialog;
a=0;// 
a=0;//     return-object v1
a=0;// 
a=0;//     :cond_0
a=0;//     :try_start_1
a=0;//     #v1=(Integer);v2=(Integer);v3=(Integer);v4=(Uninit);
a=0;//     new-instance v1, Landroid/app/Dialog;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/app/Dialog;);
a=0;//     const v2, 0x1030006
a=0;// 
a=0;//     invoke-direct {v1, p1, v2}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/app/Dialog;);
a=0;//     iput-object v1, p0, Lcn/waps/bo;->a:Landroid/app/Dialog;
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Exception;);
a=0;//     new-instance v2, Landroid/app/Dialog;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/app/Dialog;);
a=0;//     invoke-direct {v2, p1, v3}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V
a=0;// 
a=0;//     #v2=(Reference,Landroid/app/Dialog;);
a=0;//     iput-object v2, p0, Lcn/waps/bo;->a:Landroid/app/Dialog;
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
