package cn.waps; class p { void a() { int a;
a=0;// .class Lcn/waps/p;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/lang/Runnable;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic a:Landroid/content/Context;
a=0;// 
a=0;// .field final synthetic b:Lcn/waps/AppConnect;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcn/waps/AppConnect;Landroid/content/Context;)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Lcn/waps/p;->b:Lcn/waps/AppConnect;
a=0;// 
a=0;//     iput-object p2, p0, Lcn/waps/p;->a:Landroid/content/Context;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcn/waps/p;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public run()V
a=0;//     .locals 4
a=0;// 
a=0;//     new-instance v0, Ljava/text/SimpleDateFormat;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/text/SimpleDateFormat;);
a=0;//     const-string v1, "yyyyMMdd"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/text/SimpleDateFormat;);
a=0;//     new-instance v1, Ljava/util/Date;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/Date;);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-direct {v1, v2, v3}, Ljava/util/Date;-><init>(J)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/Date;);
a=0;//     invoke-virtual {v0, v1}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sget-object v1, Lcn/waps/AppConnect;->b:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     const-string v2, "uninstall"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, ""
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     const-string v1, "uninstall"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v1, p0, Lcn/waps/p;->b:Lcn/waps/AppConnect;
a=0;// 
a=0;//     iget-object v2, p0, Lcn/waps/p;->a:Landroid/content/Context;
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Lcn/waps/AppConnect;->d(Landroid/content/Context;)V
a=0;// 
a=0;//     sget-object v1, Lcn/waps/AppConnect;->b:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "uninstall"
a=0;// 
a=0;//     invoke-interface {v1, v2, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
}}
