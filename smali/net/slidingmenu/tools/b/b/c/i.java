package net.slidingmenu.tools.b.b.c; class i { void a() { int a;
a=0;// .class public Lnet/slidingmenu/tools/b/b/c/i;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field a:Lnet/slidingmenu/tools/b/b/c/e;
a=0;// 
a=0;// .field private b:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Ljava/lang/String;Lnet/slidingmenu/tools/b/b/c/g;)V
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lnet/slidingmenu/tools/b/b/c/i;);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput v0, p0, Lnet/slidingmenu/tools/b/b/c/i;->b:I
a=0;// 
a=0;//     new-instance v0, Lnet/slidingmenu/tools/b/b/c/e;
a=0;// 
a=0;//     #v0=(UninitRef,Lnet/slidingmenu/tools/b/b/c/e;);
a=0;//     invoke-direct {v0, p1, p2}, Lnet/slidingmenu/tools/b/b/c/e;-><init>(Ljava/lang/String;Lnet/slidingmenu/tools/b/b/c/g;)V
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/b/b/c/e;);
a=0;//     iput-object v0, p0, Lnet/slidingmenu/tools/b/b/c/i;->a:Lnet/slidingmenu/tools/b/b/c/e;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Ljava/lang/String;Lnet/slidingmenu/tools/b/b/c/g;I)V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-direct {p0, p1, p2}, Lnet/slidingmenu/tools/b/b/c/i;-><init>(Ljava/lang/String;Lnet/slidingmenu/tools/b/b/c/g;)V
a=0;// 
a=0;//     #p0=(Reference,Lnet/slidingmenu/tools/b/b/c/i;);
a=0;//     iput p3, p0, Lnet/slidingmenu/tools/b/b/c/i;->b:I
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public a()I
a=0;//     .locals 1
a=0;// 
a=0;//     iget v0, p0, Lnet/slidingmenu/tools/b/b/c/i;->b:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 3
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/b/c/i;->a:Lnet/slidingmenu/tools/b/b/c/e;
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/b/b/c/e;);
a=0;//     iget v1, p0, Lnet/slidingmenu/tools/b/b/c/i;->b:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, p1, v1}, Lnet/slidingmenu/tools/b/b/c/e;->a(Ljava/lang/String;I)[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     new-instance v1, Ljava/lang/String;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/String;);
a=0;//     const-string v2, "UTF-8"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v0, v2}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->length()I
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lez v1, :cond_0
a=0;// 
a=0;//     move-object p2, v0
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return-object p2
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public a(Ljava/lang/String;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/b/c/i;->a:Lnet/slidingmenu/tools/b/b/c/e;
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/b/b/c/e;);
a=0;//     invoke-virtual {v0, p1}, Lnet/slidingmenu/tools/b/b/c/e;->a(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public a(Ljava/lang/String;Ljava/lang/String;J)Z
a=0;//     .locals 7
a=0;// 
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     if-eqz p2, :cond_0
a=0;// 
a=0;//     if-nez p1, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     move v0, v6
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_1
a=0;//     :try_start_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     const-string v0, "UTF-8"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,[B);
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/b/c/i;->a:Lnet/slidingmenu/tools/b/b/c/e;
a=0;// 
a=0;//     iget v5, p0, Lnet/slidingmenu/tools/b/b/c/i;->b:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     move-object v1, p1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     move-wide v3, p3
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     invoke-virtual/range {v0 .. v5}, Lnet/slidingmenu/tools/b/b/c/e;->a(Ljava/lang/String;[BJI)Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     move v0, v6
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public b()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/b/c/i;->a:Lnet/slidingmenu/tools/b/b/c/e;
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/b/b/c/e;);
a=0;//     invoke-virtual {v0}, Lnet/slidingmenu/tools/b/b/c/e;->a()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public c()Lnet/slidingmenu/tools/b/b/c/g;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/b/c/i;->a:Lnet/slidingmenu/tools/b/b/c/e;
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/b/b/c/e;);
a=0;//     invoke-virtual {v0}, Lnet/slidingmenu/tools/b/b/c/e;->b()Lnet/slidingmenu/tools/b/b/c/g;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
}}
