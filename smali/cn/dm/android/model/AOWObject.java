package cn.dm.android.model; class AOWObject { void a() { int a;
a=0;// .class public Lcn/dm/android/model/AOWObject;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/io/Serializable;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static a:Lcn/dm/android/f/e;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field public action_url:Ljava/lang/String;
a=0;// 
a=0;// .field public aid:Ljava/lang/String;
a=0;// 
a=0;// .field public brife_desc:Ljava/lang/String;
a=0;// 
a=0;// .field public button_text:Ljava/lang/String;
a=0;// 
a=0;// .field public desc:Ljava/lang/String;
a=0;// 
a=0;// .field public developer:Ljava/lang/String;
a=0;// 
a=0;// .field public executable:Z
a=0;// 
a=0;// .field public id:I
a=0;// 
a=0;// .field public logo:Ljava/lang/String;
a=0;// 
a=0;// .field public name:Ljava/lang/String;
a=0;// 
a=0;// .field public open_detail:Z
a=0;// 
a=0;// .field public pkg:Ljava/lang/String;
a=0;// 
a=0;// .field public point:I
a=0;// 
a=0;// .field public screenshot:Ljava/lang/String;
a=0;// 
a=0;// .field public size:Ljava/lang/String;
a=0;// 
a=0;// .field public task_num:I
a=0;// 
a=0;// .field public task_tag:Ljava/lang/String;
a=0;// 
a=0;// .field public tasks:Ljava/util/List;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Lcn/dm/android/model/Task;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field public texts:Ljava/lang/String;
a=0;// 
a=0;// .field public tr:Ljava/lang/String;
a=0;// 
a=0;// .field public ver:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 20
a=0;//     new-instance v0, Lcn/dm/android/f/e;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/dm/android/f/e;);
a=0;//     const-class v1, Lcn/dm/android/model/AOWObject;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Lcn/dm/android/f/e;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/android/f/e;);
a=0;//     sput-object v0, Lcn/dm/android/model/AOWObject;->a:Lcn/dm/android/f/e;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 19
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcn/dm/android/model/AOWObject;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static parser_detail(Ljava/lang/String;)Lcn/dm/android/model/AOWObject;
a=0;//     .locals 2
a=0;//     .param p0, "json"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 119
a=0;//     invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 121
a=0;//     :try_start_0
a=0;//     new-instance v0, Lorg/json/JSONObject;
a=0;// 
a=0;//     #v0=(UninitRef,Lorg/json/JSONObject;);
a=0;//     invoke-direct {v0, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 122
a=0;//     #v0=(Reference,Lorg/json/JSONObject;);
a=0;//     const-string v1, "offer"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lcn/dm/android/model/AOWObject;->parser_object(Ljava/lang/String;)Lcn/dm/android/model/AOWObject;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 127
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 123
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 127
a=0;//     :cond_0
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static parser_list(Ljava/lang/String;)Ljava/util/List;
a=0;//     .locals 4
a=0;//     .param p0, "data"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/String;",
a=0;//             ")",
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Lcn/dm/android/model/AOWObject;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 101
a=0;//     invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 103
a=0;//     :try_start_0
a=0;//     new-instance v0, Lorg/json/JSONObject;
a=0;// 
a=0;//     #v0=(UninitRef,Lorg/json/JSONObject;);
a=0;//     invoke-direct {v0, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 104
a=0;//     #v0=(Reference,Lorg/json/JSONObject;);
a=0;//     const-string v1, "list"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 105
a=0;//     #v2=(Reference,Lorg/json/JSONArray;);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 106
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 107
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Integer);v3=(Conflicted);
a=0;//     invoke-virtual {v2}, Lorg/json/JSONArray;->length()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-ge v1, v3, :cond_1
a=0;// 
a=0;//     .line 108
a=0;//     invoke-virtual {v2, v1}, Lorg/json/JSONArray;->optString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3}, Lcn/dm/android/model/AOWObject;->parser_object(Ljava/lang/String;)Lcn/dm/android/model/AOWObject;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 107
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 112
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 115
a=0;//     :cond_0
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static parser_object(Ljava/lang/String;)Lcn/dm/android/model/AOWObject;
a=0;//     .locals 3
a=0;//     .param p0, "json"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 65
a=0;//     sget-object v0, Lcn/dm/android/model/AOWObject;->a:Lcn/dm/android/f/e;
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/android/f/e;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "AOWObject parser:"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcn/dm/android/f/e;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 66
a=0;//     invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 68
a=0;//     :try_start_0
a=0;//     new-instance v1, Lorg/json/JSONObject;
a=0;// 
a=0;//     #v1=(UninitRef,Lorg/json/JSONObject;);
a=0;//     invoke-direct {v1, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 69
a=0;//     #v1=(Reference,Lorg/json/JSONObject;);
a=0;//     new-instance v0, Lcn/dm/android/model/AOWObject;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/dm/android/model/AOWObject;);
a=0;//     invoke-direct {v0}, Lcn/dm/android/model/AOWObject;-><init>()V
a=0;// 
a=0;//     .line 70
a=0;//     #v0=(Reference,Lcn/dm/android/model/AOWObject;);
a=0;//     const-string v2, "id"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iput v2, v0, Lcn/dm/android/model/AOWObject;->id:I
a=0;// 
a=0;//     .line 71
a=0;//     const-string v2, "point"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iput v2, v0, Lcn/dm/android/model/AOWObject;->point:I
a=0;// 
a=0;//     .line 72
a=0;//     const-string v2, "task_num"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iput v2, v0, Lcn/dm/android/model/AOWObject;->task_num:I
a=0;// 
a=0;//     .line 73
a=0;//     const-string v2, "tasks"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v2}, Lcn/dm/android/model/Task;->parser_list(Lorg/json/JSONArray;)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iput-object v2, v0, Lcn/dm/android/model/AOWObject;->tasks:Ljava/util/List;
a=0;// 
a=0;//     .line 74
a=0;//     const-string v2, "aid"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iput-object v2, v0, Lcn/dm/android/model/AOWObject;->aid:Ljava/lang/String;
a=0;// 
a=0;//     .line 75
a=0;//     const-string v2, "logo"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iput-object v2, v0, Lcn/dm/android/model/AOWObject;->logo:Ljava/lang/String;
a=0;// 
a=0;//     .line 76
a=0;//     const-string v2, "texts"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iput-object v2, v0, Lcn/dm/android/model/AOWObject;->texts:Ljava/lang/String;
a=0;// 
a=0;//     .line 77
a=0;//     const-string v2, "developer"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iput-object v2, v0, Lcn/dm/android/model/AOWObject;->developer:Ljava/lang/String;
a=0;// 
a=0;//     .line 78
a=0;//     const-string v2, "name"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iput-object v2, v0, Lcn/dm/android/model/AOWObject;->name:Ljava/lang/String;
a=0;// 
a=0;//     .line 79
a=0;//     const-string v2, "pkg"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iput-object v2, v0, Lcn/dm/android/model/AOWObject;->pkg:Ljava/lang/String;
a=0;// 
a=0;//     .line 80
a=0;//     const-string v2, "ver"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iput-object v2, v0, Lcn/dm/android/model/AOWObject;->ver:Ljava/lang/String;
a=0;// 
a=0;//     .line 81
a=0;//     const-string v2, "action_url"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iput-object v2, v0, Lcn/dm/android/model/AOWObject;->action_url:Ljava/lang/String;
a=0;// 
a=0;//     .line 82
a=0;//     const-string v2, "size"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iput-object v2, v0, Lcn/dm/android/model/AOWObject;->size:Ljava/lang/String;
a=0;// 
a=0;//     .line 83
a=0;//     const-string v2, "tr"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iput-object v2, v0, Lcn/dm/android/model/AOWObject;->tr:Ljava/lang/String;
a=0;// 
a=0;//     .line 84
a=0;//     const-string v2, "screenshot"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iput-object v2, v0, Lcn/dm/android/model/AOWObject;->screenshot:Ljava/lang/String;
a=0;// 
a=0;//     .line 85
a=0;//     const-string v2, "desc"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iput-object v2, v0, Lcn/dm/android/model/AOWObject;->desc:Ljava/lang/String;
a=0;// 
a=0;//     .line 86
a=0;//     const-string v2, "task_tag"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iput-object v2, v0, Lcn/dm/android/model/AOWObject;->task_tag:Ljava/lang/String;
a=0;// 
a=0;//     .line 87
a=0;//     const-string v2, "button_text"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iput-object v2, v0, Lcn/dm/android/model/AOWObject;->button_text:Ljava/lang/String;
a=0;// 
a=0;//     .line 89
a=0;//     const-string v2, "open_detail"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     iput-boolean v2, v0, Lcn/dm/android/model/AOWObject;->open_detail:Z
a=0;// 
a=0;//     .line 90
a=0;//     const-string v2, "executable"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     iput-boolean v2, v0, Lcn/dm/android/model/AOWObject;->executable:Z
a=0;// 
a=0;//     .line 91
a=0;//     const-string v2, "brife_desc"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, v0, Lcn/dm/android/model/AOWObject;->brife_desc:Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 97
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 94
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 97
a=0;//     :cond_0
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
}}
