package net.slidingmenu.tools.os.a; class a { void a() { int a;
a=0;// .class public Lnet/slidingmenu/tools/os/a/a;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public static a(Landroid/content/Context;)Z
a=0;//     .locals 2
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-static {p0}, Lnet/slidingmenu/tools/os/a/a;->d(Landroid/content/Context;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Null);
a=0;//     invoke-static {p0}, Lnet/slidingmenu/tools/os/a/a;->b(Landroid/content/Context;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     invoke-static {p0}, Lnet/slidingmenu/tools/os/a/a;->c(Landroid/content/Context;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static b(Landroid/content/Context;)Z
a=0;//     .locals 4
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     const-string v2, "Check Ad Permission Failure , Please Add \"%s\" To AndroidManifest.xml"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0}, Lnet/slidingmenu/tools/b/b/k/k;->b(Landroid/content/Context;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     new-array v1, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     const-string v3, "android.permission.INTERNET"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     aput-object v3, v1, v0
a=0;// 
a=0;//     invoke-static {v2, v1}, Lnet/slidingmenu/tools/b/c/b/a;->b(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);v3=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Null);v1=(One);v3=(Boolean);
a=0;//     invoke-static {p0}, Lnet/slidingmenu/tools/b/b/k/k;->c(Landroid/content/Context;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     if-nez v3, :cond_1
a=0;// 
a=0;//     new-array v1, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     const-string v3, "android.permission.READ_PHONE_STATE"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     aput-object v3, v1, v0
a=0;// 
a=0;//     invoke-static {v2, v1}, Lnet/slidingmenu/tools/b/c/b/a;->b(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v1=(One);v3=(Boolean);
a=0;//     invoke-static {p0}, Lnet/slidingmenu/tools/b/b/k/k;->d(Landroid/content/Context;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     if-nez v3, :cond_2
a=0;// 
a=0;//     new-array v1, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     const-string v3, "android.permission.ACCESS_NETWORK_STATE"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     aput-object v3, v1, v0
a=0;// 
a=0;//     invoke-static {v2, v1}, Lnet/slidingmenu/tools/b/c/b/a;->b(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v1=(One);v3=(Boolean);
a=0;//     invoke-static {p0}, Lnet/slidingmenu/tools/b/b/k/k;->g(Landroid/content/Context;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     if-nez v3, :cond_3
a=0;// 
a=0;//     new-array v1, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     const-string v3, "android.permission.ACCESS_WIFI_STATE"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     aput-object v3, v1, v0
a=0;// 
a=0;//     invoke-static {v2, v1}, Lnet/slidingmenu/tools/b/c/b/a;->b(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_3
a=0;//     #v1=(One);v3=(Boolean);
a=0;//     invoke-static {p0}, Lnet/slidingmenu/tools/b/b/k/k;->a(Landroid/content/Context;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     if-nez v3, :cond_4
a=0;// 
a=0;//     new-array v1, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     const-string v3, "android.permission.WRITE_EXTERNAL_STORAG"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     aput-object v3, v1, v0
a=0;// 
a=0;//     invoke-static {v2, v1}, Lnet/slidingmenu/tools/b/c/b/a;->b(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_4
a=0;//     #v1=(One);v3=(Boolean);
a=0;//     invoke-static {p0}, Lnet/slidingmenu/tools/b/b/k/k;->j(Landroid/content/Context;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     if-nez v3, :cond_5
a=0;// 
a=0;//     new-array v1, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     const-string v3, "android.permission.GET_TASKS"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     aput-object v3, v1, v0
a=0;// 
a=0;//     invoke-static {v2, v1}, Lnet/slidingmenu/tools/b/c/b/a;->b(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_5
a=0;//     #v1=(One);v3=(Boolean);
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static c(Landroid/content/Context;)Z
a=0;//     .locals 4
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     const-string v2, "Check Ad Component Failure , Please Add \"%s\" To AndroidManifest.xml"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-class v3, Lnet/slidingmenu/tools/slidingaaxc;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Class;);
a=0;//     invoke-static {p0, v3}, Lnet/slidingmenu/tools/b/b/k/c;->a(Landroid/content/Context;Ljava/lang/Class;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     new-array v1, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     const-class v3, Lnet/slidingmenu/tools/slidingaaxc;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     aput-object v3, v1, v0
a=0;// 
a=0;//     invoke-static {v2, v1}, Lnet/slidingmenu/tools/b/c/b/a;->b(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);v3=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Null);v1=(One);v3=(Boolean);
a=0;//     const-class v3, Lnet/slidingmenu/tools/slidingajxc;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Class;);
a=0;//     invoke-static {p0, v3}, Lnet/slidingmenu/tools/b/b/k/c;->b(Landroid/content/Context;Ljava/lang/Class;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_1
a=0;// 
a=0;//     new-array v1, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     const-class v3, Lnet/slidingmenu/tools/slidingajxc;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     aput-object v3, v1, v0
a=0;// 
a=0;//     invoke-static {v2, v1}, Lnet/slidingmenu/tools/b/c/b/a;->b(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v1=(One);v3=(Boolean);
a=0;//     const-class v3, Lnet/slidingmenu/tools/slidingahxc;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Class;);
a=0;//     invoke-static {p0, v3}, Lnet/slidingmenu/tools/b/b/k/c;->c(Landroid/content/Context;Ljava/lang/Class;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_2
a=0;// 
a=0;//     new-array v1, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     const-class v3, Lnet/slidingmenu/tools/slidingahxc;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     aput-object v3, v1, v0
a=0;// 
a=0;//     invoke-static {v2, v1}, Lnet/slidingmenu/tools/b/c/b/a;->b(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v1=(One);v3=(Boolean);
a=0;//     const-class v3, Lnet/slidingmenu/tools/slidingbjxc;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Class;);
a=0;//     invoke-static {p0, v3}, Lnet/slidingmenu/tools/b/b/k/c;->b(Landroid/content/Context;Ljava/lang/Class;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_3
a=0;// 
a=0;//     new-array v1, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     const-class v3, Lnet/slidingmenu/tools/slidingbjxc;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     aput-object v3, v1, v0
a=0;// 
a=0;//     invoke-static {v2, v1}, Lnet/slidingmenu/tools/b/c/b/a;->b(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_3
a=0;//     #v1=(One);v3=(Boolean);
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static d(Landroid/content/Context;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-static {p0}, Lnet/slidingmenu/tools/b/c/c/a;->d(Landroid/content/Context;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     const-string v0, "Check Appid And AppSecret Failure, Please input your Appid and AppSecret in AdManager.getInstance(Context context).init(...)"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lnet/slidingmenu/tools/b/c/b/a;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// .end method
}}
