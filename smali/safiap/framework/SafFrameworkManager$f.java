package safiap.framework; class SafFrameworkManager$f { void a() { int a;
a=0;// .class final Lsafiap/framework/SafFrameworkManager$f;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lsafiap/framework/SafFrameworkManager;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x8
a=0;//     name = "f"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private a:Ljava/lang/String;
a=0;// 
a=0;// .field private b:Ljava/lang/String;
a=0;// 
a=0;// .field private c:Ljava/lang/String;
a=0;// 
a=0;// .field private d:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1568
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 1560
a=0;//     #p0=(Reference,Lsafiap/framework/SafFrameworkManager$f;);
a=0;//     const-string v0, ""
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Lsafiap/framework/SafFrameworkManager$f;->a:Ljava/lang/String;
a=0;// 
a=0;//     .line 1561
a=0;//     const-string v0, ""
a=0;// 
a=0;//     iput-object v0, p0, Lsafiap/framework/SafFrameworkManager$f;->b:Ljava/lang/String;
a=0;// 
a=0;//     .line 1562
a=0;//     const-string v0, ""
a=0;// 
a=0;//     iput-object v0, p0, Lsafiap/framework/SafFrameworkManager$f;->c:Ljava/lang/String;
a=0;// 
a=0;//     .line 1563
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     iput v0, p0, Lsafiap/framework/SafFrameworkManager$f;->d:I
a=0;// 
a=0;//     .line 1569
a=0;//     iput-object p2, p0, Lsafiap/framework/SafFrameworkManager$f;->a:Ljava/lang/String;
a=0;// 
a=0;//     .line 1570
a=0;//     invoke-static {p1, p2}, Lsafiap/framework/sdk/b/d;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Lsafiap/framework/SafFrameworkManager$f;->b:Ljava/lang/String;
a=0;// 
a=0;//     .line 1571
a=0;//     invoke-static {p1, p2}, Lsafiap/framework/sdk/b/d;->c(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lsafiap/framework/SafFrameworkManager$f;->c:Ljava/lang/String;
a=0;// 
a=0;//     .line 1572
a=0;//     invoke-static {p1, p2}, Lsafiap/framework/sdk/b/d;->b(Landroid/content/Context;Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lsafiap/framework/SafFrameworkManager$f;->d:I
a=0;// 
a=0;//     .line 1573
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static a(Ljava/util/Map;)Ljava/lang/String;
a=0;//     .locals 3
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/util/Map",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Lsafiap/framework/SafFrameworkManager$f;",
a=0;//             ">;)",
a=0;//             "Ljava/lang/String;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 1593
a=0;//     new-instance v1, Lorg/json/JSONArray;
a=0;// 
a=0;//     #v1=(UninitRef,Lorg/json/JSONArray;);
a=0;//     invoke-direct {v1}, Lorg/json/JSONArray;-><init>()V
a=0;// 
a=0;//     .line 1594
a=0;//     #v1=(Reference,Lorg/json/JSONArray;);
a=0;//     invoke-interface {p0}, Ljava/util/Map;->keySet()Ljava/util/Set;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Set;);
a=0;//     invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     :goto_0
a=0;//     #v2=(Reference,Ljava/util/Iterator;);
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     .line 1595
a=0;//     invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lsafiap/framework/SafFrameworkManager$f;
a=0;// 
a=0;//     .line 1596
a=0;//     invoke-direct {v0}, Lsafiap/framework/SafFrameworkManager$f;->a()Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 1597
a=0;//     invoke-virtual {v1, v0}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1599
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {v1}, Lorg/json/JSONArray;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private a()Lorg/json/JSONObject;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 1576
a=0;//     new-instance v1, Lorg/json/JSONObject;
a=0;// 
a=0;//     #v1=(UninitRef,Lorg/json/JSONObject;);
a=0;//     invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V
a=0;// 
a=0;//     .line 1579
a=0;//     :try_start_0
a=0;//     #v1=(Reference,Lorg/json/JSONObject;);
a=0;//     const-string v0, "gamename"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iget-object v2, p0, Lsafiap/framework/SafFrameworkManager$f;->b:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
a=0;// 
a=0;//     .line 1580
a=0;//     const-string v0, "gameversioncode"
a=0;// 
a=0;//     iget v2, p0, Lsafiap/framework/SafFrameworkManager$f;->d:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
a=0;// 
a=0;//     .line 1581
a=0;//     const-string v0, "gameversion"
a=0;// 
a=0;//     iget-object v2, p0, Lsafiap/framework/SafFrameworkManager$f;->c:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
a=0;// 
a=0;//     .line 1582
a=0;//     const-string v0, "gamepkg"
a=0;// 
a=0;//     iget-object v2, p0, Lsafiap/framework/SafFrameworkManager$f;->a:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
a=0;//     :try_end_0
a=0;//     .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 1586
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);
a=0;//     return-object v1
a=0;// 
a=0;//     .line 1583
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 1584
a=0;//     #v0=(Reference,Lorg/json/JSONException;);
a=0;//     invoke-virtual {v0}, Lorg/json/JSONException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
