package net.slidingmenu.tools.b.b.f; class k { void a() { int a;
a=0;// .class public Lnet/slidingmenu/tools/b/b/f/k;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static d:Lnet/slidingmenu/tools/b/b/f/k;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private a:[Ljava/lang/String;
a=0;// 
a=0;// .field private b:[Lnet/slidingmenu/tools/b/b/f/j;
a=0;// 
a=0;// .field private c:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-static {}, Lnet/slidingmenu/tools/b/b/f/k;->c()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 3
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     const/4 v2, -0x1
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lnet/slidingmenu/tools/b/b/f/k;);
a=0;//     iput-object v0, p0, Lnet/slidingmenu/tools/b/b/f/k;->a:[Ljava/lang/String;
a=0;// 
a=0;//     iput-object v0, p0, Lnet/slidingmenu/tools/b/b/f/k;->b:[Lnet/slidingmenu/tools/b/b/f/j;
a=0;// 
a=0;//     iput v2, p0, Lnet/slidingmenu/tools/b/b/f/k;->c:I
a=0;// 
a=0;//     invoke-direct {p0}, Lnet/slidingmenu/tools/b/b/f/k;->d()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     invoke-direct {p0}, Lnet/slidingmenu/tools/b/b/f/k;->e()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/b/f/k;->a:[Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/String;);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/b/f/k;->b:[Lnet/slidingmenu/tools/b/b/f/j;
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     :cond_2
a=0;//     const-string v0, "os.name"
a=0;// 
a=0;//     invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     const-string v0, "java.vendor"
a=0;// 
a=0;//     invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "Android"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-eq v0, v2, :cond_0
a=0;// 
a=0;//     invoke-direct {p0}, Lnet/slidingmenu/tools/b/b/f/k;->f()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private a(Ljava/lang/String;Ljava/util/List;)V
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-interface {p2, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     :cond_0
a=0;//     invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private a(Ljava/util/List;Ljava/util/List;)V
a=0;//     .locals 2
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/b/f/k;->a:[Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/String;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     invoke-interface {p1}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_0
a=0;// 
a=0;//     new-array v0, v1, [Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/String;);
a=0;//     invoke-interface {p1, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, [Ljava/lang/String;
a=0;// 
a=0;//     check-cast v0, [Ljava/lang/String;
a=0;// 
a=0;//     iput-object v0, p0, Lnet/slidingmenu/tools/b/b/f/k;->a:[Ljava/lang/String;
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/b/f/k;->b:[Lnet/slidingmenu/tools/b/b/f/j;
a=0;// 
a=0;//     #v0=(Reference,[Lnet/slidingmenu/tools/b/b/f/j;);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     invoke-interface {p2}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_1
a=0;// 
a=0;//     new-array v0, v1, [Lnet/slidingmenu/tools/b/b/f/j;
a=0;// 
a=0;//     #v0=(Reference,[Lnet/slidingmenu/tools/b/b/f/j;);
a=0;//     invoke-interface {p2, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, [Lnet/slidingmenu/tools/b/b/f/j;
a=0;// 
a=0;//     check-cast v0, [Lnet/slidingmenu/tools/b/b/f/j;
a=0;// 
a=0;//     iput-object v0, p0, Lnet/slidingmenu/tools/b/b/f/k;->b:[Lnet/slidingmenu/tools/b/b/f/j;
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static declared-synchronized b()Lnet/slidingmenu/tools/b/b/f/k;
a=0;//     .locals 2
a=0;// 
a=0;//     const-class v0, Lnet/slidingmenu/tools/b/b/f/k;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v0
a=0;// 
a=0;//     :try_start_0
a=0;//     sget-object v1, Lnet/slidingmenu/tools/b/b/f/k;->d:Lnet/slidingmenu/tools/b/b/f/k;
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     #v1=(Reference,Lnet/slidingmenu/tools/b/b/f/k;);
a=0;//     monitor-exit v0
a=0;// 
a=0;//     return-object v1
a=0;// 
a=0;//     :catchall_0
a=0;//     #v1=(Uninit);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v0
a=0;// 
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// .method private b(Ljava/lang/String;Ljava/util/List;)V
a=0;//     .locals 2
a=0;// 
a=0;//     :try_start_0
a=0;//     sget-object v0, Lnet/slidingmenu/tools/b/b/f/j;->a:Lnet/slidingmenu/tools/b/b/f/j;
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/b/b/f/j;);
a=0;//     invoke-static {p1, v0}, Lnet/slidingmenu/tools/b/b/f/j;->a(Ljava/lang/String;Lnet/slidingmenu/tools/b/b/f/j;)Lnet/slidingmenu/tools/b/b/f/j;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {p2, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Boolean);
a=0;//     invoke-interface {p2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static c()V
a=0;//     .locals 2
a=0;// 
a=0;//     new-instance v0, Lnet/slidingmenu/tools/b/b/f/k;
a=0;// 
a=0;//     #v0=(UninitRef,Lnet/slidingmenu/tools/b/b/f/k;);
a=0;//     invoke-direct {v0}, Lnet/slidingmenu/tools/b/b/f/k;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/b/b/f/k;);
a=0;//     const-class v1, Lnet/slidingmenu/tools/b/b/f/k;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     :try_start_0
a=0;//     sput-object v0, Lnet/slidingmenu/tools/b/b/f/k;->d:Lnet/slidingmenu/tools/b/b/f/k;
a=0;// 
a=0;//     monitor-exit v1
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     :catchall_0
a=0;//     move-exception v0
a=0;// 
a=0;//     monitor-exit v1
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method private d()Z
a=0;//     .locals 6
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     new-instance v1, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     new-instance v2, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(I)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     const-string v3, "dns.server"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     new-instance v4, Ljava/util/StringTokenizer;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/util/StringTokenizer;);
a=0;//     const-string v5, ","
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v4, v3, v5}, Ljava/util/StringTokenizer;-><init>(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     :goto_0
a=0;//     #v4=(Reference,Ljava/util/StringTokenizer;);
a=0;//     invoke-virtual {v4}, Ljava/util/StringTokenizer;->hasMoreTokens()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/util/StringTokenizer;->nextToken()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0, v3, v1}, Lnet/slidingmenu/tools/b/b/f/k;->a(Ljava/lang/String;Ljava/util/List;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_0
a=0;//     #v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     const-string v3, "dns.search"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     new-instance v4, Ljava/util/StringTokenizer;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/util/StringTokenizer;);
a=0;//     const-string v5, ","
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v4, v3, v5}, Ljava/util/StringTokenizer;-><init>(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     :goto_1
a=0;//     #v4=(Reference,Ljava/util/StringTokenizer;);
a=0;//     invoke-virtual {v4}, Ljava/util/StringTokenizer;->hasMoreTokens()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/util/StringTokenizer;->nextToken()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0, v3, v2}, Lnet/slidingmenu/tools/b/b/f/k;->b(Ljava/lang/String;Ljava/util/List;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_1
a=0;//     #v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     invoke-direct {p0, v1, v2}, Lnet/slidingmenu/tools/b/b/f/k;->a(Ljava/util/List;Ljava/util/List;)V
a=0;// 
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/b/b/f/k;->a:[Ljava/lang/String;
a=0;// 
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/b/b/f/k;->b:[Lnet/slidingmenu/tools/b/b/f/j;
a=0;// 
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method private e()Z
a=0;//     .locals 9
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     new-instance v3, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v3, v2}, Ljava/util/ArrayList;-><init>(I)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     new-instance v4, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v4, v2}, Ljava/util/ArrayList;-><init>(I)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/ArrayList;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :try_start_0
a=0;//     #v0=(Null);
a=0;//     new-array v1, v0, [Ljava/lang/Class;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Class;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     new-array v5, v0, [Ljava/lang/Object;
a=0;// 
a=0;//     #v5=(Reference,[Ljava/lang/Object;);
a=0;//     const-string v0, "sun.net.dns.ResolverConfiguration"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Class;);
a=0;//     const-string v0, "open"
a=0;// 
a=0;//     invoke-virtual {v6, v0, v1}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     invoke-virtual {v0, v7, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/Object;);
a=0;//     const-string v0, "nameservers"
a=0;// 
a=0;//     invoke-virtual {v6, v0, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v7, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/util/List;
a=0;// 
a=0;//     const-string v8, "searchlist"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v8, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, v7, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, Ljava/util/List;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     if-nez v5, :cond_0
a=0;// 
a=0;//     move v0, v2
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Reference,Ljava/lang/Object;);v2=(Null);
a=0;//     move-exception v0
a=0;// 
a=0;//     move v0, v2
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Ljava/util/List;);v1=(Reference,Ljava/util/List;);v5=(Integer);v6=(Reference,Ljava/lang/Class;);v7=(Reference,Ljava/lang/Object;);v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-lez v2, :cond_1
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     :goto_1
a=0;//     #v2=(Reference,Ljava/util/Iterator;);
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     invoke-direct {p0, v0, v3}, Lnet/slidingmenu/tools/b/b/f/k;->a(Ljava/lang/String;Ljava/util/List;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     invoke-interface {v1}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_2
a=0;// 
a=0;//     invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :goto_2
a=0;//     #v0=(Conflicted);
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     invoke-direct {p0, v0, v4}, Lnet/slidingmenu/tools/b/b/f/k;->b(Ljava/lang/String;Ljava/util/List;)V
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Integer);
a=0;//     invoke-direct {p0, v3, v4}, Lnet/slidingmenu/tools/b/b/f/k;->a(Ljava/util/List;Ljava/util/List;)V
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private f()V
a=0;//     .locals 8
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     const-string v1, "^\\d+(\\.\\d+){3}$"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "^[0-9a-f]+(:[0-9a-f]*)+:[0-9a-f]+$"
a=0;// 
a=0;//     new-instance v2, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     new-instance v3, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     :try_start_0
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     const-string v1, "android.os.SystemProperties"
a=0;// 
a=0;//     invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v4, "get"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     new-array v5, v5, [Ljava/lang/Class;
a=0;// 
a=0;//     #v5=(Reference,[Ljava/lang/Class;);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     const-class v7, Ljava/lang/String;
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/Class;);
a=0;//     aput-object v7, v5, v6
a=0;// 
a=0;//     invoke-virtual {v1, v4, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const/4 v1, 0x4
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     new-array v5, v1, [Ljava/lang/String;
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const-string v6, "net.dns1"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     aput-object v6, v5, v1
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const-string v6, "net.dns2"
a=0;// 
a=0;//     aput-object v6, v5, v1
a=0;// 
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     const-string v6, "net.dns3"
a=0;// 
a=0;//     aput-object v6, v5, v1
a=0;// 
a=0;//     const/4 v1, 0x3
a=0;// 
a=0;//     const-string v6, "net.dns4"
a=0;// 
a=0;//     aput-object v6, v5, v1
a=0;// 
a=0;//     move v1, v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Integer);v6=(Conflicted);
a=0;//     array-length v0, v5
a=0;// 
a=0;//     if-ge v1, v0, :cond_2
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     new-array v0, v0, [Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     aget-object v7, v5, v1
a=0;// 
a=0;//     #v7=(Null);
a=0;//     aput-object v7, v0, v6
a=0;// 
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     invoke-virtual {v4, v6, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     const-string v6, "^\\d+(\\.\\d+){3}$"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v6}, Ljava/lang/String;->matches(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-nez v6, :cond_0
a=0;// 
a=0;//     const-string v6, "^[0-9a-f]+(:[0-9a-f]*)+:[0-9a-f]+$"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v6}, Ljava/lang/String;->matches(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     invoke-virtual {v2, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     if-nez v6, :cond_1
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :cond_1
a=0;//     add-int/lit8 v0, v1, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     :cond_2
a=0;//     invoke-direct {p0, v2, v3}, Lnet/slidingmenu/tools/b/b/f/k;->a(Ljava/util/List;Ljava/util/List;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public a()Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/b/f/k;->a:[Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/String;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Null);v1=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,[Ljava/lang/String;);v1=(Uninit);
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/b/f/k;->a:[Ljava/lang/String;
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     aget-object v0, v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
}}
