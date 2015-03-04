package cn.sharesdk.framework.utils; class d { void a() { int a;
a=0;// .class public Lcn/sharesdk/framework/utils/d;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcn/sharesdk/framework/utils/d;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private a(Lorg/json/JSONArray;)Ljava/util/ArrayList;
a=0;//     .locals 5
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lorg/json/JSONArray;",
a=0;//             ")",
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     new-instance v2, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p1}, Lorg/json/JSONArray;->length()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Integer);v4=(Conflicted);
a=0;//     if-ge v1, v3, :cond_2
a=0;// 
a=0;//     invoke-virtual {p1, v1}, Lorg/json/JSONArray;->opt(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     instance-of v4, v0, Lorg/json/JSONObject;
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_1
a=0;// 
a=0;//     check-cast v0, Lorg/json/JSONObject;
a=0;// 
a=0;//     invoke-direct {p0, v0}, Lcn/sharesdk/framework/utils/d;->a(Lorg/json/JSONObject;)Ljava/util/HashMap;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     add-int/lit8 v0, v1, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     instance-of v4, v0, Lorg/json/JSONArray;
a=0;// 
a=0;//     if-eqz v4, :cond_0
a=0;// 
a=0;//     check-cast v0, Lorg/json/JSONArray;
a=0;// 
a=0;//     invoke-direct {p0, v0}, Lcn/sharesdk/framework/utils/d;->a(Lorg/json/JSONArray;)Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Integer);v4=(Conflicted);
a=0;//     return-object v2
a=0;// .end method
a=0;// 
a=0;// .method private a(Lorg/json/JSONObject;)Ljava/util/HashMap;
a=0;//     .locals 5
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lorg/json/JSONObject;",
a=0;//             ")",
a=0;//             "Ljava/util/HashMap",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     new-instance v2, Ljava/util/HashMap;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v2}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-virtual {p1}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Reference,Ljava/util/Iterator;);v4=(Conflicted);
a=0;//     invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     sget-object v4, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     invoke-virtual {v4, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_1
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     :cond_1
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     instance-of v4, v1, Lorg/json/JSONObject;
a=0;// 
a=0;//     if-eqz v4, :cond_3
a=0;// 
a=0;//     check-cast v1, Lorg/json/JSONObject;
a=0;// 
a=0;//     invoke-direct {p0, v1}, Lcn/sharesdk/framework/utils/d;->a(Lorg/json/JSONObject;)Ljava/util/HashMap;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :cond_2
a=0;//     :goto_1
a=0;//     invoke-virtual {v2, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_3
a=0;//     instance-of v4, v1, Lorg/json/JSONArray;
a=0;// 
a=0;//     if-eqz v4, :cond_2
a=0;// 
a=0;//     check-cast v1, Lorg/json/JSONArray;
a=0;// 
a=0;//     invoke-direct {p0, v1}, Lcn/sharesdk/framework/utils/d;->a(Lorg/json/JSONArray;)Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(Boolean);v1=(Conflicted);v4=(Conflicted);
a=0;//     return-object v2
a=0;// .end method
a=0;// 
a=0;// .method private a(Ljava/util/ArrayList;)Lorg/json/JSONArray;
a=0;//     .locals 4
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">;)",
a=0;//             "Lorg/json/JSONArray;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     new-instance v1, Lorg/json/JSONArray;
a=0;// 
a=0;//     #v1=(UninitRef,Lorg/json/JSONArray;);
a=0;//     invoke-direct {v1}, Lorg/json/JSONArray;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Lorg/json/JSONArray;);
a=0;//     invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Reference,Ljava/util/Iterator;);v3=(Conflicted);
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     instance-of v3, v0, Ljava/util/HashMap;
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     check-cast v0, Ljava/util/HashMap;
a=0;// 
a=0;//     invoke-direct {p0, v0}, Lcn/sharesdk/framework/utils/d;->b(Ljava/util/HashMap;)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     invoke-virtual {v1, v0}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     instance-of v3, v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     check-cast v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-direct {p0, v0}, Lcn/sharesdk/framework/utils/d;->a(Ljava/util/ArrayList;)Lorg/json/JSONArray;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Boolean);v3=(Conflicted);
a=0;//     return-object v1
a=0;// .end method
a=0;// 
a=0;// .method private a(Ljava/lang/Object;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     instance-of v0, p1, [B
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     instance-of v0, p1, [S
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     instance-of v0, p1, [I
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     instance-of v0, p1, [J
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     instance-of v0, p1, [F
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     instance-of v0, p1, [D
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     instance-of v0, p1, [C
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     instance-of v0, p1, [Z
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     instance-of v0, p1, [Ljava/lang/String;
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     return v0
a=0;// 
a=0;//     :cond_1
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private b(Ljava/lang/Object;)Ljava/util/ArrayList;
a=0;//     .locals 5
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/Object;",
a=0;//             ")",
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<*>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     instance-of v0, p1, [B
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     check-cast p1, [B
a=0;// 
a=0;//     check-cast p1, [B
a=0;// 
a=0;//     array-length v2, p1
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Integer);v2=(Integer);v3=(Conflicted);
a=0;//     if-ge v1, v2, :cond_9
a=0;// 
a=0;//     aget-byte v3, p1, v1
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     invoke-static {v3}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Byte;);
a=0;//     invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Null);v2=(Uninit);v3=(Uninit);
a=0;//     instance-of v0, p1, [S
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     check-cast p1, [S
a=0;// 
a=0;//     check-cast p1, [S
a=0;// 
a=0;//     array-length v2, p1
a=0;// 
a=0;//     :goto_1
a=0;//     #v1=(Integer);v2=(Integer);v3=(Conflicted);
a=0;//     if-ge v1, v2, :cond_9
a=0;// 
a=0;//     aget-short v3, p1, v1
a=0;// 
a=0;//     #v3=(Short);
a=0;//     invoke-static {v3}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Short;);
a=0;//     invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Null);v2=(Uninit);v3=(Uninit);
a=0;//     instance-of v0, p1, [I
a=0;// 
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     check-cast p1, [I
a=0;// 
a=0;//     check-cast p1, [I
a=0;// 
a=0;//     array-length v2, p1
a=0;// 
a=0;//     :goto_2
a=0;//     #v1=(Integer);v2=(Integer);v3=(Conflicted);
a=0;//     if-ge v1, v2, :cond_9
a=0;// 
a=0;//     aget v3, p1, v1
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Boolean);v1=(Null);v2=(Uninit);v3=(Uninit);
a=0;//     instance-of v0, p1, [J
a=0;// 
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     check-cast p1, [J
a=0;// 
a=0;//     check-cast p1, [J
a=0;// 
a=0;//     array-length v2, p1
a=0;// 
a=0;//     :goto_3
a=0;//     #v1=(Integer);v2=(Integer);v3=(Conflicted);v4=(Conflicted);
a=0;//     if-ge v1, v2, :cond_9
a=0;// 
a=0;//     aget-wide v3, p1, v1
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Long;);
a=0;//     invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Boolean);v1=(Null);v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     instance-of v0, p1, [F
a=0;// 
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     check-cast p1, [F
a=0;// 
a=0;//     check-cast p1, [F
a=0;// 
a=0;//     array-length v2, p1
a=0;// 
a=0;//     :goto_4
a=0;//     #v1=(Integer);v2=(Integer);v3=(Conflicted);
a=0;//     if-ge v1, v2, :cond_9
a=0;// 
a=0;//     aget v3, p1, v1
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Float;);
a=0;//     invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(Boolean);v1=(Null);v2=(Uninit);v3=(Uninit);
a=0;//     instance-of v0, p1, [D
a=0;// 
a=0;//     if-eqz v0, :cond_5
a=0;// 
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     check-cast p1, [D
a=0;// 
a=0;//     check-cast p1, [D
a=0;// 
a=0;//     array-length v2, p1
a=0;// 
a=0;//     :goto_5
a=0;//     #v1=(Integer);v2=(Integer);v3=(Conflicted);v4=(Conflicted);
a=0;//     if-ge v1, v2, :cond_9
a=0;// 
a=0;//     aget-wide v3, p1, v1
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Double;);
a=0;//     invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_5
a=0;// 
a=0;//     :cond_5
a=0;//     #v0=(Boolean);v1=(Null);v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     instance-of v0, p1, [C
a=0;// 
a=0;//     if-eqz v0, :cond_6
a=0;// 
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     check-cast p1, [C
a=0;// 
a=0;//     check-cast p1, [C
a=0;// 
a=0;//     array-length v2, p1
a=0;// 
a=0;//     :goto_6
a=0;//     #v1=(Integer);v2=(Integer);v3=(Conflicted);
a=0;//     if-ge v1, v2, :cond_9
a=0;// 
a=0;//     aget-char v3, p1, v1
a=0;// 
a=0;//     #v3=(Char);
a=0;//     invoke-static {v3}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Character;);
a=0;//     invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_6
a=0;// 
a=0;//     :cond_6
a=0;//     #v0=(Boolean);v1=(Null);v2=(Uninit);v3=(Uninit);
a=0;//     instance-of v0, p1, [Z
a=0;// 
a=0;//     if-eqz v0, :cond_7
a=0;// 
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     check-cast p1, [Z
a=0;// 
a=0;//     check-cast p1, [Z
a=0;// 
a=0;//     array-length v2, p1
a=0;// 
a=0;//     :goto_7
a=0;//     #v1=(Integer);v2=(Integer);v3=(Conflicted);
a=0;//     if-ge v1, v2, :cond_9
a=0;// 
a=0;//     aget-boolean v3, p1, v1
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Boolean;);
a=0;//     invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_7
a=0;// 
a=0;//     :cond_7
a=0;//     #v0=(Boolean);v1=(Null);v2=(Uninit);v3=(Uninit);
a=0;//     instance-of v0, p1, [Ljava/lang/String;
a=0;// 
a=0;//     if-eqz v0, :cond_8
a=0;// 
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     check-cast p1, [Ljava/lang/String;
a=0;// 
a=0;//     check-cast p1, [Ljava/lang/String;
a=0;// 
a=0;//     array-length v2, p1
a=0;// 
a=0;//     :goto_8
a=0;//     #v1=(Integer);v2=(Integer);v3=(Conflicted);
a=0;//     if-ge v1, v2, :cond_9
a=0;// 
a=0;//     aget-object v3, p1, v1
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_8
a=0;// 
a=0;//     :cond_8
a=0;//     #v0=(Boolean);v1=(Null);v2=(Uninit);v3=(Uninit);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :cond_9
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);v1=(Integer);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private b(Ljava/util/HashMap;)Lorg/json/JSONObject;
a=0;//     .locals 5
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/util/HashMap",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">;)",
a=0;//             "Lorg/json/JSONObject;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     new-instance v2, Lorg/json/JSONObject;
a=0;// 
a=0;//     #v2=(UninitRef,Lorg/json/JSONObject;);
a=0;//     invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Lorg/json/JSONObject;);
a=0;//     invoke-virtual {p1}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Set;);
a=0;//     invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v3=(Reference,Ljava/util/Iterator;);v4=(Conflicted);
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
a=0;//     check-cast v0, Ljava/util/Map$Entry;
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     instance-of v4, v1, Ljava/util/HashMap;
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_1
a=0;// 
a=0;//     check-cast v1, Ljava/util/HashMap;
a=0;// 
a=0;//     invoke-direct {p0, v1}, Lcn/sharesdk/framework/utils/d;->b(Ljava/util/HashMap;)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     instance-of v4, v1, Ljava/util/ArrayList;
a=0;// 
a=0;//     if-eqz v4, :cond_2
a=0;// 
a=0;//     check-cast v1, Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-direct {p0, v1}, Lcn/sharesdk/framework/utils/d;->a(Ljava/util/ArrayList;)Lorg/json/JSONArray;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_2
a=0;//     invoke-direct {p0, v1}, Lcn/sharesdk/framework/utils/d;->a(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     if-eqz v4, :cond_0
a=0;// 
a=0;//     invoke-direct {p0, v1}, Lcn/sharesdk/framework/utils/d;->b(Ljava/lang/Object;)Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {p0, v1}, Lcn/sharesdk/framework/utils/d;->a(Ljava/util/ArrayList;)Lorg/json/JSONArray;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Boolean);v1=(Conflicted);v4=(Conflicted);
a=0;//     return-object v2
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public a(Ljava/util/HashMap;)Ljava/lang/String;
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/util/HashMap",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">;)",
a=0;//             "Ljava/lang/String;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-direct {p0, p1}, Lcn/sharesdk/framework/utils/d;->b(Ljava/util/HashMap;)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lorg/json/JSONObject;);
a=0;//     invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :goto_0
a=0;//     return-object v0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-static {v0}, Lcn/sharesdk/framework/utils/e;->c(Ljava/lang/Throwable;)I
a=0;// 
a=0;//     const-string v0, ""
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public a(Ljava/lang/String;)Ljava/util/HashMap;
a=0;//     .locals 2
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/String;",
a=0;//             ")",
a=0;//             "Ljava/util/HashMap",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     :try_start_0
a=0;//     const-string v0, "["
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const-string v0, "]"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "{\"fakelist\":"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "}"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object p1
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     new-instance v0, Lorg/json/JSONObject;
a=0;// 
a=0;//     #v0=(UninitRef,Lorg/json/JSONObject;);
a=0;//     invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lorg/json/JSONObject;);
a=0;//     invoke-direct {p0, v0}, Lcn/sharesdk/framework/utils/d;->a(Lorg/json/JSONObject;)Ljava/util/HashMap;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :goto_0
a=0;//     return-object v0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     new-array v1, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {p1, v1}, Lcn/sharesdk/framework/utils/e;->c(Ljava/lang/Object;[Ljava/lang/Object;)I
a=0;// 
a=0;//     invoke-static {v0}, Lcn/sharesdk/framework/utils/e;->c(Ljava/lang/Throwable;)I
a=0;// 
a=0;//     new-instance v0, Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v0}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     goto :goto_0
a=0;// .end method
}}
