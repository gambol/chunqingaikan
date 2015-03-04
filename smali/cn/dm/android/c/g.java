package cn.dm.android.c; class g { void a() { int a;
a=0;// .class Lcn/dm/android/c/g;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/lang/Runnable;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcn/dm/android/c/g$a;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field static final a:Ljava/lang/String; = "GET"
a=0;// 
a=0;// .field static final b:Ljava/lang/String; = "POST"
a=0;// 
a=0;// .field static final c:I = 0x4e20
a=0;// 
a=0;// .field private static d:Lcn/dm/android/f/e; = null
a=0;// 
a=0;// .field private static final s:I = 0x1000
a=0;// 
a=0;// .field private static final t:Ljava/lang/String; = "ctwap"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private e:Ljava/net/HttpURLConnection;
a=0;// 
a=0;// .field private f:Landroid/content/Context;
a=0;// 
a=0;// .field private g:Ljava/net/URL;
a=0;// 
a=0;// .field private h:Ljava/lang/String;
a=0;// 
a=0;// .field private i:Ljava/lang/String;
a=0;// 
a=0;// .field private j:Ljava/util/HashMap;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/HashMap",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private k:Ljava/net/Proxy;
a=0;// 
a=0;// .field private l:Ljava/lang/String;
a=0;// 
a=0;// .field private m:I
a=0;// 
a=0;// .field private n:Lcn/dm/android/c/g$a;
a=0;// 
a=0;// .field private o:Ljava/lang/String;
a=0;// 
a=0;// .field private p:I
a=0;// 
a=0;// .field private q:Ljava/lang/String;
a=0;// 
a=0;// .field private r:[B
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 30
a=0;//     new-instance v0, Lcn/dm/android/f/e;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/dm/android/f/e;);
a=0;//     const-class v1, Lcn/dm/android/c/g;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Lcn/dm/android/f/e;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/android/f/e;);
a=0;//     sput-object v0, Lcn/dm/android/c/g;->d:Lcn/dm/android/f/e;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method constructor <init>(Landroid/content/Context;Ljava/lang/String;Lcn/dm/android/c/g$a;)V
a=0;//     .locals 9
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 62
a=0;//     #v3=(Null);
a=0;//     const-string v5, "GET"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     const/16 v7, 0x4e20
a=0;// 
a=0;//     #v7=(PosShort);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(UninitThis,Lcn/dm/android/c/g;);
a=0;//     move-object v1, p1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     move-object v2, p2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     move-object v4, v3
a=0;// 
a=0;//     #v4=(Null);
a=0;//     move-object v6, v3
a=0;// 
a=0;//     #v6=(Null);
a=0;//     move-object v8, p3
a=0;// 
a=0;//     #v8=(Reference,Lcn/dm/android/c/g$a;);
a=0;//     invoke-direct/range {v0 .. v8}, Lcn/dm/android/c/g;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/util/HashMap;Ljava/lang/String;Ljava/lang/String;ILcn/dm/android/c/g$a;)V
a=0;// 
a=0;//     .line 64
a=0;//     #v0=(Reference,Lcn/dm/android/c/g;);p0=(Reference,Lcn/dm/android/c/g;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/util/HashMap;Ljava/lang/String;Ljava/lang/String;ILcn/dm/android/c/g$a;)V
a=0;//     .locals 3
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Landroid/content/Context;",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/util/HashMap",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/String;",
a=0;//             "I",
a=0;//             "Lcn/dm/android/c/g$a;",
a=0;//             ")V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 82
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 41
a=0;//     #p0=(Reference,Lcn/dm/android/c/g;);
a=0;//     const/16 v0, 0x4e20
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     iput v0, p0, Lcn/dm/android/c/g;->m:I
a=0;// 
a=0;//     .line 83
a=0;//     iput-object p1, p0, Lcn/dm/android/c/g;->f:Landroid/content/Context;
a=0;// 
a=0;//     .line 84
a=0;//     iput-object p3, p0, Lcn/dm/android/c/g;->i:Ljava/lang/String;
a=0;// 
a=0;//     .line 85
a=0;//     iput-object p4, p0, Lcn/dm/android/c/g;->j:Ljava/util/HashMap;
a=0;// 
a=0;//     .line 86
a=0;//     iput-object p5, p0, Lcn/dm/android/c/g;->h:Ljava/lang/String;
a=0;// 
a=0;//     .line 87
a=0;//     iput-object p6, p0, Lcn/dm/android/c/g;->l:Ljava/lang/String;
a=0;// 
a=0;//     .line 88
a=0;//     iput p7, p0, Lcn/dm/android/c/g;->m:I
a=0;// 
a=0;//     .line 89
a=0;//     iput-object p8, p0, Lcn/dm/android/c/g;->n:Lcn/dm/android/c/g$a;
a=0;// 
a=0;//     .line 92
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcn/dm/android/c/g;->h:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 93
a=0;//     const-string v0, "GET"
a=0;// 
a=0;//     iput-object v0, p0, Lcn/dm/android/c/g;->h:Ljava/lang/String;
a=0;// 
a=0;//     .line 96
a=0;//     :cond_0
a=0;//     if-eqz p2, :cond_4
a=0;// 
a=0;//     invoke-virtual {p2}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     .line 97
a=0;//     iget-object v0, p0, Lcn/dm/android/c/g;->h:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "GET"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     if-eqz p6, :cond_3
a=0;// 
a=0;//     .line 99
a=0;//     const-string v0, "?"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, -0x1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-ne v0, v1, :cond_2
a=0;// 
a=0;//     .line 100
a=0;//     new-instance v0, Ljava/net/URL;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/net/URL;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "?"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/net/URL;);
a=0;//     iput-object v0, p0, Lcn/dm/android/c/g;->g:Ljava/net/URL;
a=0;//     :try_end_0
a=0;//     .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 116
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);
a=0;//     iget-object v0, p0, Lcn/dm/android/c/g;->l:Ljava/lang/String;
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 117
a=0;//     const-string v0, "application/x-www-form-urlencoded"
a=0;// 
a=0;//     iput-object v0, p0, Lcn/dm/android/c/g;->o:Ljava/lang/String;
a=0;// 
a=0;//     .line 121
a=0;//     :cond_1
a=0;//     :try_start_1
a=0;//     invoke-direct {p0}, Lcn/dm/android/c/g;->g()V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
a=0;//     .catch Ljava/lang/Error; {:try_start_1 .. :try_end_1} :catch_2
a=0;// 
a=0;//     .line 127
a=0;//     :goto_1
a=0;//     return-void
a=0;// 
a=0;//     .line 102
a=0;//     :cond_2
a=0;//     :try_start_2
a=0;//     #v0=(Integer);v1=(Byte);v2=(Uninit);
a=0;//     new-instance v0, Ljava/net/URL;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/net/URL;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "&"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/net/URL;);
a=0;//     iput-object v0, p0, Lcn/dm/android/c/g;->g:Ljava/net/URL;
a=0;//     :try_end_2
a=0;//     .catch Ljava/net/MalformedURLException; {:try_start_2 .. :try_end_2} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 111
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 112
a=0;//     #v0=(Reference,Ljava/net/MalformedURLException;);
a=0;//     sget-object v0, Lcn/dm/android/c/g;->d:Lcn/dm/android/f/e;
a=0;// 
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "Invalid URL string:"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, ". Failed to init connector."
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcn/dm/android/f/e;->e(Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 106
a=0;//     :cond_3
a=0;//     :try_start_3
a=0;//     #v0=(Boolean);v2=(Uninit);
a=0;//     new-instance v0, Ljava/net/URL;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/net/URL;);
a=0;//     invoke-direct {v0, p2}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/net/URL;);
a=0;//     iput-object v0, p0, Lcn/dm/android/c/g;->g:Ljava/net/URL;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 109
a=0;//     :cond_4
a=0;//     #v0=(Conflicted);v1=(Uninit);
a=0;//     sget-object v0, Lcn/dm/android/c/g;->d:Lcn/dm/android/f/e;
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/android/f/e;);
a=0;//     const-string v1, "Request URL is null or empty."
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lcn/dm/android/f/e;->e(Ljava/lang/String;)V
a=0;//     :try_end_3
a=0;//     .catch Ljava/net/MalformedURLException; {:try_start_3 .. :try_end_3} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 122
a=0;//     :catch_1
a=0;//     #v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 123
a=0;//     sget-object v1, Lcn/dm/android/c/g;->d:Lcn/dm/android/f/e;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Lcn/dm/android/f/e;->a(Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 124
a=0;//     :catch_2
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 125
a=0;//     sget-object v1, Lcn/dm/android/c/g;->d:Lcn/dm/android/f/e;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Lcn/dm/android/f/e;->a(Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method private final a(Ljava/lang/String;I)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 170
a=0;//     new-instance v0, Ljava/net/Proxy;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/net/Proxy;);
a=0;//     sget-object v1, Ljava/net/Proxy$Type;->HTTP:Ljava/net/Proxy$Type;
a=0;// 
a=0;//     #v1=(Reference,Ljava/net/Proxy$Type;);
a=0;//     new-instance v2, Ljava/net/InetSocketAddress;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/net/InetSocketAddress;);
a=0;//     invoke-direct {v2, p1, p2}, Ljava/net/InetSocketAddress;-><init>(Ljava/lang/String;I)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/net/InetSocketAddress;);
a=0;//     invoke-direct {v0, v1, v2}, Ljava/net/Proxy;-><init>(Ljava/net/Proxy$Type;Ljava/net/SocketAddress;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/net/Proxy;);
a=0;//     iput-object v0, p0, Lcn/dm/android/c/g;->k:Ljava/net/Proxy;
a=0;// 
a=0;//     .line 171
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private g()V
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     .line 133
a=0;//     iget-object v0, p0, Lcn/dm/android/c/g;->f:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 167
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 137
a=0;//     :cond_1
a=0;//     #v0=(Reference,Landroid/content/Context;);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 140
a=0;//     :try_start_0
a=0;//     #v1=(Null);
a=0;//     iget-object v0, p0, Lcn/dm/android/c/g;->f:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v0}, Lcn/dm/android/f/c;->A(Landroid/content/Context;)Landroid/database/Cursor;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 141
a=0;//     #v1=(Reference,Landroid/database/Cursor;);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     invoke-interface {v1}, Landroid/database/Cursor;->getCount()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_2
a=0;// 
a=0;//     .line 142
a=0;//     invoke-interface {v1}, Landroid/database/Cursor;->moveToFirst()Z
a=0;// 
a=0;//     .line 143
a=0;//     const-string v0, "proxy"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-interface {v1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 145
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "port"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v1, v2}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-interface {v1, v2}, Landroid/database/Cursor;->getInt(I)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 148
a=0;//     const-string v3, "apn"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v1, v3}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-interface {v1, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 150
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     sget-object v4, Lcn/dm/android/c/g;->d:Lcn/dm/android/f/e;
a=0;// 
a=0;//     #v4=(Reference,Lcn/dm/android/f/e;);
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "Current apnType is "
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Lcn/dm/android/f/e;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 151
a=0;//     sget-object v4, Lcn/dm/android/c/g;->d:Lcn/dm/android/f/e;
a=0;// 
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "proxy:"
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     const-string v6, "| port:"
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Lcn/dm/android/f/e;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 153
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, ""
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-nez v4, :cond_2
a=0;// 
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     const-string v4, "ctwap"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_2
a=0;// 
a=0;//     .line 155
a=0;//     sget-object v3, Lcn/dm/android/c/g;->d:Lcn/dm/android/f/e;
a=0;// 
a=0;//     #v3=(Reference,Lcn/dm/android/f/e;);
a=0;//     const-string v4, "ad request use proxy"
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Lcn/dm/android/f/e;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 156
a=0;//     invoke-direct {p0, v0, v2}, Lcn/dm/android/c/g;->a(Ljava/lang/String;I)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 163
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 164
a=0;//     invoke-interface {v1}, Landroid/database/Cursor;->close()V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 159
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 160
a=0;//     :try_start_1
a=0;//     #v0=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     sget-object v2, Lcn/dm/android/c/g;->d:Lcn/dm/android/f/e;
a=0;// 
a=0;//     #v2=(Reference,Lcn/dm/android/f/e;);
a=0;//     const-string v3, "\u83b7\u53d6APN\u5931\u8d25\u3002"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Lcn/dm/android/f/e;->e(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 161
a=0;//     sget-object v2, Lcn/dm/android/c/g;->d:Lcn/dm/android/f/e;
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Lcn/dm/android/f/e;->a(Ljava/lang/Throwable;)V
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     .line 163
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 164
a=0;//     invoke-interface {v1}, Landroid/database/Cursor;->close()V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 163
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     .line 164
a=0;//     invoke-interface {v1}, Landroid/database/Cursor;->close()V
a=0;// 
a=0;//     :cond_3
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected a()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 178
a=0;//     new-instance v0, Ljava/lang/Thread;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/Thread;);
a=0;//     invoke-direct {v0, p0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Thread;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Thread;->start()V
a=0;// 
a=0;//     .line 179
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected b()V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 186
a=0;//     .line 190
a=0;//     :try_start_0
a=0;//     #v2=(Null);
a=0;//     iget-object v0, p0, Lcn/dm/android/c/g;->g:Ljava/net/URL;
a=0;// 
a=0;//     #v0=(Reference,Ljava/net/URL;);
a=0;//     if-eqz v0, :cond_f
a=0;// 
a=0;//     .line 191
a=0;//     sget-object v0, Lcn/dm/android/c/g;->d:Lcn/dm/android/f/e;
a=0;// 
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "Connection URL = "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v3, p0, Lcn/dm/android/c/g;->g:Ljava/net/URL;
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/net/URL;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcn/dm/android/f/e;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 192
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-static {v0}, Ljava/net/HttpURLConnection;->setFollowRedirects(Z)V
a=0;// 
a=0;//     .line 194
a=0;//     iget-object v0, p0, Lcn/dm/android/c/g;->k:Ljava/net/Proxy;
a=0;// 
a=0;//     #v0=(Reference,Ljava/net/Proxy;);
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     .line 195
a=0;//     iget-object v0, p0, Lcn/dm/android/c/g;->g:Ljava/net/URL;
a=0;// 
a=0;//     iget-object v1, p0, Lcn/dm/android/c/g;->k:Ljava/net/Proxy;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/net/URL;->openConnection(Ljava/net/Proxy;)Ljava/net/URLConnection;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     iput-object v0, p0, Lcn/dm/android/c/g;->e:Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     .line 201
a=0;//     :goto_0
a=0;//     iget-object v0, p0, Lcn/dm/android/c/g;->e:Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     if-eqz v0, :cond_f
a=0;// 
a=0;//     .line 202
a=0;//     iget-object v0, p0, Lcn/dm/android/c/g;->i:Ljava/lang/String;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcn/dm/android/c/g;->i:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 203
a=0;//     iget-object v0, p0, Lcn/dm/android/c/g;->e:Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     #v0=(Reference,Ljava/net/HttpURLConnection;);
a=0;//     const-string v1, "User-Agent"
a=0;// 
a=0;//     iget-object v3, p0, Lcn/dm/android/c/g;->i:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1, v3}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 207
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, p0, Lcn/dm/android/c/g;->e:Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     #v0=(Reference,Ljava/net/HttpURLConnection;);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setInstanceFollowRedirects(Z)V
a=0;// 
a=0;//     .line 208
a=0;//     iget-object v0, p0, Lcn/dm/android/c/g;->e:Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     iget v1, p0, Lcn/dm/android/c/g;->m:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V
a=0;// 
a=0;//     .line 209
a=0;//     iget-object v0, p0, Lcn/dm/android/c/g;->e:Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     iget v1, p0, Lcn/dm/android/c/g;->m:I
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setReadTimeout(I)V
a=0;// 
a=0;//     .line 211
a=0;//     iget-object v0, p0, Lcn/dm/android/c/g;->j:Ljava/util/HashMap;
a=0;// 
a=0;//     if-eqz v0, :cond_7
a=0;// 
a=0;//     .line 212
a=0;//     iget-object v0, p0, Lcn/dm/android/c/g;->j:Ljava/util/HashMap;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     :cond_1
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v4=(Conflicted);
a=0;//     invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_7
a=0;// 
a=0;//     invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     .line 213
a=0;//     iget-object v1, p0, Lcn/dm/android/c/g;->j:Ljava/util/HashMap;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, Ljava/lang/String;
a=0;// 
a=0;//     .line 214
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 215
a=0;//     iget-object v4, p0, Lcn/dm/android/c/g;->e:Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     #v4=(Reference,Ljava/net/HttpURLConnection;);
a=0;//     invoke-virtual {v4, v0, v1}, Ljava/net/HttpURLConnection;->addRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 285
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     move-object v1, v2
a=0;// 
a=0;//     .line 286
a=0;//     :goto_2
a=0;//     :try_start_1
a=0;//     #v1=(Reference,Ljava/io/ByteArrayOutputStream;);v2=(Reference,Ljava/io/BufferedInputStream;);
a=0;//     sget-object v3, Lcn/dm/android/c/g;->d:Lcn/dm/android/f/e;
a=0;// 
a=0;//     #v3=(Reference,Lcn/dm/android/f/e;);
a=0;//     invoke-virtual {v3, v0}, Lcn/dm/android/f/e;->a(Ljava/lang/Throwable;)V
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_3
a=0;// 
a=0;//     .line 289
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     .line 290
a=0;//     :try_start_2
a=0;//     invoke-virtual {v2}, Ljava/io/BufferedInputStream;->close()V
a=0;//     :try_end_2
a=0;//     .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_4
a=0;// 
a=0;//     .line 297
a=0;//     :cond_2
a=0;//     :goto_3
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     .line 298
a=0;//     :try_start_3
a=0;//     invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->close()V
a=0;//     :try_end_3
a=0;//     .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_5
a=0;// 
a=0;//     .line 304
a=0;//     :cond_3
a=0;//     :goto_4
a=0;//     #v1=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 198
a=0;//     :cond_4
a=0;//     :try_start_4
a=0;//     #v1=(Reference,Ljava/lang/String;);v2=(Null);v3=(Reference,Ljava/lang/String;);v4=(Uninit);
a=0;//     iget-object v0, p0, Lcn/dm/android/c/g;->g:Ljava/net/URL;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     iput-object v0, p0, Lcn/dm/android/c/g;->e:Ljava/net/HttpURLConnection;
a=0;//     :try_end_4
a=0;//     .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0
a=0;//     .catchall {:try_start_4 .. :try_end_4} :catchall_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 288
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v3, v2
a=0;// 
a=0;//     .line 289
a=0;//     :goto_5
a=0;//     #v2=(Reference,Ljava/io/ByteArrayOutputStream;);v3=(Reference,Ljava/io/BufferedInputStream;);
a=0;//     if-eqz v3, :cond_5
a=0;// 
a=0;//     .line 290
a=0;//     :try_start_5
a=0;//     invoke-virtual {v3}, Ljava/io/BufferedInputStream;->close()V
a=0;//     :try_end_5
a=0;//     .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_6
a=0;// 
a=0;//     .line 297
a=0;//     :cond_5
a=0;//     :goto_6
a=0;//     if-eqz v2, :cond_6
a=0;// 
a=0;//     .line 298
a=0;//     :try_start_6
a=0;//     invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->close()V
a=0;//     :try_end_6
a=0;//     .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_7
a=0;// 
a=0;//     .line 302
a=0;//     :cond_6
a=0;//     :goto_7
a=0;//     throw v0
a=0;// 
a=0;//     .line 220
a=0;//     :cond_7
a=0;//     :try_start_7
a=0;//     #v0=(Conflicted);v2=(Null);
a=0;//     iget-object v0, p0, Lcn/dm/android/c/g;->h:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "POST"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_a
a=0;// 
a=0;//     iget-object v0, p0, Lcn/dm/android/c/g;->l:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v0, :cond_a
a=0;// 
a=0;//     .line 222
a=0;//     sget-object v0, Lcn/dm/android/c/g;->d:Lcn/dm/android/f/e;
a=0;// 
a=0;//     const-string v1, "OConnector do HTTP POST."
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcn/dm/android/f/e;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 223
a=0;//     iget-object v0, p0, Lcn/dm/android/c/g;->e:Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     const-string v1, "POST"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 224
a=0;//     iget-object v0, p0, Lcn/dm/android/c/g;->e:Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setDoOutput(Z)V
a=0;// 
a=0;//     .line 225
a=0;//     iget-object v0, p0, Lcn/dm/android/c/g;->e:Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     const-string v1, "Content-Type"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget-object v3, p0, Lcn/dm/android/c/g;->o:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1, v3}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 227
a=0;//     iget-object v0, p0, Lcn/dm/android/c/g;->e:Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     const-string v1, "Content-Length"
a=0;// 
a=0;//     iget-object v3, p0, Lcn/dm/android/c/g;->l:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, v3}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 230
a=0;//     iget-object v0, p0, Lcn/dm/android/c/g;->e:Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getOutputStream()Ljava/io/OutputStream;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 232
a=0;//     new-instance v1, Ljava/io/BufferedWriter;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/BufferedWriter;);
a=0;//     new-instance v3, Ljava/io/OutputStreamWriter;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/io/OutputStreamWriter;);
a=0;//     invoke-direct {v3, v0}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/io/OutputStreamWriter;);
a=0;//     const/16 v4, 0x1000
a=0;// 
a=0;//     #v4=(PosShort);
a=0;//     invoke-direct {v1, v3, v4}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;I)V
a=0;// 
a=0;//     .line 235
a=0;//     #v1=(Reference,Ljava/io/BufferedWriter;);
a=0;//     if-eqz v1, :cond_8
a=0;// 
a=0;//     .line 236
a=0;//     iget-object v3, p0, Lcn/dm/android/c/g;->l:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Ljava/io/BufferedWriter;->write(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 237
a=0;//     invoke-virtual {v1}, Ljava/io/BufferedWriter;->flush()V
a=0;// 
a=0;//     .line 238
a=0;//     invoke-virtual {v1}, Ljava/io/BufferedWriter;->close()V
a=0;// 
a=0;//     .line 239
a=0;//     invoke-virtual {v0}, Ljava/io/OutputStream;->close()V
a=0;// 
a=0;//     .line 250
a=0;//     :cond_8
a=0;//     :goto_8
a=0;//     #v4=(Conflicted);
a=0;//     iget-object v0, p0, Lcn/dm/android/c/g;->e:Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getResponseCode()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcn/dm/android/c/g;->p:I
a=0;// 
a=0;//     .line 251
a=0;//     sget-object v0, Lcn/dm/android/c/g;->d:Lcn/dm/android/f/e;
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/android/f/e;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "respcode:"
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget v3, p0, Lcn/dm/android/c/g;->p:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcn/dm/android/f/e;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 254
a=0;//     :goto_9
a=0;//     #v0=(Conflicted);v3=(Conflicted);
a=0;//     iget v0, p0, Lcn/dm/android/c/g;->p:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v1, 0x12d
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     if-eq v0, v1, :cond_9
a=0;// 
a=0;//     iget v0, p0, Lcn/dm/android/c/g;->p:I
a=0;// 
a=0;//     const/16 v1, 0x12e
a=0;// 
a=0;//     if-ne v0, v1, :cond_b
a=0;// 
a=0;//     .line 255
a=0;//     :cond_9
a=0;//     new-instance v0, Ljava/net/URL;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/net/URL;);
a=0;//     iget-object v1, p0, Lcn/dm/android/c/g;->e:Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     #v1=(Reference,Ljava/net/HttpURLConnection;);
a=0;//     const-string v3, "Location"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v3}, Ljava/net/HttpURLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/net/URL;);
a=0;//     invoke-virtual {v0}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     iput-object v0, p0, Lcn/dm/android/c/g;->e:Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     .line 258
a=0;//     iget-object v0, p0, Lcn/dm/android/c/g;->e:Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getResponseCode()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcn/dm/android/c/g;->p:I
a=0;// 
a=0;//     goto :goto_9
a=0;// 
a=0;//     .line 244
a=0;//     :cond_a
a=0;//     #v0=(Conflicted);
a=0;//     sget-object v0, Lcn/dm/android/c/g;->d:Lcn/dm/android/f/e;
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/android/f/e;);
a=0;//     const-string v1, "OConnector do HTTP GET."
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcn/dm/android/f/e;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 245
a=0;//     iget-object v0, p0, Lcn/dm/android/c/g;->e:Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/net/HttpURLConnection;->connect()V
a=0;// 
a=0;//     goto :goto_8
a=0;// 
a=0;//     .line 261
a=0;//     :cond_b
a=0;//     #v0=(Integer);v1=(PosShort);v3=(Conflicted);
a=0;//     iget v0, p0, Lcn/dm/android/c/g;->p:I
a=0;// 
a=0;//     const/16 v1, 0xc8
a=0;// 
a=0;//     if-lt v0, v1, :cond_e
a=0;// 
a=0;//     iget v0, p0, Lcn/dm/android/c/g;->p:I
a=0;// 
a=0;//     const/16 v1, 0x130
a=0;// 
a=0;//     if-gt v0, v1, :cond_e
a=0;// 
a=0;//     .line 263
a=0;//     sget-object v0, Lcn/dm/android/c/g;->d:Lcn/dm/android/f/e;
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/android/f/e;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "URL after connection/redirection:"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v3, p0, Lcn/dm/android/c/g;->e:Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/net/HttpURLConnection;->getURL()Ljava/net/URL;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcn/dm/android/f/e;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 266
a=0;//     new-instance v3, Ljava/io/BufferedInputStream;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/io/BufferedInputStream;);
a=0;//     iget-object v0, p0, Lcn/dm/android/c/g;->e:Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/16 v1, 0x1000
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     invoke-direct {v3, v0, v1}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;I)V
a=0;//     :try_end_7
a=0;//     .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_0
a=0;//     .catchall {:try_start_7 .. :try_end_7} :catchall_0
a=0;// 
a=0;//     .line 268
a=0;//     #v3=(Reference,Ljava/io/BufferedInputStream;);
a=0;//     const/16 v0, 0x1000
a=0;// 
a=0;//     :try_start_8
a=0;//     #v0=(PosShort);
a=0;//     new-array v0, v0, [B
a=0;// 
a=0;//     .line 270
a=0;//     #v0=(Reference,[B);
a=0;//     new-instance v1, Ljava/io/ByteArrayOutputStream;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/ByteArrayOutputStream;);
a=0;//     const/16 v4, 0x1000
a=0;// 
a=0;//     #v4=(PosShort);
a=0;//     invoke-direct {v1, v4}, Ljava/io/ByteArrayOutputStream;-><init>(I)V
a=0;//     :try_end_8
a=0;//     .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_8
a=0;//     .catchall {:try_start_8 .. :try_end_8} :catchall_1
a=0;// 
a=0;//     .line 272
a=0;//     :goto_a
a=0;//     :try_start_9
a=0;//     #v1=(Reference,Ljava/io/ByteArrayOutputStream;);v2=(Integer);
a=0;//     invoke-virtual {v3, v0}, Ljava/io/BufferedInputStream;->read([B)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     const/4 v4, -0x1
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     if-eq v2, v4, :cond_c
a=0;// 
a=0;//     .line 273
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {v1, v0, v4, v2}, Ljava/io/ByteArrayOutputStream;->write([BII)V
a=0;// 
a=0;//     goto :goto_a
a=0;// 
a=0;//     .line 285
a=0;//     :catch_1
a=0;//     #v0=(Conflicted);v2=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     move-object v2, v3
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/BufferedInputStream;);
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     .line 276
a=0;//     :cond_c
a=0;//     #v2=(Integer);v4=(Byte);
a=0;//     invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcn/dm/android/c/g;->r:[B
a=0;// 
a=0;//     .line 278
a=0;//     new-instance v0, Ljava/lang/String;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/String;);
a=0;//     iget-object v2, p0, Lcn/dm/android/c/g;->r:[B
a=0;// 
a=0;//     #v2=(Reference,[B);
a=0;//     const-string v4, "UTF-8"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v2, v4}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Lcn/dm/android/c/g;->q:Ljava/lang/String;
a=0;//     :try_end_9
a=0;//     .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_1
a=0;//     .catchall {:try_start_9 .. :try_end_9} :catchall_2
a=0;// 
a=0;//     move-object v2, v3
a=0;// 
a=0;//     .line 282
a=0;//     :goto_b
a=0;//     :try_start_a
a=0;//     #v0=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     iget-object v0, p0, Lcn/dm/android/c/g;->e:Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     #v0=(Reference,Ljava/net/HttpURLConnection;);
a=0;//     invoke-virtual {v0}, Ljava/net/HttpURLConnection;->disconnect()V
a=0;//     :try_end_a
a=0;//     .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_9
a=0;//     .catchall {:try_start_a .. :try_end_a} :catchall_3
a=0;// 
a=0;//     move-object v0, v2
a=0;// 
a=0;//     move-object v2, v1
a=0;// 
a=0;//     .line 289
a=0;//     :goto_c
a=0;//     #v1=(Conflicted);
a=0;//     if-eqz v0, :cond_d
a=0;// 
a=0;//     .line 290
a=0;//     :try_start_b
a=0;//     invoke-virtual {v0}, Ljava/io/BufferedInputStream;->close()V
a=0;//     :try_end_b
a=0;//     .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_3
a=0;// 
a=0;//     .line 297
a=0;//     :cond_d
a=0;//     :goto_d
a=0;//     if-eqz v2, :cond_3
a=0;// 
a=0;//     .line 298
a=0;//     :try_start_c
a=0;//     invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->close()V
a=0;//     :try_end_c
a=0;//     .catch Ljava/io/IOException; {:try_start_c .. :try_end_c} :catch_2
a=0;// 
a=0;//     goto/16 :goto_4
a=0;// 
a=0;//     .line 300
a=0;//     :catch_2
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 301
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto/16 :goto_4
a=0;// 
a=0;//     .line 292
a=0;//     :catch_3
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 293
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_d
a=0;// 
a=0;//     .line 292
a=0;//     :catch_4
a=0;//     #v1=(Reference,Ljava/io/ByteArrayOutputStream;);v3=(Reference,Lcn/dm/android/f/e;);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 293
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     .line 300
a=0;//     :catch_5
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 301
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto/16 :goto_4
a=0;// 
a=0;//     .line 292
a=0;//     :catch_6
a=0;//     #v1=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 293
a=0;//     #v1=(Reference,Ljava/io/IOException;);
a=0;//     invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto/16 :goto_6
a=0;// 
a=0;//     .line 300
a=0;//     :catch_7
a=0;//     #v1=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 301
a=0;//     #v1=(Reference,Ljava/io/IOException;);
a=0;//     invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto/16 :goto_7
a=0;// 
a=0;//     .line 288
a=0;//     :catchall_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Null);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto/16 :goto_5
a=0;// 
a=0;//     :catchall_2
a=0;//     #v0=(Conflicted);v1=(Reference,Ljava/io/ByteArrayOutputStream;);v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v2, v1
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/ByteArrayOutputStream;);
a=0;//     goto/16 :goto_5
a=0;// 
a=0;//     :catchall_3
a=0;//     #v0=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v3, v2
a=0;// 
a=0;//     #v3=(Reference,Ljava/io/BufferedInputStream;);
a=0;//     move-object v2, v1
a=0;// 
a=0;//     goto/16 :goto_5
a=0;// 
a=0;//     .line 285
a=0;//     :catch_8
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Null);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     move-object v1, v2
a=0;// 
a=0;//     #v1=(Null);
a=0;//     move-object v2, v3
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/BufferedInputStream;);
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     :catch_9
a=0;//     #v0=(Conflicted);v1=(Reference,Ljava/io/ByteArrayOutputStream;);v3=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     :cond_e
a=0;//     #v0=(Integer);v1=(PosShort);v2=(Null);
a=0;//     move-object v1, v2
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_b
a=0;// 
a=0;//     :cond_f
a=0;//     #v0=(Reference,Ujava/lang/Object;);v1=(Conflicted);v4=(Uninit);
a=0;//     move-object v0, v2
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_c
a=0;// .end method
a=0;// 
a=0;// .method protected c()[B
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 307
a=0;//     iget-object v0, p0, Lcn/dm/android/c/g;->r:[B
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method protected d()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 311
a=0;//     iget-object v0, p0, Lcn/dm/android/c/g;->q:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method protected e()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 315
a=0;//     iget v0, p0, Lcn/dm/android/c/g;->p:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method protected f()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 319
a=0;//     iget-object v0, p0, Lcn/dm/android/c/g;->l:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public run()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 324
a=0;//     invoke-virtual {p0}, Lcn/dm/android/c/g;->b()V
a=0;// 
a=0;//     .line 325
a=0;//     iget-object v0, p0, Lcn/dm/android/c/g;->n:Lcn/dm/android/c/g$a;
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/android/c/g$a;);
a=0;//     iget-object v1, p0, Lcn/dm/android/c/g;->q:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, v1}, Lcn/dm/android/c/g$a;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 326
a=0;//     return-void
a=0;// .end method
}}
