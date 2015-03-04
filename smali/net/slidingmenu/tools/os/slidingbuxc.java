package net.slidingmenu.tools.os; class slidingbuxc { void a() { int a;
a=0;// .class public Lnet/slidingmenu/tools/os/slidingbuxc;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static b:Lnet/slidingmenu/tools/os/slidingbuxc;
a=0;// 
a=0;// .field private static c:Z
a=0;// 
a=0;// .field private static d:Z
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private a:Landroid/content/Context;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     sput-boolean v0, Lnet/slidingmenu/tools/os/slidingbuxc;->c:Z
a=0;// 
a=0;//     sput-boolean v0, Lnet/slidingmenu/tools/os/slidingbuxc;->d:Z
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 2
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lnet/slidingmenu/tools/os/slidingbuxc;);
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
a=0;//     invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     iput-object v0, p0, Lnet/slidingmenu/tools/os/slidingbuxc;->a:Landroid/content/Context;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static declared-synchronized getInstance(Landroid/content/Context;)Lnet/slidingmenu/tools/os/slidingbuxc;
a=0;//     .locals 2
a=0;// 
a=0;//     const-class v1, Lnet/slidingmenu/tools/os/slidingbuxc;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     :try_start_0
a=0;//     sget-object v0, Lnet/slidingmenu/tools/os/slidingbuxc;->b:Lnet/slidingmenu/tools/os/slidingbuxc;
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/os/slidingbuxc;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     new-instance v0, Lnet/slidingmenu/tools/os/slidingbuxc;
a=0;// 
a=0;//     #v0=(UninitRef,Lnet/slidingmenu/tools/os/slidingbuxc;);
a=0;//     invoke-direct {v0, p0}, Lnet/slidingmenu/tools/os/slidingbuxc;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/os/slidingbuxc;);
a=0;//     sput-object v0, Lnet/slidingmenu/tools/os/slidingbuxc;->b:Lnet/slidingmenu/tools/os/slidingbuxc;
a=0;// 
a=0;//     :cond_0
a=0;//     sget-object v0, Lnet/slidingmenu/tools/os/slidingbuxc;->b:Lnet/slidingmenu/tools/os/slidingbuxc;
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     monitor-exit v1
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v1
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public static slieysd()Z
a=0;//     .locals 1
a=0;// 
a=0;//     sget-boolean v0, Lnet/slidingmenu/tools/os/slidingbuxc;->c:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public static sliezsd()Z
a=0;//     .locals 1
a=0;// 
a=0;//     sget-boolean v0, Lnet/slidingmenu/tools/os/slidingbuxc;->d:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public static slighsd(Z)V
a=0;//     .locals 0
a=0;// 
a=0;//     sput-boolean p0, Lnet/slidingmenu/tools/os/slidingbuxc;->c:Z
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static sligisd(Z)V
a=0;//     .locals 0
a=0;// 
a=0;//     sput-boolean p0, Lnet/slidingmenu/tools/os/slidingbuxc;->d:Z
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public slidmsd(I)Z
a=0;//     .locals 1
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/os/slidingbuxc;->a:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v0}, Lnet/slidingmenu/tools/os/d/b/e;->a(Landroid/content/Context;)Lnet/slidingmenu/tools/os/d/b/e;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Lnet/slidingmenu/tools/os/d/b/e;->a(I)Z
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
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-static {v0}, Lnet/slidingmenu/tools/b/c/b/a;->a(Ljava/lang/Throwable;)V
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public slifzsd()I
a=0;//     .locals 1
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/os/slidingbuxc;->a:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v0}, Lnet/slidingmenu/tools/os/d/b/e;->a(Landroid/content/Context;)Lnet/slidingmenu/tools/os/d/b/e;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lnet/slidingmenu/tools/os/d/b/e;->a()I
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-static {v0}, Lnet/slidingmenu/tools/b/c/b/a;->a(Ljava/lang/Throwable;)V
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public sligasd(Lnet/slidingmenu/tools/os/slidingbsxc;)V
a=0;//     .locals 1
a=0;// 
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/os/slidingbuxc;->a:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v0}, Lnet/slidingmenu/tools/os/d/b/b;->a(Landroid/content/Context;)Lnet/slidingmenu/tools/os/d/b/b;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Lnet/slidingmenu/tools/os/d/b/b;->a(Ljava/lang/Object;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-static {v0}, Lnet/slidingmenu/tools/b/c/b/a;->a(Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public sligbsd(Lnet/slidingmenu/tools/os/slidingbtxc;)V
a=0;//     .locals 1
a=0;// 
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/os/slidingbuxc;->a:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v0}, Lnet/slidingmenu/tools/os/b;->a(Landroid/content/Context;)Lnet/slidingmenu/tools/os/b;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Lnet/slidingmenu/tools/os/b;->a(Ljava/lang/Object;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-static {v0}, Lnet/slidingmenu/tools/b/c/b/a;->a(Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public sligusd(I)Z
a=0;//     .locals 1
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/os/slidingbuxc;->a:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v0}, Lnet/slidingmenu/tools/os/d/b/e;->a(Landroid/content/Context;)Lnet/slidingmenu/tools/os/d/b/e;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Lnet/slidingmenu/tools/os/d/b/e;->b(I)Z
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
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-static {v0}, Lnet/slidingmenu/tools/b/c/b/a;->a(Ljava/lang/Throwable;)V
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public sligysd(Lnet/slidingmenu/tools/os/slidingbsxc;)V
a=0;//     .locals 1
a=0;// 
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/os/slidingbuxc;->a:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v0}, Lnet/slidingmenu/tools/os/d/b/b;->a(Landroid/content/Context;)Lnet/slidingmenu/tools/os/d/b/b;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Lnet/slidingmenu/tools/os/d/b/b;->b(Ljava/lang/Object;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-static {v0}, Lnet/slidingmenu/tools/b/c/b/a;->a(Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public sligzsd(Lnet/slidingmenu/tools/os/slidingbtxc;)V
a=0;//     .locals 1
a=0;// 
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/os/slidingbuxc;->a:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v0}, Lnet/slidingmenu/tools/os/b;->a(Landroid/content/Context;)Lnet/slidingmenu/tools/os/b;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Lnet/slidingmenu/tools/os/b;->b(Ljava/lang/Object;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-static {v0}, Lnet/slidingmenu/tools/b/c/b/a;->a(Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
