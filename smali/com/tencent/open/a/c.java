package com.tencent.open.a; class c { void a() { int a;
a=0;// .class public Lcom/tencent/open/a/c;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ProGuard"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static a:Lcom/tencent/open/a/c;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private b:J
a=0;// 
a=0;// .field private c:I
a=0;// 
a=0;// .field private d:Z
a=0;// 
a=0;// .field private e:Ljava/util/Random;
a=0;// 
a=0;// .field private f:Lcom/tencent/open/a/b;
a=0;// 
a=0;// .field private g:Ljava/util/ArrayList;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Lcom/tencent/open/a/d;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private h:Ljava/util/ArrayList;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Lcom/tencent/open/a/d;",
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
a=0;//     .line 30
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     sput-object v0, Lcom/tencent/open/a/c;->a:Lcom/tencent/open/a/c;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 50
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 51
a=0;//     #p0=(Reference,Lcom/tencent/open/a/c;);
a=0;//     const-wide/16 v0, 0x0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     iput-wide v0, p0, Lcom/tencent/open/a/c;->b:J
a=0;// 
a=0;//     .line 52
a=0;//     const/4 v0, 0x3
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     iput v0, p0, Lcom/tencent/open/a/c;->c:I
a=0;// 
a=0;//     .line 53
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Lcom/tencent/open/a/c;->d:Z
a=0;// 
a=0;//     .line 54
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, p0, Lcom/tencent/open/a/c;->g:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 55
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, p0, Lcom/tencent/open/a/c;->h:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 57
a=0;//     new-instance v0, Ljava/util/Random;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/Random;);
a=0;//     invoke-direct {v0}, Ljava/util/Random;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Random;);
a=0;//     iput-object v0, p0, Lcom/tencent/open/a/c;->e:Ljava/util/Random;
a=0;// 
a=0;//     .line 58
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcom/tencent/open/a/c;)I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 27
a=0;//     iget v0, p0, Lcom/tencent/open/a/c;->c:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcom/tencent/open/a/c;I)I
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 27
a=0;//     iput p1, p0, Lcom/tencent/open/a/c;->c:I
a=0;// 
a=0;//     return p1
a=0;// .end method
a=0;// 
a=0;// .method public static a()Lcom/tencent/open/a/c;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 44
a=0;//     sget-object v0, Lcom/tencent/open/a/c;->a:Lcom/tencent/open/a/c;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/open/a/c;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 45
a=0;//     new-instance v0, Lcom/tencent/open/a/c;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/open/a/c;);
a=0;//     invoke-direct {v0}, Lcom/tencent/open/a/c;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/open/a/c;);
a=0;//     sput-object v0, Lcom/tencent/open/a/c;->a:Lcom/tencent/open/a/c;
a=0;// 
a=0;//     .line 47
a=0;//     :cond_0
a=0;//     sget-object v0, Lcom/tencent/open/a/c;->a:Lcom/tencent/open/a/c;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private a(Landroid/content/Context;)Ljava/lang/String;
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 175
a=0;//     :try_start_0
a=0;//     const-string v0, "connectivity"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/net/ConnectivityManager;
a=0;// 
a=0;//     .line 176
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 177
a=0;//     const-string v0, "cgi_report_debug"
a=0;// 
a=0;//     const-string v1, "ReportManager getAPN failed:ConnectivityManager == null"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 178
a=0;//     const-string v0, "no_net"
a=0;// 
a=0;//     .line 204
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 181
a=0;//     :cond_0
a=0;//     #v1=(Uninit);v2=(Uninit);v3=(Uninit);
a=0;//     invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 182
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/net/NetworkInfo;->isAvailable()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_2
a=0;// 
a=0;//     .line 183
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     const-string v0, "cgi_report_debug"
a=0;// 
a=0;//     const-string v1, "ReportManager getAPN failed:NetworkInfo == null"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 184
a=0;//     const-string v0, "no_net"
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 186
a=0;//     :cond_2
a=0;//     #v1=(Boolean);
a=0;//     invoke-virtual {v0}, Landroid/net/NetworkInfo;->getTypeName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 187
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "WIFI"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     .line 188
a=0;//     const-string v0, "cgi_report_debug"
a=0;// 
a=0;//     const-string v1, "ReportManager getAPN type = wifi"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 189
a=0;//     const-string v0, "wifi"
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 191
a=0;//     :cond_3
a=0;//     #v1=(Boolean);
a=0;//     invoke-virtual {v0}, Landroid/net/NetworkInfo;->getExtraInfo()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 192
a=0;//     if-nez v0, :cond_4
a=0;// 
a=0;//     .line 193
a=0;//     const-string v0, "cgi_report_debug"
a=0;// 
a=0;//     const-string v1, "ReportManager getAPN failed:extraInfo == null"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 194
a=0;//     const-string v0, "mobile_unknow"
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 196
a=0;//     :cond_4
a=0;//     #v1=(Boolean);
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 197
a=0;//     const-string v1, "cgi_report_debug"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "ReportManager getAPN type = "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v1, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 202
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 203
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     .line 204
a=0;//     const-string v0, "unknow"
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private a(Landroid/content/Context;Ljava/lang/String;)V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 261
a=0;//     const-string v0, "cgi_report_debug"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "ReportManager doUpload start"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 262
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/tencent/open/a/c;->d:Z
a=0;// 
a=0;//     .line 265
a=0;//     iget-object v0, p0, Lcom/tencent/open/a/c;->f:Lcom/tencent/open/a/b;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/open/a/b;);
a=0;//     invoke-virtual {v0}, Lcom/tencent/open/a/b;->c()Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/tencent/open/a/c;->g:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 266
a=0;//     iget-object v0, p0, Lcom/tencent/open/a/c;->f:Lcom/tencent/open/a/b;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/tencent/open/a/b;->b()Z
a=0;// 
a=0;//     .line 269
a=0;//     iget-object v0, p0, Lcom/tencent/open/a/c;->f:Lcom/tencent/open/a/b;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/tencent/open/a/b;->d()Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/tencent/open/a/c;->h:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 270
a=0;//     iget-object v0, p0, Lcom/tencent/open/a/c;->f:Lcom/tencent/open/a/b;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/tencent/open/a/b;->a()Z
a=0;// 
a=0;//     .line 273
a=0;//     new-instance v2, Landroid/os/Bundle;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/os/Bundle;);
a=0;//     invoke-direct {v2}, Landroid/os/Bundle;-><init>()V
a=0;// 
a=0;//     .line 274
a=0;//     #v2=(Reference,Landroid/os/Bundle;);
a=0;//     const-string v0, "appid"
a=0;// 
a=0;//     invoke-virtual {v2, v0, p2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 275
a=0;//     const-string v0, "releaseversion"
a=0;// 
a=0;//     const-string v1, "QQConnect_SDK_Android_1_7"
a=0;// 
a=0;//     invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 276
a=0;//     const-string v0, "device"
a=0;// 
a=0;//     sget-object v1, Landroid/os/Build;->DEVICE:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 277
a=0;//     const-string v0, "qua"
a=0;// 
a=0;//     const-string v1, "V1_AND_OpenSDK_2.2.1_1077_RDM_B"
a=0;// 
a=0;//     invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 278
a=0;//     const-string v0, "key"
a=0;// 
a=0;//     const-string v1, "apn,frequency,commandid,resultcode,tmcost,reqsize,rspsize,detail,deviceinfo"
a=0;// 
a=0;//     invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 282
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move v1, v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Integer);v3=(Conflicted);v4=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/tencent/open/a/c;->g:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ge v1, v0, :cond_0
a=0;// 
a=0;//     .line 283
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v3, "_1"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/open/a/c;->g:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/tencent/open/a/d;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/tencent/open/a/d;->a()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v2, v3, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 284
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v3, "_2"
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/open/a/c;->g:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/tencent/open/a/d;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/tencent/open/a/d;->b()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v2, v3, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 285
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v3, "_3"
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/open/a/c;->g:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/tencent/open/a/d;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/tencent/open/a/d;->c()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v2, v3, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 286
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v3, "_4"
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/open/a/c;->g:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/tencent/open/a/d;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/tencent/open/a/d;->d()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v2, v3, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 287
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v3, "_5"
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/open/a/c;->g:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/tencent/open/a/d;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/tencent/open/a/d;->e()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v2, v3, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 288
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v3, "_6"
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/open/a/c;->g:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/tencent/open/a/d;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/tencent/open/a/d;->f()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v2, v3, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 289
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v3, "_7"
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/open/a/c;->g:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/tencent/open/a/d;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/tencent/open/a/d;->g()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v2, v3, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 290
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v3, "_8"
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/open/a/c;->g:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/tencent/open/a/d;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/tencent/open/a/d;->h()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v2, v3, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 291
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {p1}, Lcom/tencent/open/a/a;->b(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/open/a/c;->g:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/tencent/open/a/d;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/tencent/open/a/d;->i()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 292
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, "_9"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 282
a=0;//     add-int/lit8 v0, v1, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 294
a=0;//     :cond_0
a=0;//     #v3=(Conflicted);v4=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/tencent/open/a/c;->g:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     :goto_1
a=0;//     iget-object v0, p0, Lcom/tencent/open/a/c;->h:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget-object v3, p0, Lcom/tencent/open/a/c;->g:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v3}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     add-int/2addr v0, v3
a=0;// 
a=0;//     if-ge v1, v0, :cond_1
a=0;// 
a=0;//     .line 295
a=0;//     iget-object v0, p0, Lcom/tencent/open/a/c;->g:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sub-int v3, v1, v0
a=0;// 
a=0;//     .line 296
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v4, "_1"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/open/a/c;->h:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/tencent/open/a/d;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/tencent/open/a/d;->a()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v2, v4, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 297
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v4, "_2"
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/open/a/c;->h:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/tencent/open/a/d;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/tencent/open/a/d;->b()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v2, v4, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 298
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v4, "_3"
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/open/a/c;->h:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/tencent/open/a/d;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/tencent/open/a/d;->c()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v2, v4, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 299
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v4, "_4"
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/open/a/c;->h:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/tencent/open/a/d;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/tencent/open/a/d;->d()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v2, v4, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 300
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v4, "_5"
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/open/a/c;->h:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/tencent/open/a/d;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/tencent/open/a/d;->e()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v2, v4, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 301
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v4, "_6"
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/open/a/c;->h:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/tencent/open/a/d;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/tencent/open/a/d;->f()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v2, v4, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 302
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v4, "_7"
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/open/a/c;->h:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/tencent/open/a/d;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/tencent/open/a/d;->g()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v2, v4, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 303
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v4, "_8"
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/open/a/c;->h:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/tencent/open/a/d;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/tencent/open/a/d;->h()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v2, v4, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 304
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {p1}, Lcom/tencent/open/a/a;->b(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/open/a/c;->h:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/tencent/open/a/d;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/tencent/open/a/d;->i()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 305
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, "_9"
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 294
a=0;//     add-int/lit8 v0, v1, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 307
a=0;//     :cond_1
a=0;//     #v3=(Integer);v4=(Conflicted);
a=0;//     const-string v0, "http://wspeed.qq.com/w.cgi"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "POST"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0, p1, v0, v1, v2}, Lcom/tencent/open/a/c;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 308
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private a(Landroid/content/Context;Ljava/lang/String;JJJILjava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 14
a=0;// 
a=0;//     .prologue
a=0;//     .line 120
a=0;//     invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     sub-long v7, v2, p3
a=0;// 
a=0;//     .line 122
a=0;//     #v7=(LongLo);v8=(LongHi);
a=0;//     const-string v2, "cgi_report_debug"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "ReportManager updateDB url="
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, ",resultCode="
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     move/from16 v0, p9
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, ",timeCost="
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, ",reqSize="
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     move-wide/from16 v0, p5
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     invoke-virtual {v3, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, ",rspSize="
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     move-wide/from16 v0, p7
a=0;// 
a=0;//     invoke-virtual {v3, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v2, v3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 126
a=0;//     move/from16 v0, p9
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-direct {p0, p1, v0}, Lcom/tencent/open/a/c;->b(Landroid/content/Context;I)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 128
a=0;//     #v2=(Integer);
a=0;//     const/16 v3, 0x64
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     div-int v2, v3, v2
a=0;// 
a=0;//     .line 129
a=0;//     if-gtz v2, :cond_0
a=0;// 
a=0;//     .line 130
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     move v4, v2
a=0;// 
a=0;//     .line 135
a=0;//     :goto_0
a=0;//     #v2=(Integer);v4=(Integer);
a=0;//     invoke-direct {p0, p1}, Lcom/tencent/open/a/c;->a(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 136
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     iget-object v2, p0, Lcom/tencent/open/a/c;->f:Lcom/tencent/open/a/b;
a=0;// 
a=0;//     #v2=(Reference,Lcom/tencent/open/a/b;);
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, ""
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     move-object/from16 v5, p2
a=0;// 
a=0;//     move/from16 v6, p9
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     move-wide/from16 v9, p5
a=0;// 
a=0;//     #v9=(LongLo);v10=(LongHi);
a=0;//     move-wide/from16 v11, p7
a=0;// 
a=0;//     #v11=(LongLo);v12=(LongHi);
a=0;//     move-object/from16 v13, p11
a=0;// 
a=0;//     #v13=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual/range {v2 .. v13}, Lcom/tencent/open/a/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IJJJLjava/lang/String;)Z
a=0;// 
a=0;//     .line 137
a=0;//     return-void
a=0;// 
a=0;//     .line 131
a=0;//     :cond_0
a=0;//     #v2=(Integer);v3=(PosByte);v5=(Uninit);v6=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);
a=0;//     const/16 v3, 0x64
a=0;// 
a=0;//     if-le v2, v3, :cond_1
a=0;// 
a=0;//     .line 132
a=0;//     const/16 v2, 0x64
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     move v4, v2
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v2=(Integer);v4=(Reference,Ljava/lang/String;);
a=0;//     move v4, v2
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 318
a=0;//     new-instance v0, Lcom/tencent/open/a/c$1;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/open/a/c$1;);
a=0;//     invoke-direct {v0, p0, p2, p1, p4}, Lcom/tencent/open/a/c$1;-><init>(Lcom/tencent/open/a/c;Ljava/lang/String;Landroid/content/Context;Landroid/os/Bundle;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/open/a/c$1;);
a=0;//     invoke-virtual {v0}, Lcom/tencent/open/a/c$1;->start()V
a=0;// 
a=0;//     .line 383
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private a(Landroid/content/Context;I)Z
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 103
a=0;//     invoke-direct {p0, p1, p2}, Lcom/tencent/open/a/c;->b(Landroid/content/Context;I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 105
a=0;//     #v0=(Integer);
a=0;//     iget-object v1, p0, Lcom/tencent/open/a/c;->e:Ljava/util/Random;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/Random;);
a=0;//     const/16 v2, 0x64
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {v1, v2}, Ljava/util/Random;->nextInt(I)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ge v1, v0, :cond_0
a=0;// 
a=0;//     .line 106
a=0;//     const-string v0, "cgi_report_debug"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "ReportManager availableForFrequency = ture"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 107
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 110
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     .line 109
a=0;//     :cond_0
a=0;//     #v0=(Integer);v1=(Integer);
a=0;//     const-string v0, "cgi_report_debug"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "ReportManager availableForFrequency = false"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 110
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcom/tencent/open/a/c;Z)Z
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 27
a=0;//     iput-boolean p1, p0, Lcom/tencent/open/a/c;->d:Z
a=0;// 
a=0;//     return p1
a=0;// .end method
a=0;// 
a=0;// .method private b(Landroid/content/Context;I)I
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 146
a=0;//     .line 148
a=0;//     #v0=(Null);
a=0;//     if-nez p2, :cond_1
a=0;// 
a=0;//     .line 150
a=0;//     invoke-static {p1, v0}, Lcom/tencent/utils/OpenConfig;->getInstance(Landroid/content/Context;Ljava/lang/String;)Lcom/tencent/utils/OpenConfig;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/utils/OpenConfig;);
a=0;//     const-string v1, "Common_CGIReportFrequencySuccess"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lcom/tencent/utils/OpenConfig;->getInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 152
a=0;//     #v0=(Integer);
a=0;//     const-string v1, "OpenConfig_agent"
a=0;// 
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "config 4:Common_CGIReportFrequencySuccess     config_value:"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 155
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     const/16 v0, 0xa
a=0;// 
a=0;//     .line 156
a=0;//     :cond_0
a=0;//     const-string v1, "OpenConfig_agent"
a=0;// 
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "config 4:Common_CGIReportFrequencySuccess     result_value:"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 170
a=0;//     :goto_0
a=0;//     return v0
a=0;// 
a=0;//     .line 161
a=0;//     :cond_1
a=0;//     #v0=(Null);v1=(Uninit);v2=(Uninit);v3=(Uninit);
a=0;//     invoke-static {p1, v0}, Lcom/tencent/utils/OpenConfig;->getInstance(Landroid/content/Context;Ljava/lang/String;)Lcom/tencent/utils/OpenConfig;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/utils/OpenConfig;);
a=0;//     const-string v1, "Common_CGIReportFrequencyFailed"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lcom/tencent/utils/OpenConfig;->getInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 162
a=0;//     #v0=(Integer);
a=0;//     const-string v1, "OpenConfig_agent"
a=0;// 
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "config 4:Common_CGIReportFrequencyFailed     config_value:"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 165
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     const/16 v0, 0x64
a=0;// 
a=0;//     .line 166
a=0;//     :cond_2
a=0;//     const-string v1, "OpenConfig_agent"
a=0;// 
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "config 4:Common_CGIReportFrequencyFailed     result_value:"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic b(Lcom/tencent/open/a/c;)Ljava/util/ArrayList;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 27
a=0;//     iget-object v0, p0, Lcom/tencent/open/a/c;->g:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private b(Landroid/content/Context;)Z
a=0;//     .locals 8
a=0;// 
a=0;//     .prologue
a=0;//     const-wide/16 v6, 0x0
a=0;// 
a=0;//     .line 213
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-static {p1, v0}, Lcom/tencent/utils/OpenConfig;->getInstance(Landroid/content/Context;Ljava/lang/String;)Lcom/tencent/utils/OpenConfig;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/utils/OpenConfig;);
a=0;//     const-string v1, "Common_CGIReportTimeinterval"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lcom/tencent/utils/OpenConfig;->getLong(Ljava/lang/String;)J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     .line 215
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     const-string v2, "OpenConfig_test"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "config 5:Common_CGIReportTimeinterval     config_value:"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v2, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 217
a=0;//     cmp-long v2, v0, v6
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     const-wide/16 v0, 0x4b0
a=0;// 
a=0;//     .line 218
a=0;//     :cond_0
a=0;//     const-string v2, "OpenConfig_test"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "config 5:Common_CGIReportTimeinterval     result_value:"
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v2, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 221
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     const-wide/16 v4, 0x3e8
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     div-long/2addr v2, v4
a=0;// 
a=0;//     .line 223
a=0;//     iget-wide v4, p0, Lcom/tencent/open/a/c;->b:J
a=0;// 
a=0;//     cmp-long v4, v4, v6
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     if-eqz v4, :cond_1
a=0;// 
a=0;//     iget-wide v4, p0, Lcom/tencent/open/a/c;->b:J
a=0;// 
a=0;//     #v4=(LongLo);
a=0;//     add-long/2addr v0, v4
a=0;// 
a=0;//     cmp-long v0, v0, v2
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-gtz v0, :cond_2
a=0;// 
a=0;//     .line 225
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v4=(Conflicted);
a=0;//     iput-wide v2, p0, Lcom/tencent/open/a/c;->b:J
a=0;// 
a=0;//     .line 226
a=0;//     const-string v0, "cgi_report_debug"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "ReportManager availableForTime = ture"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 227
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 231
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     .line 230
a=0;//     :cond_2
a=0;//     #v0=(Byte);v1=(LongHi);v4=(LongLo);
a=0;//     const-string v0, "cgi_report_debug"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "ReportManager availableForTime = false"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 231
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic c(Lcom/tencent/open/a/c;)Lcom/tencent/open/a/b;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 27
a=0;//     iget-object v0, p0, Lcom/tencent/open/a/c;->f:Lcom/tencent/open/a/b;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/open/a/b;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private c(Landroid/content/Context;)Z
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 240
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-static {p1, v0}, Lcom/tencent/utils/OpenConfig;->getInstance(Landroid/content/Context;Ljava/lang/String;)Lcom/tencent/utils/OpenConfig;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/utils/OpenConfig;);
a=0;//     const-string v1, "Common_CGIReportMaxcount"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lcom/tencent/utils/OpenConfig;->getInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 242
a=0;//     #v0=(Integer);
a=0;//     const-string v1, "OpenConfig_test"
a=0;// 
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "config 6:Common_CGIReportMaxcount     config_value:"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 244
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     const/16 v0, 0x14
a=0;// 
a=0;//     .line 245
a=0;//     :cond_0
a=0;//     const-string v1, "OpenConfig_test"
a=0;// 
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "config 6:Common_CGIReportMaxcount     result_value:"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 248
a=0;//     iget-object v1, p0, Lcom/tencent/open/a/c;->f:Lcom/tencent/open/a/b;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/tencent/open/a/b;->e()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lt v1, v0, :cond_1
a=0;// 
a=0;//     .line 249
a=0;//     const-string v0, "cgi_report_debug"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "ReportManager availableForCount = ture"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 250
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 253
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     .line 252
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(Integer);
a=0;//     const-string v0, "cgi_report_debug"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "ReportManager availableForCount = false"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 253
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public a(Landroid/content/Context;Ljava/lang/String;JJJILjava/lang/String;)V
a=0;//     .locals 13
a=0;// 
a=0;//     .prologue
a=0;//     .line 63
a=0;//     const-string v11, ""
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/String;);
a=0;//     const/4 v12, 0x0
a=0;// 
a=0;//     #v12=(Null);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/open/a/c;);
a=0;//     move-object v1, p1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     move-object v2, p2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     move-wide/from16 v3, p3
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     move-wide/from16 v5, p5
a=0;// 
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     move-wide/from16 v7, p7
a=0;// 
a=0;//     #v7=(LongLo);v8=(LongHi);
a=0;//     move/from16 v9, p9
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     move-object/from16 v10, p10
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual/range {v0 .. v12}, Lcom/tencent/open/a/c;->a(Landroid/content/Context;Ljava/lang/String;JJJILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 64
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public a(Landroid/content/Context;Ljava/lang/String;JJJILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 68
a=0;//     #v1=(One);
a=0;//     if-nez p12, :cond_0
a=0;// 
a=0;//     .line 69
a=0;//     const-string p12, "1000067"
a=0;// 
a=0;//     .line 72
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Lcom/tencent/open/a/c;->f:Lcom/tencent/open/a/b;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/open/a/b;);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 73
a=0;//     new-instance v0, Lcom/tencent/open/a/b;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/open/a/b;);
a=0;//     invoke-direct {v0, p1}, Lcom/tencent/open/a/b;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/open/a/b;);
a=0;//     iput-object v0, p0, Lcom/tencent/open/a/c;->f:Lcom/tencent/open/a/b;
a=0;// 
a=0;//     .line 77
a=0;//     :cond_1
a=0;//     invoke-direct {p0, p1, p9}, Lcom/tencent/open/a/c;->a(Landroid/content/Context;I)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-ne v0, v1, :cond_2
a=0;// 
a=0;//     .line 78
a=0;//     invoke-direct/range {p0 .. p11}, Lcom/tencent/open/a/c;->a(Landroid/content/Context;Ljava/lang/String;JJJILjava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 84
a=0;//     iget-boolean v0, p0, Lcom/tencent/open/a/c;->d:Z
a=0;// 
a=0;//     if-ne v0, v1, :cond_3
a=0;// 
a=0;//     .line 95
a=0;//     :cond_2
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 89
a=0;//     :cond_3
a=0;//     invoke-direct {p0, p1}, Lcom/tencent/open/a/c;->b(Landroid/content/Context;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-ne v0, v1, :cond_4
a=0;// 
a=0;//     .line 90
a=0;//     invoke-direct {p0, p1, p12}, Lcom/tencent/open/a/c;->a(Landroid/content/Context;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 92
a=0;//     :cond_4
a=0;//     invoke-direct {p0, p1}, Lcom/tencent/open/a/c;->c(Landroid/content/Context;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-ne v0, v1, :cond_2
a=0;// 
a=0;//     .line 93
a=0;//     invoke-direct {p0, p1, p12}, Lcom/tencent/open/a/c;->a(Landroid/content/Context;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
