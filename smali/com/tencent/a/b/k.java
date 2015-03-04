package com.tencent.a.b; class k { void a() { int a;
a=0;// .class public final Lcom/tencent/a/b/k;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ProGuard"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/tencent/a/b/k$a;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static a:I
a=0;// 
a=0;// .field private static b:I
a=0;// 
a=0;// .field private static c:I
a=0;// 
a=0;// .field private static d:I
a=0;// 
a=0;// .field private static e:I
a=0;// 
a=0;// .field private static f:I
a=0;// 
a=0;// .field private static g:Ljava/util/ArrayList;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Lcom/tencent/a/b/k$a;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private static h:J
a=0;// 
a=0;// .field private static i:J
a=0;// 
a=0;// .field private static j:J
a=0;// 
a=0;// .field private static k:J
a=0;// 
a=0;// .field private static l:J
a=0;// 
a=0;// .field private static m:J
a=0;// 
a=0;// .field private static n:J
a=0;// 
a=0;// .field private static o:J
a=0;// 
a=0;// .field private static p:J
a=0;// 
a=0;// .field private static q:J
a=0;// 
a=0;// .field private static r:I
a=0;// 
a=0;// .field private static s:I
a=0;// 
a=0;// .field private static t:I
a=0;// 
a=0;// .field private static u:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v5, 0x2710
a=0;// 
a=0;//     #v5=(PosShort);
a=0;//     const/16 v1, 0x4e20
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     const/16 v4, 0x61a8
a=0;// 
a=0;//     #v4=(PosShort);
a=0;//     const/16 v3, 0x3a98
a=0;// 
a=0;//     .line 19
a=0;//     #v3=(PosShort);
a=0;//     sput v5, Lcom/tencent/a/b/k;->a:I
a=0;// 
a=0;//     .line 21
a=0;//     sput v3, Lcom/tencent/a/b/k;->b:I
a=0;// 
a=0;//     .line 23
a=0;//     const/16 v0, 0x1388
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     sput v0, Lcom/tencent/a/b/k;->c:I
a=0;// 
a=0;//     .line 25
a=0;//     sput v1, Lcom/tencent/a/b/k;->d:I
a=0;// 
a=0;//     .line 27
a=0;//     sput v4, Lcom/tencent/a/b/k;->e:I
a=0;// 
a=0;//     .line 29
a=0;//     sput v3, Lcom/tencent/a/b/k;->f:I
a=0;// 
a=0;//     .line 31
a=0;//     const/16 v0, 0x2ee0
a=0;// 
a=0;//     sput v0, Lcom/tencent/a/b/k;->a:I
a=0;// 
a=0;//     sput v1, Lcom/tencent/a/b/k;->b:I
a=0;// 
a=0;//     const/16 v0, 0x1f40
a=0;// 
a=0;//     sput v0, Lcom/tencent/a/b/k;->c:I
a=0;// 
a=0;//     sput v1, Lcom/tencent/a/b/k;->d:I
a=0;// 
a=0;//     sput v4, Lcom/tencent/a/b/k;->e:I
a=0;// 
a=0;//     sput v3, Lcom/tencent/a/b/k;->f:I
a=0;// 
a=0;//     invoke-static {}, Lcom/tencent/a/b/l;->b()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     const-string v1, "connectivity"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/net/ConnectivityManager;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/net/NetworkInfo;->getType()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0}, Landroid/net/NetworkInfo;->isConnected()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     invoke-static {}, Lcom/tencent/a/b/l;->b()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     const-string v1, "phone"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/telephony/TelephonyManager;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getSubscriberId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, 0x3
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-le v1, v2, :cond_0
a=0;// 
a=0;//     const-string v1, "46000"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     const-string v1, "46002"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     sput v3, Lcom/tencent/a/b/k;->a:I
a=0;// 
a=0;//     sput v4, Lcom/tencent/a/b/k;->b:I
a=0;// 
a=0;//     sput v5, Lcom/tencent/a/b/k;->c:I
a=0;// 
a=0;//     sput v4, Lcom/tencent/a/b/k;->d:I
a=0;// 
a=0;//     const v0, 0x88b8
a=0;// 
a=0;//     #v0=(Char);
a=0;//     sput v0, Lcom/tencent/a/b/k;->e:I
a=0;// 
a=0;//     sput v3, Lcom/tencent/a/b/k;->f:I
a=0;// 
a=0;//     .line 16
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static a()I
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     const-wide/16 v4, 0x0
a=0;// 
a=0;//     .line 207
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     sget v0, Lcom/tencent/a/b/k;->a:I
a=0;// 
a=0;//     .line 208
a=0;//     #v0=(Integer);
a=0;//     sget-wide v1, Lcom/tencent/a/b/k;->j:J
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     cmp-long v1, v1, v4
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-lez v1, :cond_7
a=0;// 
a=0;//     sget-wide v1, Lcom/tencent/a/b/k;->k:J
a=0;// 
a=0;//     #v1=(LongLo);
a=0;//     cmp-long v1, v1, v4
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-lez v1, :cond_7
a=0;// 
a=0;//     .line 209
a=0;//     sget-wide v0, Lcom/tencent/a/b/k;->m:J
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     sget-wide v2, Lcom/tencent/a/b/k;->j:J
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->max(JJ)J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     sget-wide v2, Lcom/tencent/a/b/k;->k:J
a=0;// 
a=0;//     add-long/2addr v0, v2
a=0;// 
a=0;//     sget-wide v2, Lcom/tencent/a/b/k;->l:J
a=0;// 
a=0;//     sub-long/2addr v0, v2
a=0;// 
a=0;//     long-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     .line 212
a=0;//     :goto_0
a=0;//     #v1=(Integer);v2=(Conflicted);v3=(Conflicted);
a=0;//     invoke-static {}, Lcom/tencent/a/b/l;->b()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 213
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     const-string v2, "connectivity"
a=0;// 
a=0;//     .line 212
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/net/ConnectivityManager;
a=0;// 
a=0;//     .line 214
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 215
a=0;//     invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 216
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 217
a=0;//     invoke-virtual {v0}, Landroid/net/NetworkInfo;->isConnected()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_6
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/net/NetworkInfo;->isAvailable()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_6
a=0;// 
a=0;//     .line 218
a=0;//     sget v1, Lcom/tencent/a/b/k;->b:I
a=0;// 
a=0;//     .line 227
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     sget v0, Lcom/tencent/a/b/k;->u:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sget v2, Lcom/tencent/a/b/k;->c:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     mul-int/2addr v0, v2
a=0;// 
a=0;//     add-int/2addr v0, v1
a=0;// 
a=0;//     .line 228
a=0;//     sget v1, Lcom/tencent/a/b/k;->c:I
a=0;// 
a=0;//     if-gt v0, v1, :cond_1
a=0;// 
a=0;//     .line 229
a=0;//     sget v0, Lcom/tencent/a/b/k;->c:I
a=0;// 
a=0;//     .line 230
a=0;//     :cond_1
a=0;//     int-to-long v1, v0
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     sget-wide v3, Lcom/tencent/a/b/k;->k:J
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     cmp-long v1, v1, v3
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-gtz v1, :cond_2
a=0;// 
a=0;//     .line 231
a=0;//     sget-wide v0, Lcom/tencent/a/b/k;->k:J
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     sget v2, Lcom/tencent/a/b/k;->c:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     int-to-long v2, v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     add-long/2addr v0, v2
a=0;// 
a=0;//     long-to-int v0, v0
a=0;// 
a=0;//     .line 232
a=0;//     :cond_2
a=0;//     #v0=(Integer);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     sget v1, Lcom/tencent/a/b/k;->b:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lt v0, v1, :cond_3
a=0;// 
a=0;//     .line 233
a=0;//     sget v0, Lcom/tencent/a/b/k;->b:I
a=0;// 
a=0;//     .line 235
a=0;//     :cond_3
a=0;//     invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Thread;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Thread;->getId()J
a=0;// 
a=0;//     move-result-wide v1
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     invoke-static {v1, v2}, Lcom/tencent/a/b/k;->b(J)Lcom/tencent/a/b/k$a;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 236
a=0;//     #v1=(Reference,Lcom/tencent/a/b/k$a;);
a=0;//     if-nez v1, :cond_4
a=0;// 
a=0;//     .line 237
a=0;//     invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/Thread;->getId()J
a=0;// 
a=0;//     move-result-wide v1
a=0;// 
a=0;//     #v1=(LongLo);
a=0;//     invoke-static {v1, v2}, Lcom/tencent/a/b/k;->a(J)Lcom/tencent/a/b/k$a;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 238
a=0;//     :cond_4
a=0;//     #v1=(Reference,Lcom/tencent/a/b/k$a;);
a=0;//     iget v2, v1, Lcom/tencent/a/b/k$a;->g:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     sget v3, Lcom/tencent/a/b/k;->c:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     add-int/2addr v2, v3
a=0;// 
a=0;//     if-ge v0, v2, :cond_5
a=0;// 
a=0;//     .line 239
a=0;//     iget v0, v1, Lcom/tencent/a/b/k$a;->g:I
a=0;// 
a=0;//     sget v2, Lcom/tencent/a/b/k;->c:I
a=0;// 
a=0;//     add-int/2addr v0, v2
a=0;// 
a=0;//     .line 240
a=0;//     :cond_5
a=0;//     iput v0, v1, Lcom/tencent/a/b/k$a;->g:I
a=0;// 
a=0;//     .line 242
a=0;//     return v0
a=0;// 
a=0;//     .line 220
a=0;//     :cond_6
a=0;//     #v0=(Conflicted);v1=(Integer);v2=(Boolean);v3=(Conflicted);v4=(LongLo);
a=0;//     sget-wide v2, Lcom/tencent/a/b/k;->k:J
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     cmp-long v0, v2, v4
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-lez v0, :cond_0
a=0;// 
a=0;//     sget-wide v2, Lcom/tencent/a/b/k;->k:J
a=0;// 
a=0;//     sget v0, Lcom/tencent/a/b/k;->c:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-long v4, v0
a=0;// 
a=0;//     cmp-long v0, v2, v4
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-gez v0, :cond_0
a=0;// 
a=0;//     .line 221
a=0;//     sget v1, Lcom/tencent/a/b/k;->c:I
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_7
a=0;//     #v0=(Integer);v1=(Byte);v2=(LongHi);v3=(Uninit);
a=0;//     move v1, v0
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static a(J)Lcom/tencent/a/b/k$a;
a=0;//     .locals 13
a=0;// 
a=0;//     .prologue
a=0;//     const-wide/16 v10, 0x0
a=0;// 
a=0;//     #v10=(LongLo);v11=(LongHi);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 576
a=0;//     #v0=(Null);
a=0;//     sget-object v1, Lcom/tencent/a/b/k;->g:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 577
a=0;//     new-instance v1, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     sput-object v1, Lcom/tencent/a/b/k;->g:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 579
a=0;//     :cond_0
a=0;//     sget-object v4, Lcom/tencent/a/b/k;->g:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/ArrayList;);
a=0;//     monitor-enter v4
a=0;// 
a=0;//     .line 580
a=0;//     :try_start_0
a=0;//     sget-object v1, Lcom/tencent/a/b/k;->g:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/16 v2, 0x14
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-le v1, v2, :cond_3
a=0;// 
a=0;//     .line 582
a=0;//     sget-object v1, Lcom/tencent/a/b/k;->g:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v1}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     move v3, v0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     move v1, v0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     move v2, v0
a=0;// 
a=0;//     .line 585
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Boolean);v2=(Integer);v3=(Integer);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v12=(Conflicted);
a=0;//     div-int/lit8 v0, v5, 0x2
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lt v3, v0, :cond_4
a=0;// 
a=0;//     .line 594
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     .line 595
a=0;//     sget-object v0, Lcom/tencent/a/b/k;->g:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     const-wide/16 v0, 0x0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     sput-wide v0, Lcom/tencent/a/b/k;->h:J
a=0;// 
a=0;//     .line 596
a=0;//     sget-object v0, Lcom/tencent/a/b/k;->g:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     const-wide/16 v0, 0x0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     sput-wide v0, Lcom/tencent/a/b/k;->i:J
a=0;// 
a=0;//     .line 597
a=0;//     sget-object v0, Lcom/tencent/a/b/k;->g:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/tencent/a/b/k$a;
a=0;// 
a=0;//     iget-wide v0, v0, Lcom/tencent/a/b/k$a;->c:J
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     sput-wide v0, Lcom/tencent/a/b/k;->k:J
a=0;// 
a=0;//     .line 598
a=0;//     sget-object v0, Lcom/tencent/a/b/k;->g:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/tencent/a/b/k$a;
a=0;// 
a=0;//     iget-wide v0, v0, Lcom/tencent/a/b/k$a;->c:J
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     sput-wide v0, Lcom/tencent/a/b/k;->l:J
a=0;// 
a=0;//     .line 599
a=0;//     sget-object v0, Lcom/tencent/a/b/k;->g:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/tencent/a/b/k$a;
a=0;// 
a=0;//     iget-wide v0, v0, Lcom/tencent/a/b/k$a;->d:J
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     sput-wide v0, Lcom/tencent/a/b/k;->o:J
a=0;// 
a=0;//     .line 600
a=0;//     sget-object v0, Lcom/tencent/a/b/k;->g:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/tencent/a/b/k$a;
a=0;// 
a=0;//     iget-wide v0, v0, Lcom/tencent/a/b/k$a;->d:J
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     sput-wide v0, Lcom/tencent/a/b/k;->p:J
a=0;// 
a=0;//     .line 601
a=0;//     sget-object v0, Lcom/tencent/a/b/k;->g:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/tencent/a/b/k$a;
a=0;// 
a=0;//     iget-wide v0, v0, Lcom/tencent/a/b/k$a;->f:J
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     cmp-long v0, v0, v10
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-lez v0, :cond_1
a=0;// 
a=0;//     .line 602
a=0;//     sget-object v0, Lcom/tencent/a/b/k;->g:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/tencent/a/b/k$a;
a=0;// 
a=0;//     iget v0, v0, Lcom/tencent/a/b/k$a;->e:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     mul-int/lit16 v0, v0, 0x3e8
a=0;// 
a=0;//     int-to-long v1, v0
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     sget-object v0, Lcom/tencent/a/b/k;->g:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/tencent/a/b/k$a;
a=0;// 
a=0;//     iget-wide v5, v0, Lcom/tencent/a/b/k$a;->f:J
a=0;// 
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     div-long v0, v1, v5
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     long-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sput v0, Lcom/tencent/a/b/k;->r:I
a=0;// 
a=0;//     .line 603
a=0;//     :cond_1
a=0;//     #v2=(Conflicted);v3=(Integer);v5=(Conflicted);v6=(Conflicted);
a=0;//     sget v0, Lcom/tencent/a/b/k;->r:I
a=0;// 
a=0;//     sput v0, Lcom/tencent/a/b/k;->s:I
a=0;// 
a=0;//     .line 604
a=0;//     sget-object v0, Lcom/tencent/a/b/k;->g:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :cond_2
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Reference,Ljava/util/Iterator;);v3=(Conflicted);
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_7
a=0;// 
a=0;//     .line 628
a=0;//     :cond_3
a=0;//     #v0=(Integer);v1=(Conflicted);
a=0;//     new-instance v0, Lcom/tencent/a/b/k$a;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/a/b/k$a;);
a=0;//     invoke-direct {v0}, Lcom/tencent/a/b/k$a;-><init>()V
a=0;// 
a=0;//     .line 629
a=0;//     #v0=(Reference,Lcom/tencent/a/b/k$a;);
a=0;//     iput-wide p0, v0, Lcom/tencent/a/b/k$a;->a:J
a=0;// 
a=0;//     .line 630
a=0;//     sget-object v1, Lcom/tencent/a/b/k;->g:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 631
a=0;//     monitor-exit v4
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     .line 586
a=0;//     :cond_4
a=0;//     #v0=(Integer);v1=(Boolean);v2=(Integer);v3=(Integer);v5=(Integer);
a=0;//     sget-object v0, Lcom/tencent/a/b/k;->g:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/tencent/a/b/k$a;
a=0;// 
a=0;//     iget-wide v6, v0, Lcom/tencent/a/b/k$a;->f:J
a=0;// 
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     cmp-long v0, v6, v10
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-gtz v0, :cond_5
a=0;// 
a=0;//     .line 587
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v6
a=0;// 
a=0;//     sget-object v0, Lcom/tencent/a/b/k;->g:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/tencent/a/b/k$a;
a=0;// 
a=0;//     iget-wide v8, v0, Lcom/tencent/a/b/k$a;->b:J
a=0;// 
a=0;//     #v8=(LongLo);v9=(LongHi);
a=0;//     sub-long/2addr v6, v8
a=0;// 
a=0;//     const-wide/32 v8, 0x927c0
a=0;// 
a=0;//     cmp-long v0, v6, v8
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-lez v0, :cond_6
a=0;// 
a=0;//     .line 589
a=0;//     :cond_5
a=0;//     #v8=(Conflicted);v9=(Conflicted);
a=0;//     sget-object v0, Lcom/tencent/a/b/k;->g:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;
a=0;// 
a=0;//     .line 590
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     move v1, v2
a=0;// 
a=0;//     .line 585
a=0;//     :goto_2
a=0;//     #v0=(Boolean);v1=(Integer);
a=0;//     add-int/lit8 v2, v3, 0x1
a=0;// 
a=0;//     move v3, v2
a=0;// 
a=0;//     move v2, v1
a=0;// 
a=0;//     move v1, v0
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 592
a=0;//     :cond_6
a=0;//     #v0=(Byte);v8=(LongLo);v9=(LongHi);
a=0;//     add-int/lit8 v0, v2, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v12, v1
a=0;// 
a=0;//     #v12=(Boolean);
a=0;//     move v1, v0
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move v0, v12
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 604
a=0;//     :cond_7
a=0;//     #v1=(Reference,Ljava/util/Iterator;);v2=(Conflicted);v3=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v12=(Conflicted);
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/tencent/a/b/k$a;
a=0;// 
a=0;//     .line 605
a=0;//     sget-wide v2, Lcom/tencent/a/b/k;->h:J
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     cmp-long v2, v10, v2
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-lez v2, :cond_8
a=0;// 
a=0;//     .line 606
a=0;//     const-wide/16 v2, 0x0
a=0;// 
a=0;//     #v2=(LongLo);
a=0;//     sput-wide v2, Lcom/tencent/a/b/k;->h:J
a=0;// 
a=0;//     .line 607
a=0;//     :cond_8
a=0;//     #v2=(Conflicted);
a=0;//     sget-wide v2, Lcom/tencent/a/b/k;->i:J
a=0;// 
a=0;//     #v2=(LongLo);
a=0;//     cmp-long v2, v10, v2
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-gez v2, :cond_9
a=0;// 
a=0;//     .line 608
a=0;//     const-wide/16 v2, 0x0
a=0;// 
a=0;//     #v2=(LongLo);
a=0;//     sput-wide v2, Lcom/tencent/a/b/k;->i:J
a=0;// 
a=0;//     .line 609
a=0;//     :cond_9
a=0;//     #v2=(Conflicted);
a=0;//     iget-wide v2, v0, Lcom/tencent/a/b/k$a;->c:J
a=0;// 
a=0;//     #v2=(LongLo);
a=0;//     sget-wide v5, Lcom/tencent/a/b/k;->k:J
a=0;// 
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     cmp-long v2, v2, v5
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-lez v2, :cond_a
a=0;// 
a=0;//     .line 610
a=0;//     iget-wide v2, v0, Lcom/tencent/a/b/k$a;->c:J
a=0;// 
a=0;//     #v2=(LongLo);
a=0;//     sput-wide v2, Lcom/tencent/a/b/k;->k:J
a=0;// 
a=0;//     .line 611
a=0;//     :cond_a
a=0;//     #v2=(Conflicted);
a=0;//     iget-wide v2, v0, Lcom/tencent/a/b/k$a;->c:J
a=0;// 
a=0;//     #v2=(LongLo);
a=0;//     sget-wide v5, Lcom/tencent/a/b/k;->l:J
a=0;// 
a=0;//     cmp-long v2, v2, v5
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-gez v2, :cond_b
a=0;// 
a=0;//     .line 612
a=0;//     iget-wide v2, v0, Lcom/tencent/a/b/k$a;->c:J
a=0;// 
a=0;//     #v2=(LongLo);
a=0;//     sput-wide v2, Lcom/tencent/a/b/k;->l:J
a=0;// 
a=0;//     .line 613
a=0;//     :cond_b
a=0;//     #v2=(Conflicted);
a=0;//     iget-wide v2, v0, Lcom/tencent/a/b/k$a;->d:J
a=0;// 
a=0;//     #v2=(LongLo);
a=0;//     sget-wide v5, Lcom/tencent/a/b/k;->o:J
a=0;// 
a=0;//     cmp-long v2, v2, v5
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-lez v2, :cond_c
a=0;// 
a=0;//     .line 614
a=0;//     iget-wide v2, v0, Lcom/tencent/a/b/k$a;->d:J
a=0;// 
a=0;//     #v2=(LongLo);
a=0;//     sput-wide v2, Lcom/tencent/a/b/k;->o:J
a=0;// 
a=0;//     .line 615
a=0;//     :cond_c
a=0;//     #v2=(Conflicted);
a=0;//     iget-wide v2, v0, Lcom/tencent/a/b/k$a;->d:J
a=0;// 
a=0;//     #v2=(LongLo);
a=0;//     sget-wide v5, Lcom/tencent/a/b/k;->p:J
a=0;// 
a=0;//     cmp-long v2, v2, v5
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-gez v2, :cond_d
a=0;// 
a=0;//     .line 616
a=0;//     iget-wide v2, v0, Lcom/tencent/a/b/k$a;->d:J
a=0;// 
a=0;//     #v2=(LongLo);
a=0;//     sput-wide v2, Lcom/tencent/a/b/k;->p:J
a=0;// 
a=0;//     .line 617
a=0;//     :cond_d
a=0;//     #v2=(Conflicted);
a=0;//     iget-wide v2, v0, Lcom/tencent/a/b/k$a;->f:J
a=0;// 
a=0;//     #v2=(LongLo);
a=0;//     cmp-long v2, v2, v10
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-lez v2, :cond_2
a=0;// 
a=0;//     .line 618
a=0;//     iget v2, v0, Lcom/tencent/a/b/k$a;->e:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     mul-int/lit16 v2, v2, 0x3e8
a=0;// 
a=0;//     int-to-long v2, v2
a=0;// 
a=0;//     #v2=(LongLo);
a=0;//     iget-wide v5, v0, Lcom/tencent/a/b/k$a;->f:J
a=0;// 
a=0;//     div-long/2addr v2, v5
a=0;// 
a=0;//     long-to-int v0, v2
a=0;// 
a=0;//     .line 619
a=0;//     #v0=(Integer);
a=0;//     sget v2, Lcom/tencent/a/b/k;->r:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-le v0, v2, :cond_e
a=0;// 
a=0;//     .line 620
a=0;//     sput v0, Lcom/tencent/a/b/k;->r:I
a=0;// 
a=0;//     .line 621
a=0;//     :cond_e
a=0;//     sget v2, Lcom/tencent/a/b/k;->s:I
a=0;// 
a=0;//     if-ge v0, v2, :cond_2
a=0;// 
a=0;//     .line 622
a=0;//     sput v0, Lcom/tencent/a/b/k;->s:I
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 579
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v4
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public static a(I)V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 542
a=0;//     invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Thread;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Thread;->getId()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     invoke-static {v0, v1}, Lcom/tencent/a/b/k;->b(J)Lcom/tencent/a/b/k$a;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 543
a=0;//     #v2=(Reference,Lcom/tencent/a/b/k$a;);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     .line 570
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 545
a=0;//     :cond_0
a=0;//     #v0=(LongLo);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     iget-wide v3, v2, Lcom/tencent/a/b/k$a;->b:J
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     sub-long/2addr v0, v3
a=0;// 
a=0;//     iput-wide v0, v2, Lcom/tencent/a/b/k$a;->f:J
a=0;// 
a=0;//     .line 546
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     iput-wide v0, v2, Lcom/tencent/a/b/k$a;->b:J
a=0;// 
a=0;//     .line 547
a=0;//     iput p0, v2, Lcom/tencent/a/b/k$a;->e:I
a=0;// 
a=0;//     .line 548
a=0;//     iget-wide v0, v2, Lcom/tencent/a/b/k$a;->f:J
a=0;// 
a=0;//     const-wide/16 v3, 0x0
a=0;// 
a=0;//     cmp-long v0, v0, v3
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-nez v0, :cond_3
a=0;// 
a=0;//     const-wide/16 v0, 0x1
a=0;// 
a=0;//     .line 549
a=0;//     :goto_1
a=0;//     #v0=(LongLo);
a=0;//     mul-int/lit16 v3, p0, 0x3e8
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     int-to-long v3, v3
a=0;// 
a=0;//     #v3=(LongLo);
a=0;//     div-long v0, v3, v0
a=0;// 
a=0;//     long-to-int v0, v0
a=0;// 
a=0;//     .line 550
a=0;//     #v0=(Integer);
a=0;//     sput v0, Lcom/tencent/a/b/k;->t:I
a=0;// 
a=0;//     sget v1, Lcom/tencent/a/b/k;->r:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-le v0, v1, :cond_4
a=0;// 
a=0;//     sget v0, Lcom/tencent/a/b/k;->t:I
a=0;// 
a=0;//     :goto_2
a=0;//     sput v0, Lcom/tencent/a/b/k;->r:I
a=0;// 
a=0;//     .line 551
a=0;//     sget v0, Lcom/tencent/a/b/k;->t:I
a=0;// 
a=0;//     sget v1, Lcom/tencent/a/b/k;->s:I
a=0;// 
a=0;//     if-ge v0, v1, :cond_5
a=0;// 
a=0;//     sget v0, Lcom/tencent/a/b/k;->t:I
a=0;// 
a=0;//     :goto_3
a=0;//     sput v0, Lcom/tencent/a/b/k;->s:I
a=0;// 
a=0;//     .line 553
a=0;//     sget-object v0, Lcom/tencent/a/b/k;->g:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 556
a=0;//     sget-object v1, Lcom/tencent/a/b/k;->g:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     .line 557
a=0;//     :try_start_0
a=0;//     sget-object v0, Lcom/tencent/a/b/k;->g:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     :goto_4
a=0;//     #v3=(Reference,Ljava/util/Iterator;);v4=(Conflicted);v5=(Conflicted);
a=0;//     invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_7
a=0;// 
a=0;//     .line 556
a=0;//     monitor-exit v1
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 562
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);
a=0;//     sget v0, Lcom/tencent/a/b/k;->u:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_2
a=0;// 
a=0;//     iget-wide v0, v2, Lcom/tencent/a/b/k$a;->c:J
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     sget v3, Lcom/tencent/a/b/k;->c:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     int-to-long v3, v3
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     cmp-long v0, v0, v3
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-gez v0, :cond_2
a=0;// 
a=0;//     .line 566
a=0;//     iget-wide v0, v2, Lcom/tencent/a/b/k$a;->d:J
a=0;// 
a=0;//     #v0=(LongLo);
a=0;//     sget v3, Lcom/tencent/a/b/k;->f:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     int-to-long v3, v3
a=0;// 
a=0;//     #v3=(LongLo);
a=0;//     cmp-long v0, v0, v3
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-gez v0, :cond_2
a=0;// 
a=0;//     .line 567
a=0;//     sget v0, Lcom/tencent/a/b/k;->u:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-int/lit8 v0, v0, -0x1
a=0;// 
a=0;//     sput v0, Lcom/tencent/a/b/k;->u:I
a=0;// 
a=0;//     .line 568
a=0;//     :cond_2
a=0;//     #v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     iget-wide v0, v2, Lcom/tencent/a/b/k$a;->c:J
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     long-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, v2, Lcom/tencent/a/b/k$a;->g:I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 548
a=0;//     :cond_3
a=0;//     #v0=(Byte);v3=(LongLo);v4=(LongHi);v5=(Uninit);
a=0;//     iget-wide v0, v2, Lcom/tencent/a/b/k$a;->f:J
a=0;// 
a=0;//     #v0=(LongLo);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 550
a=0;//     :cond_4
a=0;//     #v0=(Integer);v1=(Integer);
a=0;//     sget v0, Lcom/tencent/a/b/k;->r:I
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 552
a=0;//     :cond_5
a=0;//     sget v0, Lcom/tencent/a/b/k;->s:I
a=0;// 
a=0;//     if-nez v0, :cond_6
a=0;// 
a=0;//     sget v0, Lcom/tencent/a/b/k;->t:I
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     :cond_6
a=0;//     sget v0, Lcom/tencent/a/b/k;->s:I
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 557
a=0;//     :cond_7
a=0;//     :try_start_1
a=0;//     #v0=(Boolean);v1=(Reference,Ljava/util/ArrayList;);v3=(Reference,Ljava/util/Iterator;);v4=(Conflicted);v5=(Conflicted);
a=0;//     invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/tencent/a/b/k$a;
a=0;// 
a=0;//     .line 558
a=0;//     iget v4, v0, Lcom/tencent/a/b/k$a;->e:I
a=0;// 
a=0;//     .line 559
a=0;//     #v4=(Integer);
a=0;//     iget-wide v4, v0, Lcom/tencent/a/b/k$a;->f:J
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 556
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v1
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public static a(Ljava/net/HttpURLConnection;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 463
a=0;//     invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Thread;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Thread;->getId()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     invoke-static {v0, v1}, Lcom/tencent/a/b/k;->b(J)Lcom/tencent/a/b/k$a;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 464
a=0;//     #v0=(Reference,Lcom/tencent/a/b/k$a;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 465
a=0;//     invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Thread;->getId()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);
a=0;//     invoke-static {v0, v1}, Lcom/tencent/a/b/k;->a(J)Lcom/tencent/a/b/k$a;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 466
a=0;//     :cond_0
a=0;//     #v0=(Reference,Lcom/tencent/a/b/k$a;);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 470
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 468
a=0;//     :cond_1
a=0;//     #v1=(LongHi);v2=(Uninit);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v1
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     iput-wide v1, v0, Lcom/tencent/a/b/k$a;->b:J
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static a(Z)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 422
a=0;//     if-nez p0, :cond_0
a=0;// 
a=0;//     .line 423
a=0;//     sget v0, Lcom/tencent/a/b/k;->u:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     sput v0, Lcom/tencent/a/b/k;->u:I
a=0;// 
a=0;//     .line 424
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Thread;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Thread;->getId()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     invoke-static {v0, v1}, Lcom/tencent/a/b/k;->c(J)Lcom/tencent/a/b/k$a;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 425
a=0;//     #v0=(Reference,Lcom/tencent/a/b/k$a;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 426
a=0;//     iget-wide v0, v0, Lcom/tencent/a/b/k$a;->b:J
a=0;// 
a=0;//     .line 429
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static b()I
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     const-wide/16 v4, 0x0
a=0;// 
a=0;//     .line 246
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     sget v0, Lcom/tencent/a/b/k;->d:I
a=0;// 
a=0;//     .line 247
a=0;//     #v0=(Integer);
a=0;//     sget-wide v1, Lcom/tencent/a/b/k;->n:J
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     cmp-long v1, v1, v4
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-lez v1, :cond_8
a=0;// 
a=0;//     sget-wide v1, Lcom/tencent/a/b/k;->o:J
a=0;// 
a=0;//     #v1=(LongLo);
a=0;//     cmp-long v1, v1, v4
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-lez v1, :cond_8
a=0;// 
a=0;//     .line 248
a=0;//     sget-wide v0, Lcom/tencent/a/b/k;->q:J
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     sget-wide v2, Lcom/tencent/a/b/k;->n:J
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->max(JJ)J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     sget-wide v2, Lcom/tencent/a/b/k;->o:J
a=0;// 
a=0;//     add-long/2addr v0, v2
a=0;// 
a=0;//     sget-wide v2, Lcom/tencent/a/b/k;->p:J
a=0;// 
a=0;//     sub-long/2addr v0, v2
a=0;// 
a=0;//     long-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     .line 251
a=0;//     :goto_0
a=0;//     #v1=(Integer);v2=(Conflicted);v3=(Conflicted);
a=0;//     invoke-static {}, Lcom/tencent/a/b/l;->b()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 252
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     const-string v2, "connectivity"
a=0;// 
a=0;//     .line 251
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/net/ConnectivityManager;
a=0;// 
a=0;//     .line 253
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 254
a=0;//     invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 255
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 256
a=0;//     invoke-virtual {v0}, Landroid/net/NetworkInfo;->isConnected()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_7
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/net/NetworkInfo;->isAvailable()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_7
a=0;// 
a=0;//     .line 257
a=0;//     sget v1, Lcom/tencent/a/b/k;->e:I
a=0;// 
a=0;//     .line 266
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     sget v0, Lcom/tencent/a/b/k;->u:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sget v2, Lcom/tencent/a/b/k;->c:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     mul-int/2addr v0, v2
a=0;// 
a=0;//     add-int/2addr v0, v1
a=0;// 
a=0;//     .line 267
a=0;//     sget v1, Lcom/tencent/a/b/k;->f:I
a=0;// 
a=0;//     if-gt v0, v1, :cond_1
a=0;// 
a=0;//     .line 268
a=0;//     sget v0, Lcom/tencent/a/b/k;->f:I
a=0;// 
a=0;//     .line 269
a=0;//     :cond_1
a=0;//     int-to-long v1, v0
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     sget-wide v3, Lcom/tencent/a/b/k;->o:J
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     cmp-long v1, v1, v3
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-gtz v1, :cond_2
a=0;// 
a=0;//     .line 270
a=0;//     sget-wide v0, Lcom/tencent/a/b/k;->o:J
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     sget v2, Lcom/tencent/a/b/k;->f:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     int-to-long v2, v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     add-long/2addr v0, v2
a=0;// 
a=0;//     long-to-int v0, v0
a=0;// 
a=0;//     .line 271
a=0;//     :cond_2
a=0;//     #v0=(Integer);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     sget v1, Lcom/tencent/a/b/k;->e:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lt v0, v1, :cond_3
a=0;// 
a=0;//     .line 272
a=0;//     sget v0, Lcom/tencent/a/b/k;->e:I
a=0;// 
a=0;//     .line 274
a=0;//     :cond_3
a=0;//     invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Thread;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Thread;->getId()J
a=0;// 
a=0;//     move-result-wide v1
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     invoke-static {v1, v2}, Lcom/tencent/a/b/k;->b(J)Lcom/tencent/a/b/k$a;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 275
a=0;//     #v1=(Reference,Lcom/tencent/a/b/k$a;);
a=0;//     if-eqz v1, :cond_6
a=0;// 
a=0;//     .line 276
a=0;//     iget v2, v1, Lcom/tencent/a/b/k$a;->h:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     sget v3, Lcom/tencent/a/b/k;->f:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     add-int/2addr v2, v3
a=0;// 
a=0;//     if-ge v0, v2, :cond_4
a=0;// 
a=0;//     .line 277
a=0;//     iget v0, v1, Lcom/tencent/a/b/k$a;->h:I
a=0;// 
a=0;//     sget v2, Lcom/tencent/a/b/k;->f:I
a=0;// 
a=0;//     add-int/2addr v0, v2
a=0;// 
a=0;//     .line 278
a=0;//     :cond_4
a=0;//     iget v2, v1, Lcom/tencent/a/b/k$a;->g:I
a=0;// 
a=0;//     sget v3, Lcom/tencent/a/b/k;->f:I
a=0;// 
a=0;//     add-int/2addr v2, v3
a=0;// 
a=0;//     if-ge v0, v2, :cond_5
a=0;// 
a=0;//     .line 279
a=0;//     iget v0, v1, Lcom/tencent/a/b/k$a;->g:I
a=0;// 
a=0;//     sget v2, Lcom/tencent/a/b/k;->f:I
a=0;// 
a=0;//     add-int/2addr v0, v2
a=0;// 
a=0;//     .line 280
a=0;//     :cond_5
a=0;//     iput v0, v1, Lcom/tencent/a/b/k$a;->h:I
a=0;// 
a=0;//     .line 283
a=0;//     :cond_6
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 259
a=0;//     :cond_7
a=0;//     #v0=(Conflicted);v1=(Integer);v2=(Boolean);v4=(LongLo);
a=0;//     sget-wide v2, Lcom/tencent/a/b/k;->o:J
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     cmp-long v0, v2, v4
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-lez v0, :cond_0
a=0;// 
a=0;//     sget-wide v2, Lcom/tencent/a/b/k;->o:J
a=0;// 
a=0;//     sget v0, Lcom/tencent/a/b/k;->f:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-long v4, v0
a=0;// 
a=0;//     cmp-long v0, v2, v4
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-gez v0, :cond_0
a=0;// 
a=0;//     .line 260
a=0;//     sget v1, Lcom/tencent/a/b/k;->f:I
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_8
a=0;//     #v0=(Integer);v1=(Byte);v2=(LongHi);v3=(Uninit);
a=0;//     move v1, v0
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static b(J)Lcom/tencent/a/b/k$a;
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 636
a=0;//     #v1=(Null);
a=0;//     sget-object v0, Lcom/tencent/a/b/k;->g:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .line 645
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 639
a=0;//     :cond_0
a=0;//     #v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     sget-object v2, Lcom/tencent/a/b/k;->g:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     monitor-enter v2
a=0;// 
a=0;//     .line 640
a=0;//     :try_start_0
a=0;//     sget-object v0, Lcom/tencent/a/b/k;->g:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     :cond_1
a=0;//     #v3=(Reference,Ljava/util/Iterator;);v4=(Conflicted);v5=(Conflicted);
a=0;//     invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     .line 639
a=0;//     monitor-exit v2
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .line 645
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 640
a=0;//     :cond_2
a=0;//     #v0=(Boolean);
a=0;//     invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/tencent/a/b/k$a;
a=0;// 
a=0;//     .line 641
a=0;//     iget-wide v4, v0, Lcom/tencent/a/b/k$a;->a:J
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     cmp-long v4, v4, p0
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     if-nez v4, :cond_1
a=0;// 
a=0;//     .line 642
a=0;//     monitor-exit v2
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 639
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v2
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method private static c(J)Lcom/tencent/a/b/k$a;
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 649
a=0;//     sget-object v0, Lcom/tencent/a/b/k;->g:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 650
a=0;//     sget-object v2, Lcom/tencent/a/b/k;->g:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     monitor-enter v2
a=0;// 
a=0;//     .line 651
a=0;//     :try_start_0
a=0;//     sget-object v0, Lcom/tencent/a/b/k;->g:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 652
a=0;//     #v0=(Integer);
a=0;//     add-int/lit8 v0, v0, -0x1
a=0;// 
a=0;//     move v1, v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Integer);v3=(Conflicted);v4=(Conflicted);
a=0;//     if-gez v1, :cond_1
a=0;// 
a=0;//     .line 650
a=0;//     monitor-exit v2
a=0;// 
a=0;//     .line 659
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Reference,Lcom/tencent/a/b/k$a;);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 653
a=0;//     :cond_1
a=0;//     :try_start_1
a=0;//     #v0=(Integer);v1=(Integer);v2=(Reference,Ljava/util/ArrayList;);
a=0;//     sget-object v0, Lcom/tencent/a/b/k;->g:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/tencent/a/b/k$a;
a=0;// 
a=0;//     iget-wide v3, v0, Lcom/tencent/a/b/k$a;->a:J
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     cmp-long v0, v3, p0
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     .line 654
a=0;//     sget-object v0, Lcom/tencent/a/b/k;->g:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/tencent/a/b/k$a;
a=0;// 
a=0;//     monitor-exit v2
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 650
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v2
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     .line 652
a=0;//     :cond_2
a=0;//     #v0=(Byte);v1=(Integer);v3=(LongLo);v4=(LongHi);
a=0;//     add-int/lit8 v0, v1, -0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static c()V
a=0;//     .locals 10
a=0;// 
a=0;//     .prologue
a=0;//     const-wide/16 v8, 0x0
a=0;// 
a=0;//     .line 473
a=0;//     #v8=(LongLo);v9=(LongHi);
a=0;//     invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Thread;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Thread;->getId()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     invoke-static {v0, v1}, Lcom/tencent/a/b/k;->b(J)Lcom/tencent/a/b/k$a;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 474
a=0;//     #v2=(Reference,Lcom/tencent/a/b/k$a;);
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     .line 495
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 476
a=0;//     :cond_1
a=0;//     #v0=(LongLo);v1=(LongHi);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     iget-wide v3, v2, Lcom/tencent/a/b/k$a;->b:J
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     sub-long/2addr v0, v3
a=0;// 
a=0;//     iput-wide v0, v2, Lcom/tencent/a/b/k$a;->c:J
a=0;// 
a=0;//     .line 477
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     iput-wide v0, v2, Lcom/tencent/a/b/k$a;->b:J
a=0;// 
a=0;//     .line 478
a=0;//     iget-wide v0, v2, Lcom/tencent/a/b/k$a;->c:J
a=0;// 
a=0;//     sput-wide v0, Lcom/tencent/a/b/k;->m:J
a=0;// 
a=0;//     .line 479
a=0;//     iget-wide v0, v2, Lcom/tencent/a/b/k$a;->c:J
a=0;// 
a=0;//     sget-wide v3, Lcom/tencent/a/b/k;->k:J
a=0;// 
a=0;//     cmp-long v0, v0, v3
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-lez v0, :cond_4
a=0;// 
a=0;//     iget-wide v0, v2, Lcom/tencent/a/b/k$a;->c:J
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(LongLo);
a=0;//     sput-wide v0, Lcom/tencent/a/b/k;->k:J
a=0;// 
a=0;//     .line 480
a=0;//     iget-wide v0, v2, Lcom/tencent/a/b/k$a;->c:J
a=0;// 
a=0;//     sget-wide v3, Lcom/tencent/a/b/k;->l:J
a=0;// 
a=0;//     cmp-long v0, v0, v3
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-gez v0, :cond_5
a=0;// 
a=0;//     iget-wide v0, v2, Lcom/tencent/a/b/k$a;->c:J
a=0;// 
a=0;//     :goto_2
a=0;//     #v0=(LongLo);
a=0;//     sput-wide v0, Lcom/tencent/a/b/k;->l:J
a=0;// 
a=0;//     .line 482
a=0;//     sget-object v0, Lcom/tencent/a/b/k;->g:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 483
a=0;//     sget-object v2, Lcom/tencent/a/b/k;->g:Ljava/util/ArrayList;
a=0;// 
a=0;//     monitor-enter v2
a=0;// 
a=0;//     .line 484
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 485
a=0;//     :try_start_0
a=0;//     #v0=(Null);
a=0;//     sget-object v1, Lcom/tencent/a/b/k;->g:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/Iterator;);
a=0;//     move v1, v0
a=0;// 
a=0;//     :cond_2
a=0;//     :goto_3
a=0;//     #v0=(Conflicted);v1=(Integer);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_7
a=0;// 
a=0;//     .line 491
a=0;//     if-lez v1, :cond_3
a=0;// 
a=0;//     .line 492
a=0;//     sget-wide v3, Lcom/tencent/a/b/k;->j:J
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     int-to-long v0, v1
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     div-long v0, v3, v0
a=0;// 
a=0;//     sput-wide v0, Lcom/tencent/a/b/k;->j:J
a=0;// 
a=0;//     .line 483
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     monitor-exit v2
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catchall_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v2
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     .line 479
a=0;//     :cond_4
a=0;//     #v0=(Byte);v1=(LongHi);v3=(LongLo);v4=(LongHi);v5=(Uninit);v6=(Uninit);v7=(Uninit);
a=0;//     sget-wide v0, Lcom/tencent/a/b/k;->k:J
a=0;// 
a=0;//     #v0=(LongLo);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 481
a=0;//     :cond_5
a=0;//     #v0=(Byte);
a=0;//     sget-wide v0, Lcom/tencent/a/b/k;->l:J
a=0;// 
a=0;//     #v0=(LongLo);
a=0;//     cmp-long v0, v0, v8
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-nez v0, :cond_6
a=0;// 
a=0;//     iget-wide v0, v2, Lcom/tencent/a/b/k$a;->c:J
a=0;// 
a=0;//     #v0=(LongLo);
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_6
a=0;//     #v0=(Byte);
a=0;//     sget-wide v0, Lcom/tencent/a/b/k;->l:J
a=0;// 
a=0;//     #v0=(LongLo);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 485
a=0;//     :cond_7
a=0;//     :try_start_1
a=0;//     #v0=(Boolean);v1=(Integer);v3=(Reference,Ljava/util/Iterator;);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/tencent/a/b/k$a;
a=0;// 
a=0;//     .line 486
a=0;//     iget-wide v4, v0, Lcom/tencent/a/b/k$a;->c:J
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     cmp-long v4, v4, v8
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     if-lez v4, :cond_2
a=0;// 
a=0;//     .line 487
a=0;//     sget-wide v4, Lcom/tencent/a/b/k;->j:J
a=0;// 
a=0;//     #v4=(LongLo);
a=0;//     iget-wide v6, v0, Lcom/tencent/a/b/k$a;->c:J
a=0;// 
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     add-long/2addr v4, v6
a=0;// 
a=0;//     sput-wide v4, Lcom/tencent/a/b/k;->j:J
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     .line 488
a=0;//     add-int/lit8 v0, v1, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     goto :goto_3
a=0;// .end method
a=0;// 
a=0;// .method public static d()V
a=0;//     .locals 10
a=0;// 
a=0;//     .prologue
a=0;//     const-wide/16 v8, 0x0
a=0;// 
a=0;//     .line 516
a=0;//     #v8=(LongLo);v9=(LongHi);
a=0;//     invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Thread;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Thread;->getId()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     invoke-static {v0, v1}, Lcom/tencent/a/b/k;->b(J)Lcom/tencent/a/b/k$a;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 517
a=0;//     #v2=(Reference,Lcom/tencent/a/b/k$a;);
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     .line 539
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 519
a=0;//     :cond_1
a=0;//     #v0=(LongLo);v1=(LongHi);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     iget-wide v3, v2, Lcom/tencent/a/b/k$a;->b:J
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     sub-long/2addr v0, v3
a=0;// 
a=0;//     iput-wide v0, v2, Lcom/tencent/a/b/k$a;->d:J
a=0;// 
a=0;//     .line 520
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     iput-wide v0, v2, Lcom/tencent/a/b/k$a;->b:J
a=0;// 
a=0;//     .line 521
a=0;//     iget-wide v0, v2, Lcom/tencent/a/b/k$a;->d:J
a=0;// 
a=0;//     sput-wide v0, Lcom/tencent/a/b/k;->q:J
a=0;// 
a=0;//     .line 522
a=0;//     iget-wide v0, v2, Lcom/tencent/a/b/k$a;->d:J
a=0;// 
a=0;//     sget-wide v3, Lcom/tencent/a/b/k;->o:J
a=0;// 
a=0;//     cmp-long v0, v0, v3
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-lez v0, :cond_4
a=0;// 
a=0;//     iget-wide v0, v2, Lcom/tencent/a/b/k$a;->d:J
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(LongLo);
a=0;//     sput-wide v0, Lcom/tencent/a/b/k;->o:J
a=0;// 
a=0;//     .line 524
a=0;//     iget-wide v0, v2, Lcom/tencent/a/b/k$a;->d:J
a=0;// 
a=0;//     sget-wide v3, Lcom/tencent/a/b/k;->p:J
a=0;// 
a=0;//     cmp-long v0, v0, v3
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-gez v0, :cond_5
a=0;// 
a=0;//     iget-wide v0, v2, Lcom/tencent/a/b/k$a;->d:J
a=0;// 
a=0;//     :goto_2
a=0;//     #v0=(LongLo);
a=0;//     sput-wide v0, Lcom/tencent/a/b/k;->p:J
a=0;// 
a=0;//     .line 526
a=0;//     sget-object v0, Lcom/tencent/a/b/k;->g:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 527
a=0;//     sget-object v2, Lcom/tencent/a/b/k;->g:Ljava/util/ArrayList;
a=0;// 
a=0;//     monitor-enter v2
a=0;// 
a=0;//     .line 528
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 529
a=0;//     :try_start_0
a=0;//     #v0=(Null);
a=0;//     sget-object v1, Lcom/tencent/a/b/k;->g:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/Iterator;);
a=0;//     move v1, v0
a=0;// 
a=0;//     :cond_2
a=0;//     :goto_3
a=0;//     #v0=(Conflicted);v1=(Integer);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_7
a=0;// 
a=0;//     .line 535
a=0;//     if-lez v1, :cond_3
a=0;// 
a=0;//     .line 536
a=0;//     sget-wide v3, Lcom/tencent/a/b/k;->n:J
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     int-to-long v0, v1
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     div-long v0, v3, v0
a=0;// 
a=0;//     sput-wide v0, Lcom/tencent/a/b/k;->n:J
a=0;// 
a=0;//     .line 527
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     monitor-exit v2
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catchall_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v2
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     .line 523
a=0;//     :cond_4
a=0;//     #v0=(Byte);v1=(LongHi);v3=(LongLo);v4=(LongHi);v5=(Uninit);v6=(Uninit);v7=(Uninit);
a=0;//     sget-wide v0, Lcom/tencent/a/b/k;->o:J
a=0;// 
a=0;//     #v0=(LongLo);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 525
a=0;//     :cond_5
a=0;//     #v0=(Byte);
a=0;//     sget-wide v0, Lcom/tencent/a/b/k;->p:J
a=0;// 
a=0;//     #v0=(LongLo);
a=0;//     cmp-long v0, v0, v8
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-nez v0, :cond_6
a=0;// 
a=0;//     iget-wide v0, v2, Lcom/tencent/a/b/k$a;->d:J
a=0;// 
a=0;//     #v0=(LongLo);
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_6
a=0;//     #v0=(Byte);
a=0;//     sget-wide v0, Lcom/tencent/a/b/k;->p:J
a=0;// 
a=0;//     #v0=(LongLo);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 529
a=0;//     :cond_7
a=0;//     :try_start_1
a=0;//     #v0=(Boolean);v1=(Integer);v3=(Reference,Ljava/util/Iterator;);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/tencent/a/b/k$a;
a=0;// 
a=0;//     .line 530
a=0;//     iget-wide v4, v0, Lcom/tencent/a/b/k$a;->d:J
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     cmp-long v4, v4, v8
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     if-lez v4, :cond_2
a=0;// 
a=0;//     .line 531
a=0;//     sget-wide v4, Lcom/tencent/a/b/k;->n:J
a=0;// 
a=0;//     #v4=(LongLo);
a=0;//     iget-wide v6, v0, Lcom/tencent/a/b/k$a;->d:J
a=0;// 
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     add-long/2addr v4, v6
a=0;// 
a=0;//     sput-wide v4, Lcom/tencent/a/b/k;->n:J
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     .line 532
a=0;//     add-int/lit8 v0, v1, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     goto :goto_3
a=0;// .end method
}}
