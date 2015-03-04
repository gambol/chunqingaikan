package com.ctu.app.utils; class Request { void a() { int a;
a=0;// .class public Lcom/ctu/app/utils/Request;
a=0;// .super Ljava/lang/Object;
a=0;// .source "Request.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/ctu/app/utils/Request$Response;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final TAG:Ljava/lang/String; = "com.ctu.travelsdk:Request"
a=0;// 
a=0;// .field static activity:Landroid/app/Activity;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final MAX_RETRY_COUNT:I
a=0;// 
a=0;// .field final RETRY_INTERVAL:I
a=0;// 
a=0;// .field data:[B
a=0;// 
a=0;// .field isPost:Z
a=0;// 
a=0;// .field ret:Lcom/ctu/app/utils/Request$Response;
a=0;// 
a=0;// .field runnable:Ljava/lang/Runnable;
a=0;// 
a=0;// .field thread:Ljava/lang/Thread;
a=0;// 
a=0;// .field url:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 43
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     sput-object v0, Lcom/ctu/app/utils/Request;->activity:Landroid/app/Activity;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/app/Activity;)V
a=0;//     .locals 1
a=0;//     .param p1, "caller"    # Landroid/app/Activity;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 48
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 39
a=0;//     #p0=(Reference,Lcom/ctu/app/utils/Request;);
a=0;//     iput-object v0, p0, Lcom/ctu/app/utils/Request;->url:Ljava/lang/String;
a=0;// 
a=0;//     .line 40
a=0;//     iput-object v0, p0, Lcom/ctu/app/utils/Request;->data:[B
a=0;// 
a=0;//     .line 41
a=0;//     iput-object v0, p0, Lcom/ctu/app/utils/Request;->ret:Lcom/ctu/app/utils/Request$Response;
a=0;// 
a=0;//     .line 42
a=0;//     iput-object v0, p0, Lcom/ctu/app/utils/Request;->thread:Ljava/lang/Thread;
a=0;// 
a=0;//     .line 44
a=0;//     const/4 v0, 0x6
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     iput v0, p0, Lcom/ctu/app/utils/Request;->MAX_RETRY_COUNT:I
a=0;// 
a=0;//     .line 45
a=0;//     const/16 v0, 0x5dc
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     iput v0, p0, Lcom/ctu/app/utils/Request;->RETRY_INTERVAL:I
a=0;// 
a=0;//     .line 46
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Lcom/ctu/app/utils/Request;->isPost:Z
a=0;// 
a=0;//     .line 69
a=0;//     new-instance v0, Lcom/ctu/app/utils/Request$1;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/ctu/app/utils/Request$1;);
a=0;//     invoke-direct {v0, p0}, Lcom/ctu/app/utils/Request$1;-><init>(Lcom/ctu/app/utils/Request;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/ctu/app/utils/Request$1;);
a=0;//     iput-object v0, p0, Lcom/ctu/app/utils/Request;->runnable:Ljava/lang/Runnable;
a=0;// 
a=0;//     .line 49
a=0;//     sput-object p1, Lcom/ctu/app/utils/Request;->activity:Landroid/app/Activity;
a=0;// 
a=0;//     .line 50
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$000()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 31
a=0;//     invoke-static {}, Lcom/ctu/app/utils/Request;->isConnected()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public static inputStream2String(Ljava/io/InputStream;)Ljava/lang/String;
a=0;//     .locals 5
a=0;//     .param p0, "is"    # Ljava/io/InputStream;
a=0;// 
a=0;//     .prologue
a=0;//     .line 178
a=0;//     new-instance v2, Ljava/io/BufferedReader;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/BufferedReader;);
a=0;//     new-instance v4, Ljava/io/InputStreamReader;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/io/InputStreamReader;);
a=0;//     invoke-direct {v4, p0}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/io/InputStreamReader;);
a=0;//     invoke-direct {v2, v4}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
a=0;// 
a=0;//     .line 179
a=0;//     .local v2, "in":Ljava/io/BufferedReader;
a=0;//     #v2=(Reference,Ljava/io/BufferedReader;);
a=0;//     new-instance v0, Ljava/lang/StringBuffer;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuffer;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V
a=0;// 
a=0;//     .line 180
a=0;//     .local v0, "buffer":Ljava/lang/StringBuffer;
a=0;//     #v0=(Reference,Ljava/lang/StringBuffer;);
a=0;//     const-string v3, ""
a=0;// 
a=0;//     .line 182
a=0;//     .local v3, "line":Ljava/lang/String;
a=0;//     :goto_0
a=0;//     :try_start_0
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     .line 183
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 185
a=0;//     :catch_0
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 186
a=0;//     .local v1, "e":Ljava/io/IOException;
a=0;//     #v1=(Reference,Ljava/io/IOException;);
a=0;//     invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     .line 188
a=0;//     .end local v1    # "e":Ljava/io/IOException;
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     return-object v4
a=0;// .end method
a=0;// 
a=0;// .method private static isConnected()Z
a=0;//     .locals 8
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     .line 155
a=0;//     #v4=(One);
a=0;//     sget-object v6, Lcom/ctu/app/utils/Request;->activity:Landroid/app/Activity;
a=0;// 
a=0;//     #v6=(Reference,Landroid/app/Activity;);
a=0;//     sget-object v7, Lcom/ctu/app/utils/Request;->activity:Landroid/app/Activity;
a=0;// 
a=0;//     #v7=(Reference,Landroid/app/Activity;);
a=0;//     const-string v7, "connectivity"
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Landroid/net/ConnectivityManager;
a=0;// 
a=0;//     .line 157
a=0;//     .local v1, "mConnectivityManager":Landroid/net/ConnectivityManager;
a=0;//     invoke-virtual {v1}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 158
a=0;//     .local v2, "mNetworkInfo":Landroid/net/NetworkInfo;
a=0;//     #v2=(Reference,Landroid/net/NetworkInfo;);
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     .line 159
a=0;//     invoke-virtual {v2}, Landroid/net/NetworkInfo;->isAvailable()Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_2
a=0;// 
a=0;//     .line 160
a=0;//     invoke-virtual {v1, v5}, Landroid/net/ConnectivityManager;->getNetworkInfo(I)Landroid/net/NetworkInfo;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Landroid/net/NetworkInfo;);
a=0;//     invoke-virtual {v6}, Landroid/net/NetworkInfo;->getState()Landroid/net/NetworkInfo$State;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 162
a=0;//     .local v0, "gprs":Landroid/net/NetworkInfo$State;
a=0;//     #v0=(Reference,Landroid/net/NetworkInfo$State;);
a=0;//     invoke-virtual {v1, v4}, Landroid/net/ConnectivityManager;->getNetworkInfo(I)Landroid/net/NetworkInfo;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Landroid/net/NetworkInfo;->getState()Landroid/net/NetworkInfo$State;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 164
a=0;//     .local v3, "wifi":Landroid/net/NetworkInfo$State;
a=0;//     #v3=(Reference,Landroid/net/NetworkInfo$State;);
a=0;//     sget-object v6, Landroid/net/NetworkInfo$State;->CONNECTED:Landroid/net/NetworkInfo$State;
a=0;// 
a=0;//     if-eq v0, v6, :cond_0
a=0;// 
a=0;//     sget-object v6, Landroid/net/NetworkInfo$State;->CONNECTING:Landroid/net/NetworkInfo$State;
a=0;// 
a=0;//     if-ne v0, v6, :cond_1
a=0;// 
a=0;//     .line 174
a=0;//     .end local v0    # "gprs":Landroid/net/NetworkInfo$State;
a=0;//     .end local v3    # "wifi":Landroid/net/NetworkInfo$State;
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v3=(Conflicted);v4=(Boolean);v6=(Conflicted);
a=0;//     return v4
a=0;// 
a=0;//     .line 168
a=0;//     .restart local v0    # "gprs":Landroid/net/NetworkInfo$State;
a=0;//     .restart local v3    # "wifi":Landroid/net/NetworkInfo$State;
a=0;//     :cond_1
a=0;//     #v0=(Reference,Landroid/net/NetworkInfo$State;);v3=(Reference,Landroid/net/NetworkInfo$State;);v4=(One);v6=(Reference,Landroid/net/NetworkInfo$State;);
a=0;//     sget-object v6, Landroid/net/NetworkInfo$State;->CONNECTED:Landroid/net/NetworkInfo$State;
a=0;// 
a=0;//     if-eq v3, v6, :cond_0
a=0;// 
a=0;//     sget-object v6, Landroid/net/NetworkInfo$State;->CONNECTING:Landroid/net/NetworkInfo$State;
a=0;// 
a=0;//     if-eq v3, v6, :cond_0
a=0;// 
a=0;//     .end local v0    # "gprs":Landroid/net/NetworkInfo$State;
a=0;//     .end local v3    # "wifi":Landroid/net/NetworkInfo$State;
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v3=(Conflicted);v6=(Conflicted);
a=0;//     move v4, v5
a=0;// 
a=0;//     .line 174
a=0;//     #v4=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public Get(Ljava/lang/String;Lcom/ctu/app/utils/Request$Response;)V
a=0;//     .locals 2
a=0;//     .param p1, "aUrl"    # Ljava/lang/String;
a=0;//     .param p2, "aRet"    # Lcom/ctu/app/utils/Request$Response;
a=0;// 
a=0;//     .prologue
a=0;//     .line 53
a=0;//     iput-object p1, p0, Lcom/ctu/app/utils/Request;->url:Ljava/lang/String;
a=0;// 
a=0;//     .line 54
a=0;//     iput-object p2, p0, Lcom/ctu/app/utils/Request;->ret:Lcom/ctu/app/utils/Request$Response;
a=0;// 
a=0;//     .line 55
a=0;//     new-instance v0, Ljava/lang/Thread;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/Thread;);
a=0;//     iget-object v1, p0, Lcom/ctu/app/utils/Request;->runnable:Ljava/lang/Runnable;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Runnable;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Thread;);
a=0;//     iput-object v0, p0, Lcom/ctu/app/utils/Request;->thread:Ljava/lang/Thread;
a=0;// 
a=0;//     .line 56
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Lcom/ctu/app/utils/Request;->isPost:Z
a=0;// 
a=0;//     .line 57
a=0;//     iget-object v0, p0, Lcom/ctu/app/utils/Request;->thread:Ljava/lang/Thread;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Thread;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Thread;->start()V
a=0;// 
a=0;//     .line 58
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public Post(Ljava/lang/String;[BLcom/ctu/app/utils/Request$Response;)V
a=0;//     .locals 2
a=0;//     .param p1, "aUrl"    # Ljava/lang/String;
a=0;//     .param p2, "aData"    # [B
a=0;//     .param p3, "aRet"    # Lcom/ctu/app/utils/Request$Response;
a=0;// 
a=0;//     .prologue
a=0;//     .line 61
a=0;//     iput-object p1, p0, Lcom/ctu/app/utils/Request;->url:Ljava/lang/String;
a=0;// 
a=0;//     .line 62
a=0;//     iput-object p2, p0, Lcom/ctu/app/utils/Request;->data:[B
a=0;// 
a=0;//     .line 63
a=0;//     iput-object p3, p0, Lcom/ctu/app/utils/Request;->ret:Lcom/ctu/app/utils/Request$Response;
a=0;// 
a=0;//     .line 64
a=0;//     new-instance v0, Ljava/lang/Thread;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/Thread;);
a=0;//     iget-object v1, p0, Lcom/ctu/app/utils/Request;->runnable:Ljava/lang/Runnable;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Runnable;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Thread;);
a=0;//     iput-object v0, p0, Lcom/ctu/app/utils/Request;->thread:Ljava/lang/Thread;
a=0;// 
a=0;//     .line 65
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/ctu/app/utils/Request;->isPost:Z
a=0;// 
a=0;//     .line 66
a=0;//     iget-object v0, p0, Lcom/ctu/app/utils/Request;->thread:Ljava/lang/Thread;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Thread;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Thread;->start()V
a=0;// 
a=0;//     .line 67
a=0;//     return-void
a=0;// .end method
}}
