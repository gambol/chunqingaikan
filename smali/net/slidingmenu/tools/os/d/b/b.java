package net.slidingmenu.tools.os.d.b; class b { void a() { int a;
a=0;// .class public Lnet/slidingmenu/tools/os/d/b/b;
a=0;// .super Lnet/slidingmenu/tools/b/b/j/a;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static b:Lnet/slidingmenu/tools/os/d/b/b;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private a:Landroid/content/Context;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 2
a=0;// 
a=0;//     invoke-direct {p0}, Lnet/slidingmenu/tools/b/b/j/a;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lnet/slidingmenu/tools/os/d/b/b;);
a=0;//     invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     iput-object v0, p0, Lnet/slidingmenu/tools/os/d/b/b;->a:Landroid/content/Context;
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/os/d/b/b;->a:Landroid/content/Context;
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     new-instance v0, Ljava/lang/NullPointerException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/NullPointerException;);
a=0;//     const-string v1, "Context is null"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/NullPointerException;);
a=0;//     throw v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Uninit);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static declared-synchronized a(Landroid/content/Context;)Lnet/slidingmenu/tools/os/d/b/b;
a=0;//     .locals 3
a=0;// 
a=0;//     const-class v1, Lnet/slidingmenu/tools/os/d/b/b;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     :try_start_0
a=0;//     sget-object v0, Lnet/slidingmenu/tools/os/d/b/b;->b:Lnet/slidingmenu/tools/os/d/b/b;
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/os/d/b/b;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     new-instance v0, Lnet/slidingmenu/tools/os/d/b/b;
a=0;// 
a=0;//     #v0=(UninitRef,Lnet/slidingmenu/tools/os/d/b/b;);
a=0;//     invoke-direct {v0, p0}, Lnet/slidingmenu/tools/os/d/b/b;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/os/d/b/b;);
a=0;//     sput-object v0, Lnet/slidingmenu/tools/os/d/b/b;->b:Lnet/slidingmenu/tools/os/d/b/b;
a=0;// 
a=0;//     :cond_0
a=0;//     sget-object v0, Lnet/slidingmenu/tools/os/d/b/b;->b:Lnet/slidingmenu/tools/os/d/b/b;
a=0;// 
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     new-instance v0, Ljava/lang/NullPointerException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/NullPointerException;);
a=0;//     const-string v2, "Context is null"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/NullPointerException;);
a=0;//     throw v0
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v1
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     :cond_1
a=0;//     :try_start_1
a=0;//     #v2=(Uninit);
a=0;//     sget-object v0, Lnet/slidingmenu/tools/os/d/b/b;->b:Lnet/slidingmenu/tools/os/d/b/b;
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     monitor-exit v1
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method a()V
a=0;//     .locals 6
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/os/d/b/b;->a:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v0}, Lnet/slidingmenu/tools/os/d/b/e;->a(Landroid/content/Context;)Lnet/slidingmenu/tools/os/d/b/e;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lnet/slidingmenu/tools/os/d/b/e;->a()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     :try_start_0
a=0;//     #v2=(Integer);
a=0;//     invoke-static {}, Lnet/slidingmenu/tools/os/d/b/a;->a()Lnet/slidingmenu/tools/os/d/b/a;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Lnet/slidingmenu/tools/os/d/b/a;->slifusd(I)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_2
a=0;// 
a=0;//     :goto_0
a=0;//     :try_start_1
a=0;//     invoke-virtual {p0}, Lnet/slidingmenu/tools/os/d/b/b;->g()Ljava/util/List;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/List;);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     invoke-interface {v3}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-gtz v0, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(Uninit);v3=(Reference,Ljava/util/List;);v4=(Uninit);v5=(Uninit);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move v1, v0
a=0;// 
a=0;//     :goto_2
a=0;//     #v0=(Integer);v1=(Integer);v4=(Conflicted);v5=(Conflicted);
a=0;//     invoke-interface {v3}, Ljava/util/List;->size()I
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-ge v1, v0, :cond_0
a=0;// 
a=0;//     :try_start_2
a=0;//     invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lnet/slidingmenu/tools/os/slidingbsxc;
a=0;// 
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     invoke-static {}, Lnet/slidingmenu/tools/b/b/k/m;->b()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_3
a=0;// 
a=0;//     invoke-interface {v0, v2}, Lnet/slidingmenu/tools/os/slidingbsxc;->slifusd(I)V
a=0;// 
a=0;//     :cond_2
a=0;//     :goto_3
a=0;//     #v4=(Conflicted);
a=0;//     add-int/lit8 v0, v1, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/os/slidingbsxc;);v4=(Boolean);
a=0;//     invoke-static {}, Lnet/slidingmenu/tools/b/b/k/m;->a()Lnet/slidingmenu/tools/b/b/k/m;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Lnet/slidingmenu/tools/b/b/k/m;);
a=0;//     new-instance v5, Lnet/slidingmenu/tools/os/d/b/c;
a=0;// 
a=0;//     #v5=(UninitRef,Lnet/slidingmenu/tools/os/d/b/c;);
a=0;//     invoke-direct {v5, p0, v0, v2}, Lnet/slidingmenu/tools/os/d/b/c;-><init>(Lnet/slidingmenu/tools/os/d/b/b;Lnet/slidingmenu/tools/os/slidingbsxc;I)V
a=0;// 
a=0;//     #v5=(Reference,Lnet/slidingmenu/tools/os/d/b/c;);
a=0;//     invoke-virtual {v4, v5}, Lnet/slidingmenu/tools/b/b/k/m;->a(Ljava/lang/Runnable;)Z
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_0
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     :try_start_3
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     const-string v4, "\u7b2c[%d]\u4e2a\u79ef\u5206\u4f59\u989d\u53d8\u52a8\u76d1\u542c\u56de\u8c03\u6709\u95ee\u9898\uff01\uff01\uff01"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v4, v0}, Lnet/slidingmenu/tools/b/c/b/a;->b(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;//     :try_end_3
a=0;//     .catch Ljava/lang/Throwable; {:try_start_3 .. :try_end_3} :catch_1
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     :catch_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :catch_2
a=0;//     #v1=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
