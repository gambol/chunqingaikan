package com.tencent.stat; class DeviceInfo { void a() { int a;
a=0;// .class public Lcom/tencent/stat/DeviceInfo;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static final NEW_USER:I = 0x0
a=0;// 
a=0;// .field public static final OLD_USER:I = 0x1
a=0;// 
a=0;// .field public static final TAG_ANDROID_ID:Ljava/lang/String; = "aid"
a=0;// 
a=0;// .field public static final TAG_FLAG:Ljava/lang/String; = "__MTA_DEVICE_INFO__"
a=0;// 
a=0;// .field public static final TAG_IMEI:Ljava/lang/String; = "ui"
a=0;// 
a=0;// .field public static final TAG_MAC:Ljava/lang/String; = "mc"
a=0;// 
a=0;// .field public static final TAG_MID:Ljava/lang/String; = "mid"
a=0;// 
a=0;// .field public static final TAG_TIMESTAMPS:Ljava/lang/String; = "ts"
a=0;// 
a=0;// .field public static final TAG_VERSION:Ljava/lang/String; = "ver"
a=0;// 
a=0;// .field public static final UPGRADE_USER:I = 0x2
a=0;// 
a=0;// .field private static h:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private a:Ljava/lang/String;
a=0;// 
a=0;// .field private b:Ljava/lang/String;
a=0;// 
a=0;// .field private c:Ljava/lang/String;
a=0;// 
a=0;// .field private d:Ljava/lang/String;
a=0;// 
a=0;// .field private e:I
a=0;// 
a=0;// .field private f:I
a=0;// 
a=0;// .field private g:J
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-static {}, Lcom/tencent/stat/common/k;->b()Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/stat/common/StatLogger;);
a=0;//     sput-object v0, Lcom/tencent/stat/DeviceInfo;->h:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method constructor <init>()V
a=0;//     .locals 2
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/tencent/stat/DeviceInfo;);
a=0;//     iput-object v0, p0, Lcom/tencent/stat/DeviceInfo;->a:Ljava/lang/String;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/tencent/stat/DeviceInfo;->b:Ljava/lang/String;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/tencent/stat/DeviceInfo;->c:Ljava/lang/String;
a=0;// 
a=0;//     const-string v0, "0"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Lcom/tencent/stat/DeviceInfo;->d:Ljava/lang/String;
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput v0, p0, Lcom/tencent/stat/DeviceInfo;->f:I
a=0;// 
a=0;//     const-wide/16 v0, 0x0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     iput-wide v0, p0, Lcom/tencent/stat/DeviceInfo;->g:J
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method constructor <init>(Ljava/lang/String;Ljava/lang/String;I)V
a=0;//     .locals 2
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/tencent/stat/DeviceInfo;);
a=0;//     iput-object v0, p0, Lcom/tencent/stat/DeviceInfo;->a:Ljava/lang/String;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/tencent/stat/DeviceInfo;->b:Ljava/lang/String;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/tencent/stat/DeviceInfo;->c:Ljava/lang/String;
a=0;// 
a=0;//     const-string v0, "0"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Lcom/tencent/stat/DeviceInfo;->d:Ljava/lang/String;
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput v0, p0, Lcom/tencent/stat/DeviceInfo;->f:I
a=0;// 
a=0;//     const-wide/16 v0, 0x0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     iput-wide v0, p0, Lcom/tencent/stat/DeviceInfo;->g:J
a=0;// 
a=0;//     iput-object p1, p0, Lcom/tencent/stat/DeviceInfo;->a:Ljava/lang/String;
a=0;// 
a=0;//     iput-object p2, p0, Lcom/tencent/stat/DeviceInfo;->b:Ljava/lang/String;
a=0;// 
a=0;//     iput p3, p0, Lcom/tencent/stat/DeviceInfo;->e:I
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static a(Ljava/lang/String;)Lcom/tencent/stat/DeviceInfo;
a=0;//     .locals 4
a=0;// 
a=0;//     new-instance v1, Lcom/tencent/stat/DeviceInfo;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/tencent/stat/DeviceInfo;);
a=0;//     invoke-direct {v1}, Lcom/tencent/stat/DeviceInfo;-><init>()V
a=0;// 
a=0;//     :try_start_0
a=0;//     #v1=(Reference,Lcom/tencent/stat/DeviceInfo;);
a=0;//     new-instance v0, Lorg/json/JSONObject;
a=0;// 
a=0;//     #v0=(UninitRef,Lorg/json/JSONObject;);
a=0;//     invoke-direct {v0, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lorg/json/JSONObject;);
a=0;//     const-string v2, "ui"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     const-string v2, "ui"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Lcom/tencent/stat/DeviceInfo;->d(Ljava/lang/String;)V
a=0;// 
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);
a=0;//     const-string v2, "mc"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     const-string v2, "mc"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Lcom/tencent/stat/DeviceInfo;->e(Ljava/lang/String;)V
a=0;// 
a=0;//     :cond_1
a=0;//     #v2=(Conflicted);
a=0;//     const-string v2, "mid"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_2
a=0;// 
a=0;//     const-string v2, "mid"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Lcom/tencent/stat/DeviceInfo;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     :cond_2
a=0;//     #v2=(Conflicted);
a=0;//     const-string v2, "aid"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_3
a=0;// 
a=0;//     const-string v2, "aid"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Lcom/tencent/stat/DeviceInfo;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     :cond_3
a=0;//     #v2=(Conflicted);
a=0;//     const-string v2, "ts"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_4
a=0;// 
a=0;//     const-string v2, "ts"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-virtual {v1, v2, v3}, Lcom/tencent/stat/DeviceInfo;->a(J)V
a=0;// 
a=0;//     :cond_4
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     const-string v2, "ver"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_5
a=0;// 
a=0;//     const-string v2, "ver"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {v1, v0}, Lcom/tencent/stat/DeviceInfo;->a(I)V
a=0;//     :try_end_0
a=0;//     .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :cond_5
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     return-object v1
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Lorg/json/JSONException;);
a=0;//     sget-object v2, Lcom/tencent/stat/DeviceInfo;->h:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     #v2=(Reference,Lcom/tencent/stat/common/StatLogger;);
a=0;//     invoke-virtual {v2, v0}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Exception;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method a()I
a=0;//     .locals 1
a=0;// 
a=0;//     iget v0, p0, Lcom/tencent/stat/DeviceInfo;->f:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method a(Lcom/tencent/stat/DeviceInfo;)I
a=0;//     .locals 8
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const/4 v2, -0x1
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     if-nez p1, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Byte);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(One);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);
a=0;//     invoke-virtual {p0}, Lcom/tencent/stat/DeviceInfo;->getMid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1}, Lcom/tencent/stat/DeviceInfo;->getMid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v3, :cond_2
a=0;// 
a=0;//     if-eqz v4, :cond_2
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_2
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(One);v3=(Conflicted);
a=0;//     invoke-virtual {p0}, Lcom/tencent/stat/DeviceInfo;->a()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {p1}, Lcom/tencent/stat/DeviceInfo;->a()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-gt v3, v4, :cond_0
a=0;// 
a=0;//     if-ne v3, v4, :cond_4
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/tencent/stat/DeviceInfo;->b()J
a=0;// 
a=0;//     move-result-wide v3
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     invoke-virtual {p1}, Lcom/tencent/stat/DeviceInfo;->b()J
a=0;// 
a=0;//     move-result-wide v5
a=0;// 
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     cmp-long v7, v3, v5
a=0;// 
a=0;//     #v7=(Byte);
a=0;//     if-gtz v7, :cond_0
a=0;// 
a=0;//     cmp-long v0, v3, v5
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-nez v0, :cond_3
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Byte);
a=0;//     move v0, v2
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(One);v3=(Integer);v4=(Integer);v5=(Uninit);v6=(Uninit);v7=(Uninit);
a=0;//     move v0, v2
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method a(I)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput p1, p0, Lcom/tencent/stat/DeviceInfo;->f:I
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method a(J)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput-wide p1, p0, Lcom/tencent/stat/DeviceInfo;->g:J
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method b()J
a=0;//     .locals 2
a=0;// 
a=0;//     iget-wide v0, p0, Lcom/tencent/stat/DeviceInfo;->g:J
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// .end method
a=0;// 
a=0;// .method b(I)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput p1, p0, Lcom/tencent/stat/DeviceInfo;->e:I
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method b(Ljava/lang/String;)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Lcom/tencent/stat/DeviceInfo;->c:Ljava/lang/String;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method c()Lorg/json/JSONObject;
a=0;//     .locals 4
a=0;// 
a=0;//     new-instance v1, Lorg/json/JSONObject;
a=0;// 
a=0;//     #v1=(UninitRef,Lorg/json/JSONObject;);
a=0;//     invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V
a=0;// 
a=0;//     :try_start_0
a=0;//     #v1=(Reference,Lorg/json/JSONObject;);
a=0;//     const-string v0, "ui"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iget-object v2, p0, Lcom/tencent/stat/DeviceInfo;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v0, v2}, Lcom/tencent/stat/common/k;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v0, "mc"
a=0;// 
a=0;//     iget-object v2, p0, Lcom/tencent/stat/DeviceInfo;->b:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v1, v0, v2}, Lcom/tencent/stat/common/k;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v0, "mid"
a=0;// 
a=0;//     iget-object v2, p0, Lcom/tencent/stat/DeviceInfo;->d:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v1, v0, v2}, Lcom/tencent/stat/common/k;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v0, "aid"
a=0;// 
a=0;//     iget-object v2, p0, Lcom/tencent/stat/DeviceInfo;->c:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v1, v0, v2}, Lcom/tencent/stat/common/k;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v0, "ts"
a=0;// 
a=0;//     iget-wide v2, p0, Lcom/tencent/stat/DeviceInfo;->g:J
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-virtual {v1, v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;
a=0;// 
a=0;//     const-string v0, "ver"
a=0;// 
a=0;//     iget v2, p0, Lcom/tencent/stat/DeviceInfo;->f:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
a=0;//     :try_end_0
a=0;//     .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     return-object v1
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Lorg/json/JSONException;);
a=0;//     sget-object v2, Lcom/tencent/stat/DeviceInfo;->h:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     #v2=(Reference,Lcom/tencent/stat/common/StatLogger;);
a=0;//     invoke-virtual {v2, v0}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Exception;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method c(Ljava/lang/String;)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Lcom/tencent/stat/DeviceInfo;->d:Ljava/lang/String;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method d(Ljava/lang/String;)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Lcom/tencent/stat/DeviceInfo;->a:Ljava/lang/String;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method e(Ljava/lang/String;)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Lcom/tencent/stat/DeviceInfo;->b:Ljava/lang/String;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public getImei()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/stat/DeviceInfo;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getMac()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/stat/DeviceInfo;->b:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getMid()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/stat/DeviceInfo;->d:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getUserType()I
a=0;//     .locals 1
a=0;// 
a=0;//     iget v0, p0, Lcom/tencent/stat/DeviceInfo;->e:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public toString()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/tencent/stat/DeviceInfo;->c()Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lorg/json/JSONObject;);
a=0;//     invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
}}
