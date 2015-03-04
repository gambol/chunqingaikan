package cn.sharesdk.framework.utils; class g { void a() { int a;
a=0;// .class public Lcn/sharesdk/framework/utils/g;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcn/sharesdk/framework/utils/g$1;,
a=0;//         Lcn/sharesdk/framework/utils/g$a;,
a=0;//         Lcn/sharesdk/framework/utils/g$b;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private a:Lcn/sharesdk/framework/utils/g$b;
a=0;// 
a=0;// .field private b:Lcn/sharesdk/framework/utils/h;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 3
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcn/sharesdk/framework/utils/g;);
a=0;//     new-instance v0, Lcn/sharesdk/framework/utils/g$b;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/sharesdk/framework/utils/g$b;);
a=0;//     invoke-direct {v0}, Lcn/sharesdk/framework/utils/g$b;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/utils/g$b;);
a=0;//     iput-object v0, p0, Lcn/sharesdk/framework/utils/g;->a:Lcn/sharesdk/framework/utils/g$b;
a=0;// 
a=0;//     new-instance v0, Lcn/sharesdk/framework/utils/h;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/sharesdk/framework/utils/h;);
a=0;//     const-string v1, "-._~"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-direct {v0, v1, v2}, Lcn/sharesdk/framework/utils/h;-><init>(Ljava/lang/String;Z)V
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/utils/h;);
a=0;//     iput-object v0, p0, Lcn/sharesdk/framework/utils/g;->b:Lcn/sharesdk/framework/utils/h;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private a(JLjava/lang/String;)Ljava/util/ArrayList;
a=0;//     .locals 5
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(J",
a=0;//             "Ljava/lang/String;",
a=0;//             ")",
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Lcn/sharesdk/framework/network/e",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     new-instance v1, Lcn/sharesdk/framework/network/e;
a=0;// 
a=0;//     #v1=(UninitRef,Lcn/sharesdk/framework/network/e;);
a=0;//     const-string v2, "oauth_consumer_key"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     iget-object v3, p0, Lcn/sharesdk/framework/utils/g;->a:Lcn/sharesdk/framework/utils/g$b;
a=0;// 
a=0;//     #v3=(Reference,Lcn/sharesdk/framework/utils/g$b;);
a=0;//     iget-object v3, v3, Lcn/sharesdk/framework/utils/g$b;->a:Ljava/lang/String;
a=0;// 
a=0;//     invoke-direct {v1, v2, v3}, Lcn/sharesdk/framework/network/e;-><init>(Ljava/lang/String;Ljava/lang/Object;)V
a=0;// 
a=0;//     #v1=(Reference,Lcn/sharesdk/framework/network/e;);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     new-instance v1, Lcn/sharesdk/framework/network/e;
a=0;// 
a=0;//     #v1=(UninitRef,Lcn/sharesdk/framework/network/e;);
a=0;//     const-string v2, "oauth_signature_method"
a=0;// 
a=0;//     invoke-direct {v1, v2, p3}, Lcn/sharesdk/framework/network/e;-><init>(Ljava/lang/String;Ljava/lang/Object;)V
a=0;// 
a=0;//     #v1=(Reference,Lcn/sharesdk/framework/network/e;);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     new-instance v1, Lcn/sharesdk/framework/network/e;
a=0;// 
a=0;//     #v1=(UninitRef,Lcn/sharesdk/framework/network/e;);
a=0;//     const-string v2, "oauth_timestamp"
a=0;// 
a=0;//     const-wide/16 v3, 0x3e8
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     div-long v3, p1, v3
a=0;// 
a=0;//     invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2, v3}, Lcn/sharesdk/framework/network/e;-><init>(Ljava/lang/String;Ljava/lang/Object;)V
a=0;// 
a=0;//     #v1=(Reference,Lcn/sharesdk/framework/network/e;);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     new-instance v1, Lcn/sharesdk/framework/network/e;
a=0;// 
a=0;//     #v1=(UninitRef,Lcn/sharesdk/framework/network/e;);
a=0;//     const-string v2, "oauth_nonce"
a=0;// 
a=0;//     invoke-static {p1, p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-direct {v1, v2, v3}, Lcn/sharesdk/framework/network/e;-><init>(Ljava/lang/String;Ljava/lang/Object;)V
a=0;// 
a=0;//     #v1=(Reference,Lcn/sharesdk/framework/network/e;);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     new-instance v1, Lcn/sharesdk/framework/network/e;
a=0;// 
a=0;//     #v1=(UninitRef,Lcn/sharesdk/framework/network/e;);
a=0;//     const-string v2, "oauth_version"
a=0;// 
a=0;//     const-string v3, "1.0"
a=0;// 
a=0;//     invoke-direct {v1, v2, v3}, Lcn/sharesdk/framework/network/e;-><init>(Ljava/lang/String;Ljava/lang/Object;)V
a=0;// 
a=0;//     #v1=(Reference,Lcn/sharesdk/framework/network/e;);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     iget-object v1, p0, Lcn/sharesdk/framework/utils/g;->a:Lcn/sharesdk/framework/utils/g$b;
a=0;// 
a=0;//     iget-object v1, v1, Lcn/sharesdk/framework/utils/g$b;->c:Ljava/lang/String;
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-lez v2, :cond_0
a=0;// 
a=0;//     new-instance v2, Lcn/sharesdk/framework/network/e;
a=0;// 
a=0;//     #v2=(UninitRef,Lcn/sharesdk/framework/network/e;);
a=0;//     const-string v3, "oauth_token"
a=0;// 
a=0;//     invoke-direct {v2, v3, v1}, Lcn/sharesdk/framework/network/e;-><init>(Ljava/lang/String;Ljava/lang/Object;)V
a=0;// 
a=0;//     #v2=(Reference,Lcn/sharesdk/framework/network/e;);
a=0;//     invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private a(JLjava/util/ArrayList;Ljava/lang/String;)Ljava/util/ArrayList;
a=0;//     .locals 8
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(J",
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Lcn/sharesdk/framework/network/e",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;>;",
a=0;//             "Ljava/lang/String;",
a=0;//             ")",
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Lcn/sharesdk/framework/network/e",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     new-instance v3, Ljava/util/HashMap;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v3}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/HashMap;);
a=0;//     if-eqz p3, :cond_0
a=0;// 
a=0;//     invoke-virtual {p3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Reference,Ljava/util/Iterator;);v4=(Conflicted);
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcn/sharesdk/framework/network/e;
a=0;// 
a=0;//     iget-object v4, v0, Lcn/sharesdk/framework/network/e;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v4}, Lcn/sharesdk/framework/utils/g;->a(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     iget-object v0, v0, Lcn/sharesdk/framework/network/e;->b:Ljava/lang/Object;
a=0;// 
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcn/sharesdk/framework/utils/g;->a(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v3, v4, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v4=(Conflicted);
a=0;//     invoke-direct {p0, p1, p2, p4}, Lcn/sharesdk/framework/utils/g;->a(JLjava/lang/String;)Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :goto_1
a=0;//     #v1=(Reference,Ljava/util/Iterator;);
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcn/sharesdk/framework/network/e;
a=0;// 
a=0;//     iget-object v4, v0, Lcn/sharesdk/framework/network/e;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v4}, Lcn/sharesdk/framework/utils/g;->a(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     iget-object v0, v0, Lcn/sharesdk/framework/network/e;->b:Ljava/lang/Object;
a=0;// 
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcn/sharesdk/framework/utils/g;->a(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v3, v4, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v4=(Conflicted);
a=0;//     invoke-virtual {v3}, Ljava/util/HashMap;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     new-array v4, v0, [Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,[Ljava/lang/String;);
a=0;//     invoke-virtual {v3}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Set;);
a=0;//     invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/util/Iterator;);
a=0;//     move v1, v2
a=0;// 
a=0;//     :goto_2
a=0;//     #v0=(Conflicted);v1=(Integer);
a=0;//     invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/util/Map$Entry;
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     aput-object v0, v4, v1
a=0;// 
a=0;//     add-int/lit8 v0, v1, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Boolean);
a=0;//     invoke-static {v4}, Ljava/util/Arrays;->sort([Ljava/lang/Object;)V
a=0;// 
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     array-length v1, v4
a=0;// 
a=0;//     :goto_3
a=0;//     #v2=(Integer);v6=(Conflicted);v7=(Conflicted);
a=0;//     if-ge v2, v1, :cond_3
a=0;// 
a=0;//     aget-object v5, v4, v2
a=0;// 
a=0;//     #v5=(Null);
a=0;//     new-instance v6, Lcn/sharesdk/framework/network/e;
a=0;// 
a=0;//     #v6=(UninitRef,Lcn/sharesdk/framework/network/e;);
a=0;//     invoke-virtual {v3, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/Object;);
a=0;//     invoke-direct {v6, v5, v7}, Lcn/sharesdk/framework/network/e;-><init>(Ljava/lang/String;Ljava/lang/Object;)V
a=0;// 
a=0;//     #v6=(Reference,Lcn/sharesdk/framework/network/e;);
a=0;//     invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     :cond_3
a=0;//     #v5=(Reference,Ljava/util/Iterator;);v6=(Conflicted);v7=(Conflicted);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private a(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Lcn/sharesdk/framework/utils/g$a;)Ljava/util/ArrayList;
a=0;//     .locals 8
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Lcn/sharesdk/framework/network/e",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;>;",
a=0;//             "Lcn/sharesdk/framework/utils/g$a;",
a=0;//             ")",
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Lcn/sharesdk/framework/network/e",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     const/16 v7, 0x26
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     sget-object v1, Lcn/sharesdk/framework/utils/g$1;->a:[I
a=0;// 
a=0;//     #v1=(Reference,[I);
a=0;//     invoke-virtual {p4}, Lcn/sharesdk/framework/utils/g$a;->ordinal()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     aget v1, v1, v4
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     packed-switch v1, :pswitch_data_0
a=0;// 
a=0;//     move-object v1, v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/String;);v1=(Reference,Ljava/lang/String;);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     invoke-direct {p0, v2, v3, v0}, Lcn/sharesdk/framework/utils/g;->a(JLjava/lang/String;)Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-instance v2, Lcn/sharesdk/framework/network/e;
a=0;// 
a=0;//     #v2=(UninitRef,Lcn/sharesdk/framework/network/e;);
a=0;//     const-string v3, "oauth_signature"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3, v1}, Lcn/sharesdk/framework/network/e;-><init>(Ljava/lang/String;Ljava/lang/Object;)V
a=0;// 
a=0;//     #v2=(Reference,Lcn/sharesdk/framework/network/e;);
a=0;//     invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     :pswitch_0
a=0;//     #v0=(Null);v1=(Integer);v2=(LongLo);v3=(LongHi);v4=(Integer);v5=(Uninit);v6=(Uninit);
a=0;//     const-string v0, "HMAC-SHA1"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v4, p0, Lcn/sharesdk/framework/utils/g;->a:Lcn/sharesdk/framework/utils/g$b;
a=0;// 
a=0;//     #v4=(Reference,Lcn/sharesdk/framework/utils/g$b;);
a=0;//     iget-object v4, v4, Lcn/sharesdk/framework/utils/g$b;->b:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {p0, v4}, Lcn/sharesdk/framework/utils/g;->a(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v4, p0, Lcn/sharesdk/framework/utils/g;->a:Lcn/sharesdk/framework/utils/g$b;
a=0;// 
a=0;//     iget-object v4, v4, Lcn/sharesdk/framework/utils/g$b;->d:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {p0, v4}, Lcn/sharesdk/framework/utils/g;->a(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v4, "utf-8"
a=0;// 
a=0;//     invoke-virtual {v1, v4}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     new-instance v4, Ljavax/crypto/spec/SecretKeySpec;
a=0;// 
a=0;//     #v4=(UninitRef,Ljavax/crypto/spec/SecretKeySpec;);
a=0;//     const-string v5, "HMAC-SHA1"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v4, v1, v5}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljavax/crypto/spec/SecretKeySpec;);
a=0;//     const-string v1, "HMAC-SHA1"
a=0;// 
a=0;//     invoke-static {v1}, Ljavax/crypto/Mac;->getInstance(Ljava/lang/String;)Ljavax/crypto/Mac;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, v4}, Ljavax/crypto/Mac;->init(Ljava/security/Key;)V
a=0;// 
a=0;//     invoke-direct {p0, v2, v3, p3, v0}, Lcn/sharesdk/framework/utils/g;->a(JLjava/util/ArrayList;Ljava/lang/String;)Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-direct {p0, v4}, Lcn/sharesdk/framework/utils/g;->b(Ljava/util/ArrayList;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v5, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v6}, Lcn/sharesdk/framework/utils/g;->a(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {p0, v4}, Lcn/sharesdk/framework/utils/g;->a(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, "utf-8"
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     new-instance v5, Ljava/lang/String;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v4}, Ljavax/crypto/Mac;->doFinal([B)[B
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-static {v1, v4}, Landroid/util/Base64;->encode([BI)[B
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v5, v1}, Ljava/lang/String;-><init>([B)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :pswitch_1
a=0;//     #v0=(Null);v1=(Integer);v4=(Integer);v5=(Uninit);v6=(Uninit);
a=0;//     const-string v0, "PLAINTEXT"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v4, p0, Lcn/sharesdk/framework/utils/g;->a:Lcn/sharesdk/framework/utils/g$b;
a=0;// 
a=0;//     #v4=(Reference,Lcn/sharesdk/framework/utils/g$b;);
a=0;//     iget-object v4, v4, Lcn/sharesdk/framework/utils/g$b;->b:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {p0, v4}, Lcn/sharesdk/framework/utils/g;->a(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v4, p0, Lcn/sharesdk/framework/utils/g;->a:Lcn/sharesdk/framework/utils/g$b;
a=0;// 
a=0;//     iget-object v4, v4, Lcn/sharesdk/framework/utils/g$b;->d:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {p0, v4}, Lcn/sharesdk/framework/utils/g;->a(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);v4=(Unknown);v5=(Unknown);v6=(Unknown);v7=(Unknown);p0=(Unknown);p1=(Unknown);p2=(Unknown);p3=(Unknown);p4=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x1
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method private b(Ljava/util/ArrayList;)Ljava/lang/String;
a=0;//     .locals 6
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Lcn/sharesdk/framework/network/e",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;>;)",
a=0;//             "Ljava/lang/String;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     invoke-virtual {p1}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-gtz v0, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     const-string v0, ""
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/String;);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/Iterator;);
a=0;//     move v1, v0
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Integer);v1=(Integer);v4=(Conflicted);v5=(Conflicted);
a=0;//     invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcn/sharesdk/framework/network/e;
a=0;// 
a=0;//     if-lez v1, :cond_2
a=0;// 
a=0;//     const/16 v4, 0x26
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     :cond_2
a=0;//     #v4=(Conflicted);
a=0;//     iget-object v4, v0, Lcn/sharesdk/framework/network/e;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const/16 v5, 0x3d
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     iget-object v0, v0, Lcn/sharesdk/framework/network/e;->b:Ljava/lang/Object;
a=0;// 
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     add-int/lit8 v0, v1, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Boolean);v4=(Conflicted);v5=(Conflicted);
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public a()Lcn/sharesdk/framework/utils/g$b;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/utils/g;->a:Lcn/sharesdk/framework/utils/g$b;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/utils/g$b;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public a(Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     const-string v0, ""
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Uninit);
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/utils/g;->b:Lcn/sharesdk/framework/utils/h;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/utils/h;);
a=0;//     invoke-virtual {v0, p1}, Lcn/sharesdk/framework/utils/h;->escape(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public a(Ljava/lang/String;Ljava/util/ArrayList;)Ljava/util/ArrayList;
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Lcn/sharesdk/framework/network/e",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;>;)",
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Lcn/sharesdk/framework/network/e",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     sget-object v0, Lcn/sharesdk/framework/utils/g$a;->a:Lcn/sharesdk/framework/utils/g$a;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/utils/g$a;);
a=0;//     invoke-virtual {p0, p1, p2, v0}, Lcn/sharesdk/framework/utils/g;->a(Ljava/lang/String;Ljava/util/ArrayList;Lcn/sharesdk/framework/utils/g$a;)Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public a(Ljava/lang/String;Ljava/util/ArrayList;Lcn/sharesdk/framework/utils/g$a;)Ljava/util/ArrayList;
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Lcn/sharesdk/framework/network/e",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;>;",
a=0;//             "Lcn/sharesdk/framework/utils/g$a;",
a=0;//             ")",
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Lcn/sharesdk/framework/network/e",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     const-string v0, "POST"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0, p1, v0, p2, p3}, Lcn/sharesdk/framework/utils/g;->a(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Lcn/sharesdk/framework/utils/g$a;)Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public a(Ljava/util/ArrayList;)Ljava/util/ArrayList;
a=0;//     .locals 6
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Lcn/sharesdk/framework/network/e",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;>;)",
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Lcn/sharesdk/framework/network/e",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v0, "OAuth "
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/Iterator;);
a=0;//     move v2, v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Conflicted);v2=(Integer);v5=(Conflicted);
a=0;//     invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcn/sharesdk/framework/network/e;
a=0;// 
a=0;//     if-lez v2, :cond_0
a=0;// 
a=0;//     const/16 v1, 0x2c
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v1, v0, Lcn/sharesdk/framework/network/e;->b:Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {p0, v1}, Lcn/sharesdk/framework/utils/g;->a(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v0, v0, Lcn/sharesdk/framework/network/e;->a:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v5, "=\""
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "\""
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     add-int/lit8 v0, v2, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v2, v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Conflicted);v5=(Conflicted);
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     new-instance v1, Lcn/sharesdk/framework/network/e;
a=0;// 
a=0;//     #v1=(UninitRef,Lcn/sharesdk/framework/network/e;);
a=0;//     const-string v2, "Authorization"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-direct {v1, v2, v3}, Lcn/sharesdk/framework/network/e;-><init>(Ljava/lang/String;Ljava/lang/Object;)V
a=0;// 
a=0;//     #v1=(Reference,Lcn/sharesdk/framework/network/e;);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     new-instance v1, Lcn/sharesdk/framework/network/e;
a=0;// 
a=0;//     #v1=(UninitRef,Lcn/sharesdk/framework/network/e;);
a=0;//     const-string v2, "Content-Type"
a=0;// 
a=0;//     const-string v3, "application/x-www-form-urlencoded"
a=0;// 
a=0;//     invoke-direct {v1, v2, v3}, Lcn/sharesdk/framework/network/e;-><init>(Ljava/lang/String;Ljava/lang/Object;)V
a=0;// 
a=0;//     #v1=(Reference,Lcn/sharesdk/framework/network/e;);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public a(Ljava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/utils/g;->a:Lcn/sharesdk/framework/utils/g$b;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/utils/g$b;);
a=0;//     iput-object p1, v0, Lcn/sharesdk/framework/utils/g$b;->c:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/utils/g;->a:Lcn/sharesdk/framework/utils/g$b;
a=0;// 
a=0;//     iput-object p2, v0, Lcn/sharesdk/framework/utils/g$b;->d:Ljava/lang/String;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/utils/g;->a:Lcn/sharesdk/framework/utils/g$b;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/utils/g$b;);
a=0;//     iput-object p1, v0, Lcn/sharesdk/framework/utils/g$b;->a:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/utils/g;->a:Lcn/sharesdk/framework/utils/g$b;
a=0;// 
a=0;//     iput-object p2, v0, Lcn/sharesdk/framework/utils/g$b;->b:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/utils/g;->a:Lcn/sharesdk/framework/utils/g$b;
a=0;// 
a=0;//     iput-object p3, v0, Lcn/sharesdk/framework/utils/g$b;->e:Ljava/lang/String;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public b(Ljava/lang/String;Ljava/util/ArrayList;)Ljava/util/ArrayList;
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Lcn/sharesdk/framework/network/e",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;>;)",
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Lcn/sharesdk/framework/network/e",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     sget-object v0, Lcn/sharesdk/framework/utils/g$a;->a:Lcn/sharesdk/framework/utils/g$a;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/utils/g$a;);
a=0;//     invoke-virtual {p0, p1, p2, v0}, Lcn/sharesdk/framework/utils/g;->b(Ljava/lang/String;Ljava/util/ArrayList;Lcn/sharesdk/framework/utils/g$a;)Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public b(Ljava/lang/String;Ljava/util/ArrayList;Lcn/sharesdk/framework/utils/g$a;)Ljava/util/ArrayList;
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Lcn/sharesdk/framework/network/e",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;>;",
a=0;//             "Lcn/sharesdk/framework/utils/g$a;",
a=0;//             ")",
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Lcn/sharesdk/framework/network/e",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     const-string v0, "GET"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0, p1, v0, p2, p3}, Lcn/sharesdk/framework/utils/g;->a(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Lcn/sharesdk/framework/utils/g$a;)Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public c(Ljava/lang/String;Ljava/util/ArrayList;Lcn/sharesdk/framework/utils/g$a;)Ljava/util/ArrayList;
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Lcn/sharesdk/framework/network/e",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;>;",
a=0;//             "Lcn/sharesdk/framework/utils/g$a;",
a=0;//             ")",
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Lcn/sharesdk/framework/network/e",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     const-string v0, "PUT"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0, p1, v0, p2, p3}, Lcn/sharesdk/framework/utils/g;->a(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Lcn/sharesdk/framework/utils/g$a;)Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
}}
