package net.slidingmenu.tools.b.a.e.e; class b { void a() { int a;
a=0;// .class public Lnet/slidingmenu/tools/b/a/e/e/b;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static a:Lnet/slidingmenu/tools/b/a/e/e/b;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private b:Ljava/util/Hashtable;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lnet/slidingmenu/tools/b/a/e/e/b;);
a=0;//     new-instance v0, Ljava/util/Hashtable;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/Hashtable;);
a=0;//     invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Hashtable;);
a=0;//     iput-object v0, p0, Lnet/slidingmenu/tools/b/a/e/e/b;->b:Ljava/util/Hashtable;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static a()Lnet/slidingmenu/tools/b/a/e/e/b;
a=0;//     .locals 1
a=0;// 
a=0;//     sget-object v0, Lnet/slidingmenu/tools/b/a/e/e/b;->a:Lnet/slidingmenu/tools/b/a/e/e/b;
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/b/a/e/e/b;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     new-instance v0, Lnet/slidingmenu/tools/b/a/e/e/b;
a=0;// 
a=0;//     #v0=(UninitRef,Lnet/slidingmenu/tools/b/a/e/e/b;);
a=0;//     invoke-direct {v0}, Lnet/slidingmenu/tools/b/a/e/e/b;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/b/a/e/e/b;);
a=0;//     sput-object v0, Lnet/slidingmenu/tools/b/a/e/e/b;->a:Lnet/slidingmenu/tools/b/a/e/e/b;
a=0;// 
a=0;//     :cond_0
a=0;//     sget-object v0, Lnet/slidingmenu/tools/b/a/e/e/b;->a:Lnet/slidingmenu/tools/b/a/e/e/b;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public a(Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-static {p1}, Lnet/slidingmenu/tools/b/b/d/g;->a(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public a(Landroid/content/Context;Landroid/webkit/WebView;Ljava/lang/String;)V
a=0;//     .locals 2
a=0;// 
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     if-nez p2, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     :try_start_0
a=0;//     #v0=(Uninit);v1=(Uninit);
a=0;//     invoke-static {p3}, Lnet/slidingmenu/tools/b/b/b/e;->b(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/b/a/e/e/b;->b:Ljava/util/Hashtable;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/Hashtable;);
a=0;//     if-nez v1, :cond_2
a=0;// 
a=0;//     new-instance v1, Ljava/util/Hashtable;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/Hashtable;);
a=0;//     invoke-direct {v1}, Ljava/util/Hashtable;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/Hashtable;);
a=0;//     iput-object v1, p0, Lnet/slidingmenu/tools/b/a/e/e/b;->b:Ljava/util/Hashtable;
a=0;// 
a=0;//     :cond_2
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/b/a/e/e/b;->b:Ljava/util/Hashtable;
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lnet/slidingmenu/tools/b/a/e/e/b;->a(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1, p2, v0}, Lnet/slidingmenu/tools/b/a/e/e/c;->a(Landroid/content/Context;Landroid/webkit/WebView;Ljava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public a(Ljava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 3
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-static {p1}, Lnet/slidingmenu/tools/b/b/b/e;->b(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     invoke-static {p2}, Lnet/slidingmenu/tools/b/b/b/e;->b(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     iget-object v2, p0, Lnet/slidingmenu/tools/b/a/e/e/b;->b:Ljava/util/Hashtable;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/Hashtable;);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     new-instance v2, Ljava/util/Hashtable;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/util/Hashtable;);
a=0;//     invoke-direct {v2}, Ljava/util/Hashtable;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/Hashtable;);
a=0;//     iput-object v2, p0, Lnet/slidingmenu/tools/b/a/e/e/b;->b:Ljava/util/Hashtable;
a=0;// 
a=0;//     :cond_0
a=0;//     iget-object v2, p0, Lnet/slidingmenu/tools/b/a/e/e/b;->b:Ljava/util/Hashtable;
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lnet/slidingmenu/tools/b/a/e/e/b;->a(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v2, v0, v1}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_0
a=0;// .end method
}}
