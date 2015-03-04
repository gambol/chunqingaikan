package safiap.framework.sdk.b; class a { void a() { int a;
a=0;// .class public final Lsafiap/framework/sdk/b/a;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static a:Lsafiap/framework/util/MyLogger; = null
a=0;// 
a=0;// .field private static final b:Ljava/lang/String; = "AuthUtil"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 23
a=0;//     const-string v0, "AuthUtil"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lsafiap/framework/util/MyLogger;->getLogger(Ljava/lang/String;)Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lsafiap/framework/sdk/b/a;->a:Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 22
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lsafiap/framework/sdk/b/a;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static a(Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 32
a=0;//     #v0=(Null);
a=0;//     if-nez p0, :cond_0
a=0;// 
a=0;//     .line 33
a=0;//     sget-object v1, Lsafiap/framework/sdk/b/a;->a:Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     #v1=(Reference,Lsafiap/framework/util/MyLogger;);
a=0;//     const-string v2, "Input string for Base64MD5 is null!"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Lsafiap/framework/util/MyLogger;->v(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 41
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/String;);v2=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 36
a=0;//     :cond_0
a=0;//     #v0=(Null);v1=(Uninit);v2=(Uninit);
a=0;//     invoke-virtual {p0}, Ljava/lang/String;->getBytes()[B
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,[B);
a=0;//     invoke-static {v1}, Lsafiap/framework/sdk/b/a;->a([B)[B
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 37
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     .line 38
a=0;//     sget-object v1, Lsafiap/framework/sdk/b/a;->a:Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     const-string v2, "Error occurred while calculating the digest!"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Lsafiap/framework/util/MyLogger;->v(Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 41
a=0;//     :cond_1
a=0;//     #v2=(Uninit);
a=0;//     invoke-static {v1}, Lsafiap/framework/sdk/b/b;->a([B)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static a([B)[B
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 50
a=0;//     #v0=(Null);
a=0;//     if-nez p0, :cond_0
a=0;// 
a=0;//     .line 51
a=0;//     sget-object v1, Lsafiap/framework/sdk/b/a;->a:Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     #v1=(Reference,Lsafiap/framework/util/MyLogger;);
a=0;//     const-string v2, "Input byte array for MD5 is null!"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Lsafiap/framework/util/MyLogger;->v(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 61
a=0;//     :goto_0
a=0;//     #v0=(Reference,[B);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 55
a=0;//     :cond_0
a=0;//     :try_start_0
a=0;//     #v0=(Null);v1=(Uninit);v2=(Uninit);v3=(Uninit);
a=0;//     const-string v1, "MD5"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 56
a=0;//     invoke-virtual {v1}, Ljava/security/MessageDigest;->reset()V
a=0;// 
a=0;//     .line 57
a=0;//     invoke-virtual {v1, p0}, Ljava/security/MessageDigest;->digest([B)[B
a=0;//     :try_end_0
a=0;//     .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 58
a=0;//     :catch_0
a=0;//     #v0=(Null);v1=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 59
a=0;//     #v1=(Reference,Ljava/security/NoSuchAlgorithmException;);
a=0;//     const-string v2, "AuthUtil"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "SAF-A Exception:514001"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 60
a=0;//     invoke-virtual {v1}, Ljava/security/NoSuchAlgorithmException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
