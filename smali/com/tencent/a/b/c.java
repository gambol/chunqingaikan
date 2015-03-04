package com.tencent.a.b; class c { void a() { int a;
a=0;// .class public final Lcom/tencent/a/b/c;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/tencent/a/b/c$b;,
a=0;//         Lcom/tencent/a/b/c$a;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static a:Lcom/tencent/a/b/c;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private b:J
a=0;// 
a=0;// .field private c:Ljava/util/List;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Lcom/tencent/a/b/c$a;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private d:Ljava/util/List;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Lcom/tencent/a/b/c$b;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private e:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 2
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/tencent/a/b/c;);
a=0;//     const-wide/16 v0, 0x0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     iput-wide v0, p0, Lcom/tencent/a/b/c;->b:J
a=0;// 
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, p0, Lcom/tencent/a/b/c;->c:Ljava/util/List;
a=0;// 
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, p0, Lcom/tencent/a/b/c;->d:Ljava/util/List;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static a()Lcom/tencent/a/b/c;
a=0;//     .locals 1
a=0;// 
a=0;//     sget-object v0, Lcom/tencent/a/b/c;->a:Lcom/tencent/a/b/c;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/a/b/c;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     new-instance v0, Lcom/tencent/a/b/c;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/a/b/c;);
a=0;//     invoke-direct {v0}, Lcom/tencent/a/b/c;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/a/b/c;);
a=0;//     sput-object v0, Lcom/tencent/a/b/c;->a:Lcom/tencent/a/b/c;
a=0;// 
a=0;//     :cond_0
a=0;//     sget-object v0, Lcom/tencent/a/b/c;->a:Lcom/tencent/a/b/c;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private static a(Ljava/lang/StringBuffer;)Z
a=0;//     .locals 5
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :try_start_0
a=0;//     #v0=(Null);
a=0;//     new-instance v1, Lorg/json/JSONObject;
a=0;// 
a=0;//     #v1=(UninitRef,Lorg/json/JSONObject;);
a=0;//     invoke-virtual {p0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Lorg/json/JSONObject;);
a=0;//     const-string v2, "location"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "accuracy"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Lorg/json/JSONObject;->getDouble(Ljava/lang/String;)D
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-wide v1
a=0;// 
a=0;//     #v1=(DoubleLo);v2=(DoubleHi);
a=0;//     const-wide v3, 0x40b3880000000000L    # 5000.0
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     cmpg-double v1, v1, v3
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-gez v1, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Null);v3=(Uninit);v4=(Uninit);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private a(Ljava/util/List;)Z
a=0;//     .locals 9
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Landroid/net/wifi/ScanResult;",
a=0;//             ">;)Z"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     const/4 v8, 0x6
a=0;// 
a=0;//     #v8=(PosByte);
a=0;//     const/4 v7, 0x2
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     if-nez p1, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Boolean);v3=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     return v2
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Null);v3=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     iget-object v0, p0, Lcom/tencent/a/b/c;->d:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     move v1, v2
a=0;// 
a=0;//     #v1=(Null);
a=0;//     move v3, v2
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Integer);v3=(Integer);v5=(Conflicted);v6=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/tencent/a/b/c;->d:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v0}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ge v1, v0, :cond_5
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/a/b/c;->d:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/tencent/a/b/c$b;
a=0;// 
a=0;//     iget-object v6, v0, Lcom/tencent/a/b/c$b;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     move v5, v2
a=0;// 
a=0;//     :goto_2
a=0;//     #v0=(Conflicted);v5=(Integer);
a=0;//     if-eqz v6, :cond_2
a=0;// 
a=0;//     invoke-interface {p1}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ge v5, v0, :cond_2
a=0;// 
a=0;//     invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/net/wifi/ScanResult;
a=0;// 
a=0;//     iget-object v0, v0, Landroid/net/wifi/ScanResult;->BSSID:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v6, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     add-int/lit8 v3, v3, 0x1
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);
a=0;//     add-int/lit8 v0, v1, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Boolean);
a=0;//     add-int/lit8 v0, v5, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v5, v0
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(Reference,Ljava/util/List;);v1=(Uninit);v3=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     move v3, v2
a=0;// 
a=0;//     :cond_5
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Integer);v5=(Conflicted);v6=(Conflicted);
a=0;//     invoke-interface {p1}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lt v0, v8, :cond_6
a=0;// 
a=0;//     div-int/lit8 v1, v0, 0x2
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     if-lt v3, v1, :cond_6
a=0;// 
a=0;//     move v2, v4
a=0;// 
a=0;//     #v2=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_6
a=0;//     #v1=(Conflicted);v2=(Null);
a=0;//     if-ge v0, v8, :cond_7
a=0;// 
a=0;//     if-lt v3, v7, :cond_7
a=0;// 
a=0;//     move v2, v4
a=0;// 
a=0;//     #v2=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_7
a=0;//     #v2=(Null);
a=0;//     iget-object v0, p0, Lcom/tencent/a/b/c;->d:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v0}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-gt v0, v7, :cond_0
a=0;// 
a=0;//     invoke-interface {p1}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-gt v0, v7, :cond_0
a=0;// 
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     iget-wide v5, p0, Lcom/tencent/a/b/c;->b:J
a=0;// 
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     sub-long/2addr v0, v5
a=0;// 
a=0;//     invoke-static {v0, v1}, Ljava/lang/Math;->abs(J)J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     const-wide/16 v5, 0x7530
a=0;// 
a=0;//     cmp-long v0, v0, v5
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-gtz v0, :cond_0
a=0;// 
a=0;//     move v2, v4
a=0;// 
a=0;//     #v2=(One);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final a(IIIILjava/util/List;)V
a=0;//     .locals 4
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(IIII",
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Landroid/net/wifi/ScanResult;",
a=0;//             ">;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     iput-wide v0, p0, Lcom/tencent/a/b/c;->b:J
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/tencent/a/b/c;->e:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/a/b/c;->c:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v0}, Ljava/util/List;->clear()V
a=0;// 
a=0;//     new-instance v0, Lcom/tencent/a/b/c$a;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/a/b/c$a;);
a=0;//     invoke-direct {v0, v2}, Lcom/tencent/a/b/c$a;-><init>(B)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/a/b/c$a;);
a=0;//     iput p1, v0, Lcom/tencent/a/b/c$a;->a:I
a=0;// 
a=0;//     iput p2, v0, Lcom/tencent/a/b/c$a;->b:I
a=0;// 
a=0;//     iput p3, v0, Lcom/tencent/a/b/c$a;->c:I
a=0;// 
a=0;//     iput p4, v0, Lcom/tencent/a/b/c$a;->d:I
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/a/b/c;->c:Ljava/util/List;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     if-eqz p5, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/a/b/c;->d:Ljava/util/List;
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/List;->clear()V
a=0;// 
a=0;//     move v1, v2
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Integer);v3=(Conflicted);
a=0;//     invoke-interface {p5}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ge v1, v0, :cond_0
a=0;// 
a=0;//     new-instance v3, Lcom/tencent/a/b/c$b;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/tencent/a/b/c$b;);
a=0;//     invoke-direct {v3, v2}, Lcom/tencent/a/b/c$b;-><init>(B)V
a=0;// 
a=0;//     #v3=(Reference,Lcom/tencent/a/b/c$b;);
a=0;//     invoke-interface {p5, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/net/wifi/ScanResult;
a=0;// 
a=0;//     iget-object v0, v0, Landroid/net/wifi/ScanResult;->BSSID:Ljava/lang/String;
a=0;// 
a=0;//     iput-object v0, v3, Lcom/tencent/a/b/c$b;->a:Ljava/lang/String;
a=0;// 
a=0;//     invoke-interface {p5, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/net/wifi/ScanResult;
a=0;// 
a=0;//     iget v0, v0, Landroid/net/wifi/ScanResult;->level:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget-object v0, p0, Lcom/tencent/a/b/c;->d:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     add-int/lit8 v0, v1, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final a(Ljava/lang/String;)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Lcom/tencent/a/b/c;->e:Ljava/lang/String;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final b(IIIILjava/util/List;)Ljava/lang/String;
a=0;//     .locals 7
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(IIII",
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Landroid/net/wifi/ScanResult;",
a=0;//             ">;)",
a=0;//             "Ljava/lang/String;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     const/4 v6, 0x2
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iget-object v0, p0, Lcom/tencent/a/b/c;->e:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/a/b/c;->e:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v2, 0xa
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-ge v0, v2, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Reference,Ljava/lang/String;);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-object v1
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(Null);v2=(PosByte);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     iget-object v0, p0, Lcom/tencent/a/b/c;->e:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     if-nez p5, :cond_6
a=0;// 
a=0;//     :cond_2
a=0;//     move-object v0, v1
a=0;// 
a=0;//     :cond_3
a=0;//     :goto_1
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     iput-object v0, p0, Lcom/tencent/a/b/c;->e:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/a/b/c;->e:Ljava/lang/String;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/a/b/c;->c:Ljava/util/List;
a=0;// 
a=0;//     if-eqz v0, :cond_b
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/a/b/c;->c:Ljava/util/List;
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_b
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/a/b/c;->c:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/tencent/a/b/c$a;
a=0;// 
a=0;//     iget v2, v0, Lcom/tencent/a/b/c$a;->a:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ne v2, p1, :cond_0
a=0;// 
a=0;//     iget v2, v0, Lcom/tencent/a/b/c$a;->b:I
a=0;// 
a=0;//     if-ne v2, p2, :cond_0
a=0;// 
a=0;//     iget v2, v0, Lcom/tencent/a/b/c$a;->c:I
a=0;// 
a=0;//     if-ne v2, p3, :cond_0
a=0;// 
a=0;//     iget v0, v0, Lcom/tencent/a/b/c$a;->d:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ne v0, p4, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/a/b/c;->d:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/a/b/c;->d:Ljava/util/List;
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_a
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(Conflicted);
a=0;//     if-eqz p5, :cond_5
a=0;// 
a=0;//     invoke-interface {p5}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_a
a=0;// 
a=0;//     :cond_5
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v1, p0, Lcom/tencent/a/b/c;->e:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_6
a=0;//     #v0=(Reference,Ljava/lang/String;);v1=(Null);v2=(PosByte);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     iget-wide v4, p0, Lcom/tencent/a/b/c;->b:J
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     sub-long/2addr v2, v4
a=0;// 
a=0;//     invoke-static {v2, v3}, Ljava/lang/Math;->abs(J)J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     const-wide/16 v4, 0x7530
a=0;// 
a=0;//     cmp-long v4, v2, v4
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     if-lez v4, :cond_7
a=0;// 
a=0;//     invoke-interface {p5}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-gt v4, v6, :cond_9
a=0;// 
a=0;//     :cond_7
a=0;//     const-wide/32 v4, 0xafc8
a=0;// 
a=0;//     #v4=(LongLo);
a=0;//     cmp-long v2, v2, v4
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-lez v2, :cond_8
a=0;// 
a=0;//     invoke-interface {p5}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-le v2, v6, :cond_9
a=0;// 
a=0;//     :cond_8
a=0;//     new-instance v2, Ljava/lang/StringBuffer;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuffer;);
a=0;//     invoke-direct {v2, v0}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuffer;);
a=0;//     invoke-static {v2}, Lcom/tencent/a/b/c;->a(Ljava/lang/StringBuffer;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_3
a=0;// 
a=0;//     :cond_9
a=0;//     #v2=(Conflicted);v4=(Conflicted);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_a
a=0;//     #v0=(Integer);v2=(Integer);v3=(Conflicted);v5=(Conflicted);
a=0;//     invoke-direct {p0, p5}, Lcom/tencent/a/b/c;->a(Ljava/util/List;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_b
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/a/b/c;->e:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_b
a=0;//     #v0=(Conflicted);v1=(Null);v2=(Conflicted);
a=0;//     invoke-direct {p0, p5}, Lcom/tencent/a/b/c;->a(Ljava/util/List;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/a/b/c;->e:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public final b()V
a=0;//     .locals 1
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/tencent/a/b/c;->e:Ljava/lang/String;
a=0;// 
a=0;//     return-void
a=0;// .end method
}}
