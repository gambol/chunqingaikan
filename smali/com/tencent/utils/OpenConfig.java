package com.tencent.utils; class OpenConfig { void a() { int a;
a=0;// .class public Lcom/tencent/utils/OpenConfig;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ProGuard"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static a:Ljava/util/HashMap;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/HashMap",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Lcom/tencent/utils/OpenConfig;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private static b:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private c:Landroid/content/Context;
a=0;// 
a=0;// .field private d:Ljava/lang/String;
a=0;// 
a=0;// .field private e:Lorg/json/JSONObject;
a=0;// 
a=0;// .field private f:J
a=0;// 
a=0;// .field private g:I
a=0;// 
a=0;// .field private h:Z
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 31
a=0;//     #v0=(Null);
a=0;//     sput-object v0, Lcom/tencent/utils/OpenConfig;->a:Ljava/util/HashMap;
a=0;// 
a=0;//     .line 33
a=0;//     sput-object v0, Lcom/tencent/utils/OpenConfig;->b:Ljava/lang/String;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 72
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 35
a=0;//     #p0=(Reference,Lcom/tencent/utils/OpenConfig;);
a=0;//     iput-object v0, p0, Lcom/tencent/utils/OpenConfig;->c:Landroid/content/Context;
a=0;// 
a=0;//     .line 37
a=0;//     iput-object v0, p0, Lcom/tencent/utils/OpenConfig;->d:Ljava/lang/String;
a=0;// 
a=0;//     .line 39
a=0;//     iput-object v0, p0, Lcom/tencent/utils/OpenConfig;->e:Lorg/json/JSONObject;
a=0;// 
a=0;//     .line 41
a=0;//     const-wide/16 v0, 0x0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     iput-wide v0, p0, Lcom/tencent/utils/OpenConfig;->f:J
a=0;// 
a=0;//     .line 43
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput v0, p0, Lcom/tencent/utils/OpenConfig;->g:I
a=0;// 
a=0;//     .line 45
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/tencent/utils/OpenConfig;->h:Z
a=0;// 
a=0;//     .line 73
a=0;//     iput-object p1, p0, Lcom/tencent/utils/OpenConfig;->c:Landroid/content/Context;
a=0;// 
a=0;//     .line 74
a=0;//     iput-object p2, p0, Lcom/tencent/utils/OpenConfig;->d:Ljava/lang/String;
a=0;// 
a=0;//     .line 75
a=0;//     invoke-direct {p0}, Lcom/tencent/utils/OpenConfig;->a()V
a=0;// 
a=0;//     .line 76
a=0;//     invoke-direct {p0}, Lcom/tencent/utils/OpenConfig;->b()V
a=0;// 
a=0;//     .line 78
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcom/tencent/utils/OpenConfig;I)I
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 24
a=0;//     iput p1, p0, Lcom/tencent/utils/OpenConfig;->g:I
a=0;// 
a=0;//     return p1
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcom/tencent/utils/OpenConfig;)Landroid/content/Context;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 24
a=0;//     iget-object v0, p0, Lcom/tencent/utils/OpenConfig;->c:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private a(Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 100
a=0;//     .line 102
a=0;//     const-string v1, ""
a=0;// 
a=0;//     .line 105
a=0;//     :try_start_0
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget-object v0, p0, Lcom/tencent/utils/OpenConfig;->d:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 106
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v2, "."
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v2, p0, Lcom/tencent/utils/OpenConfig;->d:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 111
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);
a=0;//     iget-object v2, p0, Lcom/tencent/utils/OpenConfig;->c:Landroid/content/Context;
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v2, v0}, Landroid/content/Context;->openFileInput(Ljava/lang/String;)Ljava/io/FileInputStream;
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 120
a=0;//     :goto_1
a=0;//     #v2=(Conflicted);
a=0;//     new-instance v3, Ljava/io/BufferedReader;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/io/BufferedReader;);
a=0;//     new-instance v2, Ljava/io/InputStreamReader;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/InputStreamReader;);
a=0;//     invoke-direct {v2, v0}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/InputStreamReader;);
a=0;//     invoke-direct {v3, v2}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
a=0;// 
a=0;//     .line 121
a=0;//     #v3=(Reference,Ljava/io/BufferedReader;);
a=0;//     new-instance v2, Ljava/lang/StringBuffer;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuffer;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V
a=0;// 
a=0;//     .line 124
a=0;//     :goto_2
a=0;//     :try_start_1
a=0;//     #v2=(Reference,Ljava/lang/StringBuffer;);v4=(Conflicted);
a=0;//     invoke-virtual {v3}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v4, :cond_1
a=0;// 
a=0;//     .line 125
a=0;//     invoke-virtual {v2, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
a=0;//     :try_end_1
a=0;//     .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 128
a=0;//     :catch_0
a=0;//     #v4=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     .line 129
a=0;//     :try_start_2
a=0;//     invoke-virtual {v2}, Ljava/io/IOException;->printStackTrace()V
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     .line 132
a=0;//     :try_start_3
a=0;//     invoke-virtual {v0}, Ljava/io/InputStream;->close()V
a=0;// 
a=0;//     .line 133
a=0;//     invoke-virtual {v3}, Ljava/io/BufferedReader;->close()V
a=0;//     :try_end_3
a=0;//     .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_4
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .line 138
a=0;//     :goto_3
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     move-object v0, p1
a=0;// 
a=0;//     .line 108
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 112
a=0;//     :catch_1
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 114
a=0;//     :try_start_4
a=0;//     #v0=(Reference,Ljava/io/FileNotFoundException;);
a=0;//     iget-object v0, p0, Lcom/tencent/utils/OpenConfig;->c:Landroid/content/Context;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;
a=0;//     :try_end_4
a=0;//     .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 115
a=0;//     :catch_2
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 116
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .line 117
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 127
a=0;//     :cond_1
a=0;//     :try_start_5
a=0;//     #v2=(Reference,Ljava/lang/StringBuffer;);v3=(Reference,Ljava/io/BufferedReader;);v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
a=0;//     :try_end_5
a=0;//     .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_0
a=0;//     .catchall {:try_start_5 .. :try_end_5} :catchall_0
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 132
a=0;//     :try_start_6
a=0;//     invoke-virtual {v0}, Ljava/io/InputStream;->close()V
a=0;// 
a=0;//     .line 133
a=0;//     invoke-virtual {v3}, Ljava/io/BufferedReader;->close()V
a=0;//     :try_end_6
a=0;//     .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_3
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .line 136
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 134
a=0;//     :catch_3
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 135
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .line 137
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 134
a=0;//     :catch_4
a=0;//     #v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 135
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .line 137
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 131
a=0;//     :catchall_0
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 132
a=0;//     :try_start_7
a=0;//     invoke-virtual {v0}, Ljava/io/InputStream;->close()V
a=0;// 
a=0;//     .line 133
a=0;//     invoke-virtual {v3}, Ljava/io/BufferedReader;->close()V
a=0;//     :try_end_7
a=0;//     .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_5
a=0;// 
a=0;//     .line 136
a=0;//     :goto_4
a=0;//     throw v1
a=0;// 
a=0;//     .line 134
a=0;//     :catch_5
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 135
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_4
a=0;// .end method
a=0;// 
a=0;// .method private a()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 84
a=0;//     const-string v0, "com.tencent.open.config.json"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0, v0}, Lcom/tencent/utils/OpenConfig;->a(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 86
a=0;//     :try_start_0
a=0;//     new-instance v1, Lorg/json/JSONObject;
a=0;// 
a=0;//     #v1=(UninitRef,Lorg/json/JSONObject;);
a=0;//     invoke-direct {v1, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Lorg/json/JSONObject;);
a=0;//     iput-object v1, p0, Lcom/tencent/utils/OpenConfig;->e:Lorg/json/JSONObject;
a=0;//     :try_end_0
a=0;//     .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 90
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 87
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 88
a=0;//     new-instance v0, Lorg/json/JSONObject;
a=0;// 
a=0;//     #v0=(UninitRef,Lorg/json/JSONObject;);
a=0;//     invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lorg/json/JSONObject;);
a=0;//     iput-object v0, p0, Lcom/tencent/utils/OpenConfig;->e:Lorg/json/JSONObject;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcom/tencent/utils/OpenConfig;Lorg/json/JSONObject;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 24
a=0;//     invoke-direct {p0, p1}, Lcom/tencent/utils/OpenConfig;->a(Lorg/json/JSONObject;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private a(Ljava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 150
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcom/tencent/utils/OpenConfig;->d:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 151
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "."
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/utils/OpenConfig;->d:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object p1
a=0;// 
a=0;//     .line 155
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/tencent/utils/OpenConfig;->c:Landroid/content/Context;
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, p1, v1}, Landroid/content/Context;->openFileOutput(Ljava/lang/String;I)Ljava/io/FileOutputStream;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 158
a=0;//     new-instance v1, Ljava/io/OutputStreamWriter;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/OutputStreamWriter;);
a=0;//     invoke-direct {v1, v0}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;)V
a=0;// 
a=0;//     .line 159
a=0;//     #v1=(Reference,Ljava/io/OutputStreamWriter;);
a=0;//     invoke-virtual {v1, p2}, Ljava/io/OutputStreamWriter;->write(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 160
a=0;//     invoke-virtual {v1}, Ljava/io/OutputStreamWriter;->flush()V
a=0;// 
a=0;//     .line 161
a=0;//     invoke-virtual {v1}, Ljava/io/OutputStreamWriter;->close()V
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 165
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 162
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 163
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private a(Lorg/json/JSONObject;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 216
a=0;//     const-string v0, "cgi back, do update"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0, v0}, Lcom/tencent/utils/OpenConfig;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 217
a=0;//     iput-object p1, p0, Lcom/tencent/utils/OpenConfig;->e:Lorg/json/JSONObject;
a=0;// 
a=0;//     .line 218
a=0;//     const-string v0, "com.tencent.open.config.json"
a=0;// 
a=0;//     invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0, v0, v1}, Lcom/tencent/utils/OpenConfig;->a(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 219
a=0;//     invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     iput-wide v0, p0, Lcom/tencent/utils/OpenConfig;->f:J
a=0;// 
a=0;//     .line 220
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private b()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 171
a=0;//     iget v0, p0, Lcom/tencent/utils/OpenConfig;->g:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 173
a=0;//     const-string v0, "update thread is running, return"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0, v0}, Lcom/tencent/utils/OpenConfig;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 208
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 176
a=0;//     :cond_0
a=0;//     #v0=(Integer);v1=(Uninit);v2=(Uninit);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput v0, p0, Lcom/tencent/utils/OpenConfig;->g:I
a=0;// 
a=0;//     .line 177
a=0;//     new-instance v0, Landroid/os/Bundle;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/os/Bundle;);
a=0;//     invoke-direct {v0}, Landroid/os/Bundle;-><init>()V
a=0;// 
a=0;//     .line 178
a=0;//     #v0=(Reference,Landroid/os/Bundle;);
a=0;//     const-string v1, "appid"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget-object v2, p0, Lcom/tencent/utils/OpenConfig;->d:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 179
a=0;//     const-string v1, "appid_for_getting_config"
a=0;// 
a=0;//     iget-object v2, p0, Lcom/tencent/utils/OpenConfig;->d:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 180
a=0;//     const-string v1, "status_os"
a=0;// 
a=0;//     sget-object v2, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 181
a=0;//     const-string v1, "status_machine"
a=0;// 
a=0;//     sget-object v2, Landroid/os/Build;->MODEL:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 182
a=0;//     const-string v1, "status_version"
a=0;// 
a=0;//     sget-object v2, Landroid/os/Build$VERSION;->SDK:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 183
a=0;//     const-string v1, "sdkv"
a=0;// 
a=0;//     const-string v2, "2.2.1"
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 184
a=0;//     const-string v1, "sdkp"
a=0;// 
a=0;//     const-string v2, "a"
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 186
a=0;//     new-instance v1, Lcom/tencent/utils/OpenConfig$1;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/tencent/utils/OpenConfig$1;);
a=0;//     invoke-direct {v1, p0, v0}, Lcom/tencent/utils/OpenConfig$1;-><init>(Lcom/tencent/utils/OpenConfig;Landroid/os/Bundle;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/utils/OpenConfig$1;);
a=0;//     invoke-virtual {v1}, Lcom/tencent/utils/OpenConfig$1;->start()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private b(Ljava/lang/String;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 322
a=0;//     iget-boolean v0, p0, Lcom/tencent/utils/OpenConfig;->h:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 323
a=0;//     const-string v0, "OpenConfig"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "; appid: "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v2, p0, Lcom/tencent/utils/OpenConfig;->d:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 325
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private c()V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 226
a=0;//     iget-object v0, p0, Lcom/tencent/utils/OpenConfig;->e:Lorg/json/JSONObject;
a=0;// 
a=0;//     #v0=(Reference,Lorg/json/JSONObject;);
a=0;//     const-string v1, "Common_frequency"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 227
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 228
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 230
a=0;//     :cond_0
a=0;//     const v1, 0x36ee80
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     mul-int/2addr v0, v1
a=0;// 
a=0;//     int-to-long v0, v0
a=0;// 
a=0;//     .line 231
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     .line 233
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     iget-wide v4, p0, Lcom/tencent/utils/OpenConfig;->f:J
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     sub-long/2addr v2, v4
a=0;// 
a=0;//     cmp-long v0, v2, v0
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-ltz v0, :cond_1
a=0;// 
a=0;//     .line 235
a=0;//     invoke-direct {p0}, Lcom/tencent/utils/OpenConfig;->b()V
a=0;// 
a=0;//     .line 237
a=0;//     :cond_1
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static getInstance(Landroid/content/Context;Ljava/lang/String;)Lcom/tencent/utils/OpenConfig;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 51
a=0;//     sget-object v0, Lcom/tencent/utils/OpenConfig;->a:Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 52
a=0;//     new-instance v0, Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v0}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     sput-object v0, Lcom/tencent/utils/OpenConfig;->a:Ljava/util/HashMap;
a=0;// 
a=0;//     .line 54
a=0;//     :cond_0
a=0;//     if-eqz p1, :cond_1
a=0;// 
a=0;//     .line 55
a=0;//     sput-object p1, Lcom/tencent/utils/OpenConfig;->b:Ljava/lang/String;
a=0;// 
a=0;//     .line 57
a=0;//     :cond_1
a=0;//     if-nez p1, :cond_2
a=0;// 
a=0;//     .line 58
a=0;//     sget-object v0, Lcom/tencent/utils/OpenConfig;->b:Ljava/lang/String;
a=0;// 
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     .line 59
a=0;//     sget-object p1, Lcom/tencent/utils/OpenConfig;->b:Ljava/lang/String;
a=0;// 
a=0;//     .line 64
a=0;//     :cond_2
a=0;//     :goto_0
a=0;//     sget-object v0, Lcom/tencent/utils/OpenConfig;->a:Ljava/util/HashMap;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/tencent/utils/OpenConfig;
a=0;// 
a=0;//     .line 65
a=0;//     if-nez v0, :cond_3
a=0;// 
a=0;//     .line 66
a=0;//     new-instance v0, Lcom/tencent/utils/OpenConfig;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/utils/OpenConfig;);
a=0;//     invoke-direct {v0, p0, p1}, Lcom/tencent/utils/OpenConfig;-><init>(Landroid/content/Context;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 67
a=0;//     #v0=(Reference,Lcom/tencent/utils/OpenConfig;);
a=0;//     sget-object v1, Lcom/tencent/utils/OpenConfig;->a:Ljava/util/HashMap;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-virtual {v1, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 69
a=0;//     :cond_3
a=0;//     #v1=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 61
a=0;//     :cond_4
a=0;//     #v1=(Uninit);
a=0;//     const-string p1, "0"
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public get(Ljava/lang/String;)Ljava/lang/Object;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 316
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "get "
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
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {p0, v0}, Lcom/tencent/utils/OpenConfig;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 317
a=0;//     invoke-direct {p0}, Lcom/tencent/utils/OpenConfig;->c()V
a=0;// 
a=0;//     .line 318
a=0;//     iget-object v0, p0, Lcom/tencent/utils/OpenConfig;->e:Lorg/json/JSONObject;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getBoolean(Ljava/lang/String;)Z
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 295
a=0;//     #v1=(Null);
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "get "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {p0, v0}, Lcom/tencent/utils/OpenConfig;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 296
a=0;//     invoke-direct {p0}, Lcom/tencent/utils/OpenConfig;->c()V
a=0;// 
a=0;//     .line 297
a=0;//     iget-object v0, p0, Lcom/tencent/utils/OpenConfig;->e:Lorg/json/JSONObject;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 298
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 305
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Boolean);v2=(Conflicted);
a=0;//     return v1
a=0;// 
a=0;//     .line 300
a=0;//     :cond_1
a=0;//     #v0=(Reference,Ljava/lang/Object;);v1=(Null);v2=(Reference,Ljava/lang/String;);
a=0;//     instance-of v2, v0, Ljava/lang/Integer;
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_3
a=0;// 
a=0;//     .line 301
a=0;//     invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_1
a=0;//     move v1, v0
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v1=(Null);
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 302
a=0;//     :cond_3
a=0;//     #v0=(Reference,Ljava/lang/Object;);v2=(Boolean);
a=0;//     instance-of v2, v0, Ljava/lang/Boolean;
a=0;// 
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 303
a=0;//     check-cast v0, Ljava/lang/Boolean;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getDouble(Ljava/lang/String;)D
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 282
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "get "
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
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {p0, v0}, Lcom/tencent/utils/OpenConfig;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 283
a=0;//     invoke-direct {p0}, Lcom/tencent/utils/OpenConfig;->c()V
a=0;// 
a=0;//     .line 284
a=0;//     iget-object v0, p0, Lcom/tencent/utils/OpenConfig;->e:Lorg/json/JSONObject;
a=0;// 
a=0;//     const-wide/16 v1, 0x0
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     invoke-virtual {v0, p1, v1, v2}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;D)D
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(DoubleLo);v1=(DoubleHi);
a=0;//     return-wide v0
a=0;// .end method
a=0;// 
a=0;// .method public getInt(Ljava/lang/String;)I
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 258
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "get "
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
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {p0, v0}, Lcom/tencent/utils/OpenConfig;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 259
a=0;//     invoke-direct {p0}, Lcom/tencent/utils/OpenConfig;->c()V
a=0;// 
a=0;//     .line 260
a=0;//     iget-object v0, p0, Lcom/tencent/utils/OpenConfig;->e:Lorg/json/JSONObject;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getLong(Ljava/lang/String;)J
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 270
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "get "
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
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {p0, v0}, Lcom/tencent/utils/OpenConfig;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 271
a=0;//     invoke-direct {p0}, Lcom/tencent/utils/OpenConfig;->c()V
a=0;// 
a=0;//     .line 272
a=0;//     iget-object v0, p0, Lcom/tencent/utils/OpenConfig;->e:Lorg/json/JSONObject;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// .end method
a=0;// 
a=0;// .method public getString(Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 246
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "get "
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
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {p0, v0}, Lcom/tencent/utils/OpenConfig;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 247
a=0;//     invoke-direct {p0}, Lcom/tencent/utils/OpenConfig;->c()V
a=0;// 
a=0;//     .line 248
a=0;//     iget-object v0, p0, Lcom/tencent/utils/OpenConfig;->e:Lorg/json/JSONObject;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
}}
