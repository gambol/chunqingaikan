package safiap.framework; class UpdateManager$CheckApkUpdateTask { void a() { int a;
a=0;// .class Lsafiap/framework/UpdateManager$CheckApkUpdateTask;
a=0;// .super Lsafiap/framework/sdk/a/b;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lsafiap/framework/UpdateManager;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = "CheckApkUpdateTask"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final PARAM_AVP:Ljava/lang/String; = "avp"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mExtraArugment:Ljava/lang/String;
a=0;// 
a=0;// .field private mListener:Lsafiap/framework/UpdateManager$OnGotUpdateListListener;
a=0;// 
a=0;// .field private mType:Ljava/lang/String;
a=0;// 
a=0;// .field private synthetic this$0:Lsafiap/framework/UpdateManager;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lsafiap/framework/UpdateManager;Ljava/lang/String;Lsafiap/framework/UpdateManager$OnGotUpdateListListener;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 63
a=0;//     #v2=(Null);
a=0;//     iput-object p1, p0, Lsafiap/framework/UpdateManager$CheckApkUpdateTask;->this$0:Lsafiap/framework/UpdateManager;
a=0;// 
a=0;//     .line 64
a=0;//     const-string v0, "CheckUpdate"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p1}, Lsafiap/framework/UpdateManager;->a(Lsafiap/framework/UpdateManager;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {p0, v0, v1}, Lsafiap/framework/sdk/a/b;-><init>(Ljava/lang/String;Landroid/content/Context;)V
a=0;// 
a=0;//     .line 57
a=0;//     #p0=(Reference,Lsafiap/framework/UpdateManager$CheckApkUpdateTask;);
a=0;//     iput-object v2, p0, Lsafiap/framework/UpdateManager$CheckApkUpdateTask;->mListener:Lsafiap/framework/UpdateManager$OnGotUpdateListListener;
a=0;// 
a=0;//     .line 58
a=0;//     sget-object v0, Lsafiap/framework/UpdateManager;->TYPE_PLUGINS:Ljava/lang/String;
a=0;// 
a=0;//     iput-object v0, p0, Lsafiap/framework/UpdateManager$CheckApkUpdateTask;->mType:Ljava/lang/String;
a=0;// 
a=0;//     .line 61
a=0;//     iput-object v2, p0, Lsafiap/framework/UpdateManager$CheckApkUpdateTask;->mExtraArugment:Ljava/lang/String;
a=0;// 
a=0;//     .line 65
a=0;//     iput-object p2, p0, Lsafiap/framework/UpdateManager$CheckApkUpdateTask;->mType:Ljava/lang/String;
a=0;// 
a=0;//     .line 66
a=0;//     iput-object p3, p0, Lsafiap/framework/UpdateManager$CheckApkUpdateTask;->mListener:Lsafiap/framework/UpdateManager$OnGotUpdateListListener;
a=0;// 
a=0;//     .line 67
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lsafiap/framework/UpdateManager$CheckApkUpdateTask;Ljava/lang/String;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 56
a=0;//     iput-object p1, p0, Lsafiap/framework/UpdateManager$CheckApkUpdateTask;->mExtraArugment:Ljava/lang/String;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private setExtraArgument(Ljava/lang/String;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 70
a=0;//     iput-object p1, p0, Lsafiap/framework/UpdateManager$CheckApkUpdateTask;->mExtraArugment:Ljava/lang/String;
a=0;// 
a=0;//     .line 71
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 56
a=0;//     check-cast p1, Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {p0, p1}, Lsafiap/framework/UpdateManager$CheckApkUpdateTask;->onPostExecute(Ljava/lang/String;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onPostExecute(Ljava/lang/String;)V
a=0;//     .locals 16
a=0;// 
a=0;//     .prologue
a=0;//     .line 91
a=0;//     invoke-static {}, Lsafiap/framework/UpdateManager;->a()Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lsafiap/framework/util/MyLogger;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "onPostExecute....result: "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Lsafiap/framework/util/MyLogger;->v(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 92
a=0;//     new-instance v14, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v14=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 94
a=0;//     #v14=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-static/range {p1 .. p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_3
a=0;// 
a=0;//     .line 96
a=0;//     :try_start_0
a=0;//     const-string v1, "["
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 97
a=0;//     #v2=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lsafiap/framework/UpdateManager$CheckApkUpdateTask;->this$0:Lsafiap/framework/UpdateManager;
a=0;// 
a=0;//     invoke-static {v1}, Lsafiap/framework/UpdateManager;->a(Lsafiap/framework/UpdateManager;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1}, Lsafiap/framework/a/c;->a(Landroid/content/Context;)Lsafiap/framework/a/c;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 98
a=0;//     new-instance v15, Lorg/json/JSONArray;
a=0;// 
a=0;//     #v15=(UninitRef,Lorg/json/JSONArray;);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v15, v2}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 99
a=0;//     #v15=(Reference,Lorg/json/JSONArray;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     move v13, v2
a=0;// 
a=0;//     :goto_0
a=0;//     #v2=(Integer);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Integer);
a=0;//     invoke-virtual {v15}, Lorg/json/JSONArray;->length()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     if-ge v13, v2, :cond_3
a=0;// 
a=0;//     .line 100
a=0;//     invoke-virtual {v15, v13}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 102
a=0;//     #v2=(Reference,Lorg/json/JSONObject;);
a=0;//     invoke-static {v2}, Lsafiap/framework/a/b;->a(Lorg/json/JSONObject;)Lsafiap/framework/a/b;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 104
a=0;//     iget-object v2, v3, Lsafiap/framework/a/b;->b:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     iget-object v2, v3, Lsafiap/framework/a/b;->c:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     .line 105
a=0;//     iget-boolean v2, v3, Lsafiap/framework/a/b;->i:Z
a=0;// 
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 106
a=0;//     invoke-virtual {v14, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 99
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     add-int/lit8 v2, v13, 0x1
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     move v13, v2
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 108
a=0;//     :cond_1
a=0;//     #v2=(Boolean);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     iget-object v3, v3, Lsafiap/framework/a/b;->c:Ljava/lang/String;
a=0;// 
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     const/4 v5, -0x1
a=0;// 
a=0;//     #v5=(Byte);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     const/4 v7, -0x1
a=0;// 
a=0;//     #v7=(Byte);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     #v9=(Null);
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     #v10=(Null);
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     #v11=(Null);
a=0;//     const/4 v12, 0x0
a=0;// 
a=0;//     #v12=(Null);
a=0;//     invoke-virtual/range {v1 .. v12}, Lsafiap/framework/a/c;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)J
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 113
a=0;//     :catch_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v15=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 114
a=0;//     #v1=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-static {}, Lsafiap/framework/UpdateManager;->b()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "SAF-A Exception:530001"
a=0;// 
a=0;//     invoke-static {v2, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 115
a=0;//     invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     .line 117
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lsafiap/framework/UpdateManager$CheckApkUpdateTask;->mListener:Lsafiap/framework/UpdateManager$OnGotUpdateListListener;
a=0;// 
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     .line 118
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lsafiap/framework/UpdateManager$CheckApkUpdateTask;->mListener:Lsafiap/framework/UpdateManager$OnGotUpdateListListener;
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-interface {v2, v1}, Lsafiap/framework/UpdateManager$OnGotUpdateListListener;->onGotUpdateListError(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 120
a=0;//     :cond_2
a=0;//     invoke-super/range {p0 .. p1}, Lsafiap/framework/sdk/a/b;->onPostExecute(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 130
a=0;//     :goto_2
a=0;//     #v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 125
a=0;//     :cond_3
a=0;//     #v1=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lsafiap/framework/UpdateManager$CheckApkUpdateTask;->mListener:Lsafiap/framework/UpdateManager$OnGotUpdateListListener;
a=0;// 
a=0;//     #v1=(Reference,Lsafiap/framework/UpdateManager$OnGotUpdateListListener;);
a=0;//     if-eqz v1, :cond_4
a=0;// 
a=0;//     .line 126
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lsafiap/framework/UpdateManager$CheckApkUpdateTask;->mListener:Lsafiap/framework/UpdateManager$OnGotUpdateListListener;
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lsafiap/framework/UpdateManager$CheckApkUpdateTask;->mType:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v1, v2, v14}, Lsafiap/framework/UpdateManager$OnGotUpdateListListener;->onGotUpdateList(Ljava/lang/String;Ljava/util/ArrayList;)V
a=0;// 
a=0;//     .line 129
a=0;//     :cond_4
a=0;//     #v2=(Conflicted);
a=0;//     invoke-super/range {p0 .. p1}, Lsafiap/framework/sdk/a/b;->onPostExecute(Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method protected onPreExecute()V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 75
a=0;//     invoke-super {p0}, Lsafiap/framework/sdk/a/b;->onPreExecute()V
a=0;// 
a=0;//     .line 76
a=0;//     invoke-static {}, Lsafiap/framework/UpdateManager;->a()Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/util/MyLogger;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "CheckApkUpdateTask.onPreExecute, mExtraArgument: "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v2, p0, Lsafiap/framework/UpdateManager$CheckApkUpdateTask;->mExtraArugment:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lsafiap/framework/util/MyLogger;->v(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 78
a=0;//     sget-object v0, Lsafiap/framework/UpdateManager;->TYPE_PLUGINS:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v1, p0, Lsafiap/framework/UpdateManager$CheckApkUpdateTask;->mType:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 80
a=0;//     iget-object v0, p0, Lsafiap/framework/UpdateManager$CheckApkUpdateTask;->this$0:Lsafiap/framework/UpdateManager;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/UpdateManager;);
a=0;//     invoke-static {v0}, Lsafiap/framework/UpdateManager;->a(Lsafiap/framework/UpdateManager;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lsafiap/framework/SafFrameworkManager;->b(Landroid/content/Context;)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 81
a=0;//     iget-object v1, p0, Lsafiap/framework/UpdateManager$CheckApkUpdateTask;->this$0:Lsafiap/framework/UpdateManager;
a=0;// 
a=0;//     invoke-static {v1}, Lsafiap/framework/UpdateManager;->a(Lsafiap/framework/UpdateManager;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v2, p0, Lsafiap/framework/UpdateManager$CheckApkUpdateTask;->mExtraArugment:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v1, v0, v2}, Lsafiap/framework/a/b;->a(Landroid/content/Context;Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 82
a=0;//     invoke-static {}, Lsafiap/framework/UpdateManager;->a()Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "pre exec for all.json:"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Lsafiap/framework/util/MyLogger;->v(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 83
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 84
a=0;//     const-string v1, "avp"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v1, v0}, Lsafiap/framework/UpdateManager$CheckApkUpdateTask;->addNameValuePair(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 87
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// .end method
}}
