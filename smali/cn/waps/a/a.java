package cn.waps.a; class a { void a() { int a;
a=0;// .class public Lcn/waps/a/a;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field static a:Lcn/waps/a/a;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcn/waps/a/a;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static a(Landroid/content/Context;)Lcn/waps/a/a;
a=0;//     .locals 1
a=0;// 
a=0;//     sget-object v0, Lcn/waps/a/a;->a:Lcn/waps/a/a;
a=0;// 
a=0;//     #v0=(Reference,Lcn/waps/a/a;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     new-instance v0, Lcn/waps/a/a;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/waps/a/a;);
a=0;//     invoke-direct {v0}, Lcn/waps/a/a;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcn/waps/a/a;);
a=0;//     sput-object v0, Lcn/waps/a/a;->a:Lcn/waps/a/a;
a=0;// 
a=0;//     :cond_0
a=0;//     sget-object v0, Lcn/waps/a/a;->a:Lcn/waps/a/a;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcn/waps/a/p;
a=0;//     .locals 1
a=0;// 
a=0;//     new-instance v0, Lcn/waps/a/p;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/waps/a/p;);
a=0;//     invoke-direct {v0}, Lcn/waps/a/p;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcn/waps/a/p;);
a=0;//     invoke-virtual {v0, p1}, Lcn/waps/a/p;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     invoke-virtual {v0, p2}, Lcn/waps/a/p;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     invoke-virtual {v0, p3}, Lcn/waps/a/p;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     invoke-virtual {v0, p4}, Lcn/waps/a/p;->d(Ljava/lang/String;)V
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public a(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[I)V
a=0;//     .locals 6
a=0;// 
a=0;//     invoke-direct {p0, p3, p3, p4, p5}, Lcn/waps/a/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcn/waps/a/p;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcn/waps/a/p;);
a=0;//     invoke-static {p1}, Lcn/waps/a/i;->a(Landroid/content/Context;)Lcn/waps/a/i;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcn/waps/a/i;);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     move v2, p2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     move-object v5, p6
a=0;// 
a=0;//     #v5=(Reference,[I);
a=0;//     invoke-virtual/range {v0 .. v5}, Lcn/waps/a/i;->a(Lcn/waps/a/p;IZI[I)Lcn/waps/a/b;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public a(Ljava/lang/String;Landroid/content/Context;)V
a=0;//     .locals 2
a=0;// 
a=0;//     const-string v0, "Shared_settings"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {p2, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "wx_appid"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public b(Landroid/content/Context;)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-static {p1}, Lcn/waps/a/o;->a(Landroid/content/Context;)[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     invoke-static {v0}, Lcn/waps/a/o;->a([B)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
}}
