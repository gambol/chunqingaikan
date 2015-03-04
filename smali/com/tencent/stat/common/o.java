package com.tencent.stat.common; class o { void a() { int a;
a=0;// .class Lcom/tencent/stat/common/o;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static a:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     sput v0, Lcom/tencent/stat/common/o;->a:I
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static a()Z
a=0;//     .locals 7
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     sget v2, Lcom/tencent/stat/common/o;->a:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ne v2, v0, :cond_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(One);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     sget v2, Lcom/tencent/stat/common/o;->a:I
a=0;// 
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(One);
a=0;//     const/4 v2, 0x6
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     new-array v3, v2, [Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/String;);
a=0;//     const-string v2, "/bin"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     aput-object v2, v3, v1
a=0;// 
a=0;//     const-string v2, "/system/bin/"
a=0;// 
a=0;//     aput-object v2, v3, v0
a=0;// 
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     const-string v4, "/system/xbin/"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     aput-object v4, v3, v2
a=0;// 
a=0;//     const/4 v2, 0x3
a=0;// 
a=0;//     const-string v4, "/system/sbin/"
a=0;// 
a=0;//     aput-object v4, v3, v2
a=0;// 
a=0;//     const/4 v2, 0x4
a=0;// 
a=0;//     const-string v4, "/sbin/"
a=0;// 
a=0;//     aput-object v4, v3, v2
a=0;// 
a=0;//     const/4 v2, 0x5
a=0;// 
a=0;//     const-string v4, "/vendor/bin/"
a=0;// 
a=0;//     aput-object v4, v3, v2
a=0;// 
a=0;//     move v2, v1
a=0;// 
a=0;//     :goto_1
a=0;//     :try_start_0
a=0;//     #v2=(Integer);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     array-length v4, v3
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-ge v2, v4, :cond_2
a=0;// 
a=0;//     new-instance v4, Ljava/io/File;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/io/File;);
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     aget-object v6, v3, v2
a=0;// 
a=0;//     #v6=(Null);
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     const-string v6, "su"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-direct {v4, v5}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/io/File;);
a=0;//     if-eqz v4, :cond_3
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_3
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     sput v2, Lcom/tencent/stat/common/o;->a:I
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v2=(Integer);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);
a=0;//     sput v1, Lcom/tencent/stat/common/o;->a:I
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(One);v5=(Reference,Ljava/lang/String;);v6=(Reference,Ljava/lang/String;);
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
}}
