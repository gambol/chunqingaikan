package net.slidingmenu.tools.c; class b { void a() { int a;
a=0;// .class public Lnet/slidingmenu/tools/c/b;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field protected a:Ljava/util/HashMap;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lnet/slidingmenu/tools/c/b;);
a=0;//     new-instance v0, Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v0}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     iput-object v0, p0, Lnet/slidingmenu/tools/c/b;->a:Ljava/util/HashMap;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static a()Lnet/slidingmenu/tools/c/f;
a=0;//     .locals 1
a=0;// 
a=0;//     new-instance v0, Lnet/slidingmenu/tools/c/f;
a=0;// 
a=0;//     #v0=(UninitRef,Lnet/slidingmenu/tools/c/f;);
a=0;//     invoke-direct {v0}, Lnet/slidingmenu/tools/c/f;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/c/f;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static b()Lnet/slidingmenu/tools/c/a;
a=0;//     .locals 1
a=0;// 
a=0;//     new-instance v0, Lnet/slidingmenu/tools/c/a;
a=0;// 
a=0;//     #v0=(UninitRef,Lnet/slidingmenu/tools/c/a;);
a=0;//     invoke-direct {v0}, Lnet/slidingmenu/tools/c/a;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/c/a;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method a(Lnet/slidingmenu/tools/c/k;)Lnet/slidingmenu/tools/c/e;
a=0;//     .locals 6
a=0;// 
a=0;//     new-instance v2, Lnet/slidingmenu/tools/c/e;
a=0;// 
a=0;//     #v2=(UninitRef,Lnet/slidingmenu/tools/c/e;);
a=0;//     invoke-direct {v2}, Lnet/slidingmenu/tools/c/e;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Lnet/slidingmenu/tools/c/e;);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     invoke-virtual {v2, v0, v1}, Lnet/slidingmenu/tools/c/e;->a(J)V
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/c/b;->a:Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-virtual {v0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/Iterator;);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v4=(Reference,Ljava/lang/StringBuilder;);v5=(Conflicted);
a=0;//     invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/util/Map$Entry;
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->length()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lez v1, :cond_0
a=0;// 
a=0;//     const/16 v1, 0x26
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Integer);
a=0;//     invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v5, "="
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v0}, Landroid/net/Uri;->encode(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Conflicted);v5=(Conflicted);
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v0}, Lnet/slidingmenu/tools/c/e;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     invoke-virtual {p1}, Lnet/slidingmenu/tools/c/k;->a()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Lnet/slidingmenu/tools/c/e;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     return-object v2
a=0;// .end method
a=0;// 
a=0;// .method protected c()Lnet/slidingmenu/tools/c/b;
a=0;//     .locals 3
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/c/b;->a:Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     const-string v1, "dv"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     sget-object v2, Landroid/os/Build;->MODEL:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method c(Ljava/lang/String;)Lnet/slidingmenu/tools/c/b;
a=0;//     .locals 2
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/c/b;->a:Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     const-string v1, "pt"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method d(Ljava/lang/String;)Lnet/slidingmenu/tools/c/b;
a=0;//     .locals 2
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/c/b;->a:Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     const-string v1, "appid"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method e(Ljava/lang/String;)Lnet/slidingmenu/tools/c/b;
a=0;//     .locals 2
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/c/b;->a:Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     const-string v1, "ver"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method f(Ljava/lang/String;)Lnet/slidingmenu/tools/c/b;
a=0;//     .locals 2
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/c/b;->a:Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     const-string v1, "cid"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     return-object p0
a=0;// .end method
}}
