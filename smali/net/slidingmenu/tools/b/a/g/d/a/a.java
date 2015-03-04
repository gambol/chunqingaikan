package net.slidingmenu.tools.b.a.g.d.a; class a { void a() { int a;
a=0;// .class Lnet/slidingmenu/tools/b/a/g/d/a/a;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static c:Lnet/slidingmenu/tools/b/a/g/d/a/a;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private a:Landroid/content/Context;
a=0;// 
a=0;// .field private b:Ljava/util/Queue;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method private constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 2
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lnet/slidingmenu/tools/b/a/g/d/a/a;);
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     new-instance v0, Ljava/lang/NullPointerException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/NullPointerException;);
a=0;//     const-string v1, "Context must not be null"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/NullPointerException;);
a=0;//     throw v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);
a=0;//     iput-object p1, p0, Lnet/slidingmenu/tools/b/a/g/d/a/a;->a:Landroid/content/Context;
a=0;// 
a=0;//     new-instance v0, Ljava/util/concurrent/LinkedBlockingQueue;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/concurrent/LinkedBlockingQueue;);
a=0;//     invoke-direct {v0}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/LinkedBlockingQueue;);
a=0;//     iput-object v0, p0, Lnet/slidingmenu/tools/b/a/g/d/a/a;->b:Ljava/util/Queue;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static a(Landroid/content/Context;)Lnet/slidingmenu/tools/b/a/g/d/a/a;
a=0;//     .locals 1
a=0;// 
a=0;//     sget-object v0, Lnet/slidingmenu/tools/b/a/g/d/a/a;->c:Lnet/slidingmenu/tools/b/a/g/d/a/a;
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/b/a/g/d/a/a;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     new-instance v0, Lnet/slidingmenu/tools/b/a/g/d/a/a;
a=0;// 
a=0;//     #v0=(UninitRef,Lnet/slidingmenu/tools/b/a/g/d/a/a;);
a=0;//     invoke-direct {v0, p0}, Lnet/slidingmenu/tools/b/a/g/d/a/a;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/b/a/g/d/a/a;);
a=0;//     sput-object v0, Lnet/slidingmenu/tools/b/a/g/d/a/a;->c:Lnet/slidingmenu/tools/b/a/g/d/a/a;
a=0;// 
a=0;//     :cond_0
a=0;//     sget-object v0, Lnet/slidingmenu/tools/b/a/g/d/a/a;->c:Lnet/slidingmenu/tools/b/a/g/d/a/a;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method a()Lnet/slidingmenu/tools/b/a/g/d/a/d;
a=0;//     .locals 1
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/g/d/a/a;->b:Ljava/util/Queue;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Queue;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/g/d/a/a;->b:Ljava/util/Queue;
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/Queue;->poll()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lnet/slidingmenu/tools/b/a/g/d/a/d;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :goto_0
a=0;//     return-object v0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Ujava/lang/Object;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method a(Lnet/slidingmenu/tools/b/a/g/d/a/d;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/g/d/a/a;->b:Ljava/util/Queue;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Queue;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/g/d/a/a;->b:Ljava/util/Queue;
a=0;// 
a=0;//     invoke-interface {v0, p1}, Ljava/util/Queue;->offer(Ljava/lang/Object;)Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Ujava/lang/Object;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method b()Lnet/slidingmenu/tools/b/a/g/d/a/d;
a=0;//     .locals 1
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/g/d/a/a;->b:Ljava/util/Queue;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Queue;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/g/d/a/a;->b:Ljava/util/Queue;
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/Queue;->peek()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lnet/slidingmenu/tools/b/a/g/d/a/d;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :goto_0
a=0;//     return-object v0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Ujava/lang/Object;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method c()Z
a=0;//     .locals 1
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/g/d/a/a;->b:Ljava/util/Queue;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Queue;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/g/d/a/a;->b:Ljava/util/Queue;
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/Queue;->isEmpty()Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Ljava/util/Queue;);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method d()Z
a=0;//     .locals 1
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/g/d/a/a;->b:Ljava/util/Queue;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Queue;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/g/d/a/a;->b:Ljava/util/Queue;
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/Queue;->clear()V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :cond_0
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
}}
