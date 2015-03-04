package safiap.framework.sdk.a; class b { void a() { int a;
a=0;// .class public Lsafiap/framework/sdk/a/b;
a=0;// .super Landroid/os/AsyncTask;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "Landroid/os/AsyncTask",
a=0;//         "<",
a=0;//         "Ljava/lang/String;",
a=0;//         "[",
a=0;//         "Ljava/lang/Integer;",
a=0;//         "Ljava/lang/String;",
a=0;//         ">;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final PARAM_DEVICE:Ljava/lang/String; = "phone"
a=0;// 
a=0;// .field private static final PARAM_IMEI:Ljava/lang/String; = "imei"
a=0;// 
a=0;// .field private static final PARAM_IMSI:Ljava/lang/String; = "imsi"
a=0;// 
a=0;// .field private static final PARAM_MAC:Ljava/lang/String; = "mac"
a=0;// 
a=0;// .field private static final PARAM_PLATFORM:Ljava/lang/String; = "system"
a=0;// 
a=0;// .field private static final PARAM_UID:Ljava/lang/String; = "uid"
a=0;// 
a=0;// .field private static final RESPONSE_HEADER_PACKAGE_INFO:Ljava/lang/String; = "package-info"
a=0;// 
a=0;// .field private static final RESPONSE_HEADER_REASON:Ljava/lang/String; = "Reason"
a=0;// 
a=0;// .field private static final TAG:Ljava/lang/String; = "QueryTask"
a=0;// 
a=0;// .field private static sLogger:Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field protected a:Ljava/lang/String;
a=0;// 
a=0;// .field private mContext:Landroid/content/Context;
a=0;// 
a=0;// .field private mDeviceInfo:Lsafiap/framework/sdk/b/c;
a=0;// 
a=0;// .field private mNameValueArray:Ljava/util/List;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Lorg/apache/http/message/BasicNameValuePair;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 208
a=0;//     const-string v0, "QueryTask"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lsafiap/framework/util/MyLogger;->getLogger(Ljava/lang/String;)Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lsafiap/framework/sdk/a/b;->sLogger:Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Ljava/lang/String;Landroid/content/Context;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 56
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V
a=0;// 
a=0;//     .line 50
a=0;//     #p0=(Reference,Lsafiap/framework/sdk/a/b;);
a=0;//     iput-object v0, p0, Lsafiap/framework/sdk/a/b;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     .line 51
a=0;//     iput-object v0, p0, Lsafiap/framework/sdk/a/b;->mDeviceInfo:Lsafiap/framework/sdk/b/c;
a=0;// 
a=0;//     .line 52
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, p0, Lsafiap/framework/sdk/a/b;->mNameValueArray:Ljava/util/List;
a=0;// 
a=0;//     .line 57
a=0;//     iput-object p1, p0, Lsafiap/framework/sdk/a/b;->a:Ljava/lang/String;
a=0;// 
a=0;//     .line 58
a=0;//     if-eqz p2, :cond_0
a=0;// 
a=0;//     .line 59
a=0;//     iput-object p2, p0, Lsafiap/framework/sdk/a/b;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     .line 60
a=0;//     new-instance v0, Lsafiap/framework/sdk/b/c;
a=0;// 
a=0;//     #v0=(UninitRef,Lsafiap/framework/sdk/b/c;);
a=0;//     iget-object v1, p0, Lsafiap/framework/sdk/a/b;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v0, v1}, Lsafiap/framework/sdk/b/c;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/sdk/b/c;);
a=0;//     iput-object v0, p0, Lsafiap/framework/sdk/a/b;->mDeviceInfo:Lsafiap/framework/sdk/b/c;
a=0;// 
a=0;//     .line 62
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected addNameValuePair(Ljava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 65
a=0;//     iget-object v0, p0, Lsafiap/framework/sdk/a/b;->mNameValueArray:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     new-instance v1, Lorg/apache/http/message/BasicNameValuePair;
a=0;// 
a=0;//     #v1=(UninitRef,Lorg/apache/http/message/BasicNameValuePair;);
a=0;//     invoke-direct {v1, p1, p2}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Lorg/apache/http/message/BasicNameValuePair;);
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 66
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 39
a=0;//     check-cast p1, [Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {p0, p1}, Lsafiap/framework/sdk/a/b;->doInBackground([Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public varargs doInBackground([Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 12
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v11, 0x4e20
a=0;// 
a=0;//     #v11=(PosShort);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 70
a=0;//     #v1=(Null);
a=0;//     sget-object v0, Lsafiap/framework/sdk/a/b;->sLogger:Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/util/MyLogger;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "QueryTask.doInBackground() ------------url:"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     aget-object v4, p1, v2
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Lsafiap/framework/util/MyLogger;->v(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 72
a=0;//     iget-object v0, p0, Lsafiap/framework/sdk/a/b;->mDeviceInfo:Lsafiap/framework/sdk/b/c;
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 73
a=0;//     new-instance v0, Lsafiap/framework/sdk/b/c;
a=0;// 
a=0;//     #v0=(UninitRef,Lsafiap/framework/sdk/b/c;);
a=0;//     iget-object v3, p0, Lsafiap/framework/sdk/a/b;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     invoke-direct {v0, v3}, Lsafiap/framework/sdk/b/c;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/sdk/b/c;);
a=0;//     iput-object v0, p0, Lsafiap/framework/sdk/a/b;->mDeviceInfo:Lsafiap/framework/sdk/b/c;
a=0;// 
a=0;//     .line 77
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Lsafiap/framework/sdk/a/b;->mDeviceInfo:Lsafiap/framework/sdk/b/c;
a=0;// 
a=0;//     invoke-virtual {v0}, Lsafiap/framework/sdk/b/c;->d()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 78
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     const-string v3, ""
a=0;// 
a=0;//     if-ne v0, v3, :cond_2
a=0;// 
a=0;//     .line 79
a=0;//     :cond_1
a=0;//     const-string v0, "Saf-Uid-Unknown"
a=0;// 
a=0;//     .line 81
a=0;//     :cond_2
a=0;//     const-string v3, "uid"
a=0;// 
a=0;//     invoke-virtual {p0, v3, v0}, Lsafiap/framework/sdk/a/b;->addNameValuePair(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 83
a=0;//     iget-object v0, p0, Lsafiap/framework/sdk/a/b;->mDeviceInfo:Lsafiap/framework/sdk/b/c;
a=0;// 
a=0;//     invoke-virtual {v0}, Lsafiap/framework/sdk/b/c;->c()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 84
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     const-string v3, ""
a=0;// 
a=0;//     if-ne v0, v3, :cond_4
a=0;// 
a=0;//     .line 85
a=0;//     :cond_3
a=0;//     const-string v0, "Android-Saf-MAC"
a=0;// 
a=0;//     .line 87
a=0;//     :cond_4
a=0;//     const-string v3, "mac"
a=0;// 
a=0;//     invoke-virtual {p0, v3, v0}, Lsafiap/framework/sdk/a/b;->addNameValuePair(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 89
a=0;//     iget-object v0, p0, Lsafiap/framework/sdk/a/b;->mDeviceInfo:Lsafiap/framework/sdk/b/c;
a=0;// 
a=0;//     invoke-virtual {v0}, Lsafiap/framework/sdk/b/c;->a()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 90
a=0;//     if-eqz v0, :cond_5
a=0;// 
a=0;//     const-string v3, ""
a=0;// 
a=0;//     if-ne v0, v3, :cond_6
a=0;// 
a=0;//     .line 91
a=0;//     :cond_5
a=0;//     const-string v0, "Android-Saf-IMEI"
a=0;// 
a=0;//     .line 93
a=0;//     :cond_6
a=0;//     const-string v3, "imei"
a=0;// 
a=0;//     invoke-virtual {p0, v3, v0}, Lsafiap/framework/sdk/a/b;->addNameValuePair(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 95
a=0;//     iget-object v0, p0, Lsafiap/framework/sdk/a/b;->mDeviceInfo:Lsafiap/framework/sdk/b/c;
a=0;// 
a=0;//     invoke-virtual {v0}, Lsafiap/framework/sdk/b/c;->b()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 96
a=0;//     if-eqz v0, :cond_7
a=0;// 
a=0;//     const-string v3, ""
a=0;// 
a=0;//     if-ne v0, v3, :cond_8
a=0;// 
a=0;//     .line 97
a=0;//     :cond_7
a=0;//     const-string v0, "Android-Saf-IMSI"
a=0;// 
a=0;//     .line 99
a=0;//     :cond_8
a=0;//     const-string v3, "imsi"
a=0;// 
a=0;//     invoke-virtual {p0, v3, v0}, Lsafiap/framework/sdk/a/b;->addNameValuePair(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 101
a=0;//     invoke-static {}, Lsafiap/framework/sdk/b/c;->g()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 102
a=0;//     if-eqz v0, :cond_9
a=0;// 
a=0;//     const-string v3, ""
a=0;// 
a=0;//     if-ne v0, v3, :cond_c
a=0;// 
a=0;//     .line 103
a=0;//     :cond_9
a=0;//     const-string v0, "{Android:0}"
a=0;// 
a=0;//     .line 107
a=0;//     :goto_0
a=0;//     const-string v3, "system"
a=0;// 
a=0;//     invoke-virtual {p0, v3, v0}, Lsafiap/framework/sdk/a/b;->addNameValuePair(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 109
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {}, Lsafiap/framework/sdk/b/c;->f()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v3, " "
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {}, Lsafiap/framework/sdk/b/c;->e()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 110
a=0;//     const-string v3, " "
a=0;// 
a=0;//     if-eq v0, v3, :cond_a
a=0;// 
a=0;//     invoke-static {}, Lsafiap/framework/sdk/b/c;->f()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     if-eqz v3, :cond_a
a=0;// 
a=0;//     invoke-static {}, Lsafiap/framework/sdk/b/c;->e()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     if-nez v3, :cond_b
a=0;// 
a=0;//     .line 111
a=0;//     :cond_a
a=0;//     const-string v0, "Android-Saf-Phone"
a=0;// 
a=0;//     .line 113
a=0;//     :cond_b
a=0;//     const-string v3, "phone"
a=0;// 
a=0;//     invoke-virtual {p0, v3, v0}, Lsafiap/framework/sdk/a/b;->addNameValuePair(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 116
a=0;//     iget-object v0, p0, Lsafiap/framework/sdk/a/b;->mNameValueArray:Ljava/util/List;
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     :goto_1
a=0;//     #v4=(Reference,Lsafiap/framework/util/MyLogger;);v5=(Conflicted);v6=(Conflicted);
a=0;//     invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_d
a=0;// 
a=0;//     invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lorg/apache/http/message/BasicNameValuePair;
a=0;// 
a=0;//     .line 117
a=0;//     sget-object v4, Lsafiap/framework/sdk/a/b;->sLogger:Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0}, Lorg/apache/http/message/BasicNameValuePair;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     const-string v6, ": "
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v0}, Lorg/apache/http/message/BasicNameValuePair;->getValue()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v4, v0}, Lsafiap/framework/util/MyLogger;->v(Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 105
a=0;//     :cond_c
a=0;//     #v4=(Null);v5=(Uninit);v6=(Uninit);
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "{Android:"
a=0;// 
a=0;//     invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {}, Lsafiap/framework/sdk/b/c;->g()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v3, "}"
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 120
a=0;//     :cond_d
a=0;//     #v0=(Boolean);v4=(Reference,Lsafiap/framework/util/MyLogger;);v5=(Conflicted);v6=(Conflicted);
a=0;//     new-instance v4, Lorg/apache/http/client/methods/HttpPost;
a=0;// 
a=0;//     #v4=(UninitRef,Lorg/apache/http/client/methods/HttpPost;);
a=0;//     aget-object v0, p1, v2
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {v4, v0}, Lorg/apache/http/client/methods/HttpPost;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 122
a=0;//     :try_start_0
a=0;//     #v4=(Reference,Lorg/apache/http/client/methods/HttpPost;);
a=0;//     new-instance v0, Lorg/apache/http/client/entity/UrlEncodedFormEntity;
a=0;// 
a=0;//     #v0=(UninitRef,Lorg/apache/http/client/entity/UrlEncodedFormEntity;);
a=0;//     iget-object v3, p0, Lsafiap/framework/sdk/a/b;->mNameValueArray:Ljava/util/List;
a=0;// 
a=0;//     const-string v5, "UTF-8"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v3, v5}, Lorg/apache/http/client/entity/UrlEncodedFormEntity;-><init>(Ljava/util/List;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 123
a=0;//     #v0=(Reference,Lorg/apache/http/client/entity/UrlEncodedFormEntity;);
a=0;//     invoke-virtual {v4, v0}, Lorg/apache/http/client/methods/HttpPost;->setEntity(Lorg/apache/http/HttpEntity;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 129
a=0;//     :goto_2
a=0;//     const/4 v0, 0x4
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     move v3, v0
a=0;// 
a=0;//     .line 131
a=0;//     :goto_3
a=0;//     #v0=(Conflicted);v3=(Integer);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
a=0;//     if-lez v3, :cond_e
a=0;// 
a=0;//     .line 132
a=0;//     sget-object v0, Lsafiap/framework/sdk/a/b;->sLogger:Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/util/MyLogger;);
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "retry id: "
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     rsub-int/lit8 v6, v3, 0x5
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v0, v5}, Lsafiap/framework/util/MyLogger;->v(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 134
a=0;//     new-instance v5, Lorg/apache/http/impl/client/DefaultHttpClient;
a=0;// 
a=0;//     #v5=(UninitRef,Lorg/apache/http/impl/client/DefaultHttpClient;);
a=0;//     invoke-direct {v5}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>()V
a=0;// 
a=0;//     .line 135
a=0;//     #v5=(Reference,Lorg/apache/http/impl/client/DefaultHttpClient;);
a=0;//     invoke-interface {v5}, Lorg/apache/http/client/HttpClient;->getParams()Lorg/apache/http/params/HttpParams;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0, v11}, Lorg/apache/http/params/HttpConnectionParams;->setConnectionTimeout(Lorg/apache/http/params/HttpParams;I)V
a=0;// 
a=0;//     .line 137
a=0;//     invoke-interface {v5}, Lorg/apache/http/client/HttpClient;->getParams()Lorg/apache/http/params/HttpParams;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0, v11}, Lorg/apache/http/params/HttpConnectionParams;->setSoTimeout(Lorg/apache/http/params/HttpParams;I)V
a=0;// 
a=0;//     .line 140
a=0;//     :try_start_1
a=0;//     invoke-interface {v5, v4}, Lorg/apache/http/client/HttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 141
a=0;//     if-nez v0, :cond_f
a=0;// 
a=0;//     .line 142
a=0;//     sget-object v0, Lsafiap/framework/sdk/a/b;->sLogger:Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     const-string v6, "Get null response when connecting server!"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v6}, Lsafiap/framework/util/MyLogger;->v(Ljava/lang/String;)V
a=0;//     :try_end_1
a=0;//     .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_1 .. :try_end_1} :catch_3
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_4
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     .line 143
a=0;//     invoke-interface {v5}, Lorg/apache/http/client/HttpClient;->getConnectionManager()Lorg/apache/http/conn/ClientConnectionManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Lorg/apache/http/conn/ClientConnectionManager;->shutdown()V
a=0;// 
a=0;//     .line 204
a=0;//     :cond_e
a=0;//     :goto_4
a=0;//     #v0=(Conflicted);v1=(Reference,Ljava/lang/String;);v6=(Conflicted);
a=0;//     return-object v1
a=0;// 
a=0;//     .line 124
a=0;//     :catch_0
a=0;//     #v1=(Null);v3=(Reference,Ujava/lang/Object;);v5=(Conflicted);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 125
a=0;//     #v0=(Reference,Ljava/io/UnsupportedEncodingException;);
a=0;//     const-string v3, "QueryTask"
a=0;// 
a=0;//     const-string v5, "SAF-A Exception:511001"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3, v5}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 126
a=0;//     invoke-virtual {v0}, Ljava/io/UnsupportedEncodingException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 146
a=0;//     :cond_f
a=0;//     :try_start_2
a=0;//     #v3=(Integer);v6=(Integer);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
a=0;//     invoke-interface {v0}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 147
a=0;//     #v6=(Reference,Lorg/apache/http/StatusLine;);
a=0;//     invoke-interface {v6}, Lorg/apache/http/StatusLine;->getStatusCode()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     .line 148
a=0;//     #v7=(Integer);
a=0;//     sget-object v8, Lsafiap/framework/sdk/a/b;->sLogger:Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     #v8=(Reference,Lsafiap/framework/util/MyLogger;);
a=0;//     new-instance v9, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v9=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v10, "Task:"
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v10, p0, Lsafiap/framework/sdk/a/b;->a:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     const-string v10, ".responseCode:"
a=0;// 
a=0;//     invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     const-string v10, ",reason:"
a=0;// 
a=0;//     invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-interface {v6}, Lorg/apache/http/StatusLine;->getReasonPhrase()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v8, v6}, Lsafiap/framework/util/MyLogger;->v(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 150
a=0;//     const/16 v6, 0xc8
a=0;// 
a=0;//     #v6=(PosShort);
a=0;//     if-eq v7, v6, :cond_11
a=0;// 
a=0;//     .line 151
a=0;//     const-string v6, "Reason"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, v6}, Lorg/apache/http/HttpResponse;->containsHeader(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_10
a=0;// 
a=0;//     .line 152
a=0;//     sget-object v6, Lsafiap/framework/sdk/a/b;->sLogger:Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     #v6=(Reference,Lsafiap/framework/util/MyLogger;);
a=0;//     new-instance v7, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v8, "ResponseHeaderReason: "
a=0;// 
a=0;//     invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v8, "Reason"
a=0;// 
a=0;//     invoke-interface {v0, v8}, Lorg/apache/http/HttpResponse;->getFirstHeader(Ljava/lang/String;)Lorg/apache/http/Header;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Lorg/apache/http/Header;->getValue()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v6, v0}, Lsafiap/framework/util/MyLogger;->v(Ljava/lang/String;)V
a=0;//     :try_end_2
a=0;//     .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_2 .. :try_end_2} :catch_3
a=0;//     .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_4
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     .line 156
a=0;//     :cond_10
a=0;//     #v6=(Conflicted);v7=(Conflicted);
a=0;//     invoke-interface {v5}, Lorg/apache/http/client/HttpClient;->getConnectionManager()Lorg/apache/http/conn/ClientConnectionManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Lorg/apache/http/conn/ClientConnectionManager;->shutdown()V
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 160
a=0;//     :cond_11
a=0;//     :try_start_3
a=0;//     #v6=(PosShort);v7=(Integer);
a=0;//     const-string v6, "package-info"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, v6}, Lorg/apache/http/HttpResponse;->containsHeader(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_12
a=0;// 
a=0;//     .line 161
a=0;//     const-string v6, "package-info"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, v6}, Lorg/apache/http/HttpResponse;->getFirstHeader(Ljava/lang/String;)Lorg/apache/http/Header;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Lorg/apache/http/Header;->getValue()Ljava/lang/String;
a=0;//     :try_end_3
a=0;//     .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_3 .. :try_end_3} :catch_3
a=0;//     .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_4
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 202
a=0;//     :goto_5
a=0;//     #v6=(Conflicted);v7=(Conflicted);
a=0;//     invoke-interface {v5}, Lorg/apache/http/client/HttpClient;->getConnectionManager()Lorg/apache/http/conn/ClientConnectionManager;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lorg/apache/http/conn/ClientConnectionManager;);
a=0;//     invoke-interface {v1}, Lorg/apache/http/conn/ClientConnectionManager;->shutdown()V
a=0;// 
a=0;//     move-object v1, v0
a=0;// 
a=0;//     goto/16 :goto_4
a=0;// 
a=0;//     .line 164
a=0;//     :cond_12
a=0;//     :try_start_4
a=0;//     #v1=(Null);v6=(Boolean);v7=(Integer);
a=0;//     invoke-interface {v0}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;
a=0;//     :try_end_4
a=0;//     .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_4 .. :try_end_4} :catch_3
a=0;//     .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_4
a=0;//     .catchall {:try_start_4 .. :try_end_4} :catchall_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 165
a=0;//     if-eqz v0, :cond_13
a=0;// 
a=0;//     .line 167
a=0;//     :try_start_5
a=0;//     const-string v6, "UTF-8"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v6}, Lorg/apache/http/util/EntityUtils;->toString(Lorg/apache/http/HttpEntity;Ljava/lang/String;)Ljava/lang/String;
a=0;//     :try_end_5
a=0;//     .catch Lorg/apache/http/ParseException; {:try_start_5 .. :try_end_5} :catch_1
a=0;//     .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_2
a=0;//     .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_5 .. :try_end_5} :catch_3
a=0;//     .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_4
a=0;//     .catchall {:try_start_5 .. :try_end_5} :catchall_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_5
a=0;// 
a=0;//     .line 169
a=0;//     :catch_1
a=0;//     #v6=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 170
a=0;//     :try_start_6
a=0;//     const-string v6, "QueryTask"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     const-string v7, "SAF-A Exception:511002"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v6, v7}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 173
a=0;//     invoke-virtual {v0}, Lorg/apache/http/ParseException;->printStackTrace()V
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .line 179
a=0;//     #v0=(Null);
a=0;//     goto :goto_5
a=0;// 
a=0;//     .line 174
a=0;//     :catch_2
a=0;//     #v0=(Reference,Lorg/apache/http/HttpEntity;);v6=(Conflicted);v7=(Integer);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 175
a=0;//     const-string v6, "QueryTask"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     const-string v7, "SAF-A Exception:511003"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v6, v7}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 178
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
a=0;//     :try_end_6
a=0;//     .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_6 .. :try_end_6} :catch_3
a=0;//     .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_4
a=0;//     .catchall {:try_start_6 .. :try_end_6} :catchall_0
a=0;// 
a=0;//     :cond_13
a=0;//     #v6=(Conflicted);v7=(Conflicted);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_5
a=0;// 
a=0;//     .line 183
a=0;//     :catch_3
a=0;//     #v0=(Reference,Ujava/lang/Object;);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 184
a=0;//     :try_start_7
a=0;//     const-string v6, "QueryTask"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     const-string v7, "SAF-A Exception:511004"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v6, v7}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 187
a=0;//     add-int/lit8 v3, v3, -0x1
a=0;// 
a=0;//     .line 188
a=0;//     invoke-virtual {v0}, Lorg/apache/http/client/ClientProtocolException;->printStackTrace()V
a=0;//     :try_end_7
a=0;//     .catchall {:try_start_7 .. :try_end_7} :catchall_0
a=0;// 
a=0;//     .line 202
a=0;//     invoke-interface {v5}, Lorg/apache/http/client/HttpClient;->getConnectionManager()Lorg/apache/http/conn/ClientConnectionManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Lorg/apache/http/conn/ClientConnectionManager;->shutdown()V
a=0;// 
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     .line 189
a=0;//     :catch_4
a=0;//     #v6=(Conflicted);v7=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 190
a=0;//     :try_start_8
a=0;//     const-string v6, "QueryTask"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     const-string v7, "SAF-A Exception:511005"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v6, v7}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 192
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     .line 193
a=0;//     instance-of v6, v0, Ljava/net/SocketTimeoutException;
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-nez v6, :cond_14
a=0;// 
a=0;//     instance-of v6, v0, Lorg/apache/http/conn/ConnectTimeoutException;
a=0;// 
a=0;//     if-nez v6, :cond_14
a=0;// 
a=0;//     instance-of v6, v0, Lorg/apache/http/NoHttpResponseException;
a=0;// 
a=0;//     if-nez v6, :cond_14
a=0;// 
a=0;//     instance-of v0, v0, Ljava/net/SocketException;
a=0;//     :try_end_8
a=0;//     .catchall {:try_start_8 .. :try_end_8} :catchall_0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_15
a=0;// 
a=0;//     .line 197
a=0;//     :cond_14
a=0;//     #v0=(Conflicted);
a=0;//     add-int/lit8 v0, v3, -0x1
a=0;// 
a=0;//     .line 202
a=0;//     :goto_6
a=0;//     #v0=(Integer);
a=0;//     invoke-interface {v5}, Lorg/apache/http/client/HttpClient;->getConnectionManager()Lorg/apache/http/conn/ClientConnectionManager;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Lorg/apache/http/conn/ClientConnectionManager;);
a=0;//     invoke-interface {v3}, Lorg/apache/http/conn/ClientConnectionManager;->shutdown()V
a=0;// 
a=0;//     move v3, v0
a=0;// 
a=0;//     .line 203
a=0;//     #v3=(Integer);
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     :cond_15
a=0;//     #v0=(Boolean);
a=0;//     move v0, v2
a=0;// 
a=0;//     .line 199
a=0;//     #v0=(Null);
a=0;//     goto :goto_6
a=0;// 
a=0;//     .line 202
a=0;//     :catchall_0
a=0;//     #v0=(Reference,Ujava/lang/Object;);v6=(Conflicted);v7=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     invoke-interface {v5}, Lorg/apache/http/client/HttpClient;->getConnectionManager()Lorg/apache/http/conn/ClientConnectionManager;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lorg/apache/http/conn/ClientConnectionManager;);
a=0;//     invoke-interface {v1}, Lorg/apache/http/conn/ClientConnectionManager;->shutdown()V
a=0;// 
a=0;//     throw v0
a=0;// .end method
}}
