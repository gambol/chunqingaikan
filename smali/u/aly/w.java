package u.aly; class w { void a() { int a;
a=0;// .class public Lu/aly/w;
a=0;// .super Ljava/lang/Object;
a=0;// .source "StatTracer.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final h:Ljava/lang/String; = "successful_request"
a=0;// 
a=0;// .field private static final i:Ljava/lang/String; = "failed_requests "
a=0;// 
a=0;// .field private static final j:Ljava/lang/String; = "last_request_spent_ms"
a=0;// 
a=0;// .field private static final k:Ljava/lang/String; = "last_request_time"
a=0;// 
a=0;// .field private static final l:Ljava/lang/String; = "first_activate_time"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field public a:I
a=0;// 
a=0;// .field public b:I
a=0;// 
a=0;// .field public c:J
a=0;// 
a=0;// .field private final d:I
a=0;// 
a=0;// .field private e:I
a=0;// 
a=0;// .field private f:J
a=0;// 
a=0;// .field private g:J
a=0;// 
a=0;// .field private m:Landroid/content/Context;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const-wide/16 v1, 0x0
a=0;// 
a=0;//     .line 33
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 15
a=0;//     #p0=(Reference,Lu/aly/w;);
a=0;//     const v0, 0x36ee80
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lu/aly/w;->d:I
a=0;// 
a=0;//     .line 22
a=0;//     iput-wide v1, p0, Lu/aly/w;->f:J
a=0;// 
a=0;//     .line 23
a=0;//     iput-wide v1, p0, Lu/aly/w;->g:J
a=0;// 
a=0;//     .line 34
a=0;//     invoke-direct {p0, p1}, Lu/aly/w;->b(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 35
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static a(Landroid/content/Context;)Lu/aly/aj;
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 102
a=0;//     #v3=(Null);
a=0;//     invoke-static {p0}, Lu/aly/u;->a(Landroid/content/Context;)Landroid/content/SharedPreferences;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 104
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences;);
a=0;//     new-instance v1, Lu/aly/aj;
a=0;// 
a=0;//     #v1=(UninitRef,Lu/aly/aj;);
a=0;//     invoke-direct {v1}, Lu/aly/aj;-><init>()V
a=0;// 
a=0;//     .line 106
a=0;//     #v1=(Reference,Lu/aly/aj;);
a=0;//     const-string v2, "failed_requests "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, v2, v3}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Lu/aly/aj;->c(I)Lu/aly/aj;
a=0;// 
a=0;//     .line 107
a=0;//     const-string v2, "last_request_spent_ms"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, v2, v3}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Lu/aly/aj;->d(I)Lu/aly/aj;
a=0;// 
a=0;//     .line 108
a=0;//     const-string v2, "successful_request"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, v2, v3}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {v1, v0}, Lu/aly/aj;->a(I)Lu/aly/aj;
a=0;// 
a=0;//     .line 110
a=0;//     return-object v1
a=0;// .end method
a=0;// 
a=0;// .method private b(Landroid/content/Context;)V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 38
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     iput-object v0, p0, Lu/aly/w;->m:Landroid/content/Context;
a=0;// 
a=0;//     .line 39
a=0;//     invoke-static {p1}, Lu/aly/u;->a(Landroid/content/Context;)Landroid/content/SharedPreferences;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 41
a=0;//     const-string v1, "successful_request"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, p0, Lu/aly/w;->a:I
a=0;// 
a=0;//     .line 42
a=0;//     const-string v1, "failed_requests "
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, p0, Lu/aly/w;->b:I
a=0;// 
a=0;//     .line 44
a=0;//     const-string v1, "last_request_spent_ms"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, p0, Lu/aly/w;->e:I
a=0;// 
a=0;//     .line 45
a=0;//     const-string v1, "last_request_time"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-wide/16 v2, 0x0
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     iput-wide v0, p0, Lu/aly/w;->c:J
a=0;// 
a=0;//     .line 46
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public a()I
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const v0, 0x36ee80
a=0;// 
a=0;//     .line 49
a=0;//     #v0=(Integer);
a=0;//     iget v1, p0, Lu/aly/w;->e:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-le v1, v0, :cond_0
a=0;// 
a=0;//     :goto_0
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     iget v0, p0, Lu/aly/w;->e:I
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public b()Z
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 53
a=0;//     iget-wide v0, p0, Lu/aly/w;->c:J
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     const-wide/16 v2, 0x0
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     cmp-long v0, v0, v2
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Byte);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public c()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 57
a=0;//     iget v0, p0, Lu/aly/w;->a:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     iput v0, p0, Lu/aly/w;->a:I
a=0;// 
a=0;//     .line 59
a=0;//     iget-wide v0, p0, Lu/aly/w;->f:J
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     iput-wide v0, p0, Lu/aly/w;->c:J
a=0;// 
a=0;//     .line 60
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public d()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 63
a=0;//     iget v0, p0, Lu/aly/w;->b:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     iput v0, p0, Lu/aly/w;->b:I
a=0;// 
a=0;//     .line 64
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public e()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 67
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     iput-wide v0, p0, Lu/aly/w;->f:J
a=0;// 
a=0;//     .line 68
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public f()V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 71
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     iget-wide v2, p0, Lu/aly/w;->f:J
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     sub-long/2addr v0, v2
a=0;// 
a=0;//     long-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lu/aly/w;->e:I
a=0;// 
a=0;//     .line 72
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public g()V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 75
a=0;//     iget-object v0, p0, Lu/aly/w;->m:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v0}, Lu/aly/u;->a(Landroid/content/Context;)Landroid/content/SharedPreferences;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 77
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "successful_request"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget v2, p0, Lu/aly/w;->a:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 78
a=0;//     const-string v1, "failed_requests "
a=0;// 
a=0;//     iget v2, p0, Lu/aly/w;->b:I
a=0;// 
a=0;//     invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 79
a=0;//     const-string v1, "last_request_spent_ms"
a=0;// 
a=0;//     iget v2, p0, Lu/aly/w;->e:I
a=0;// 
a=0;//     invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 80
a=0;//     const-string v1, "last_request_time"
a=0;// 
a=0;//     iget-wide v2, p0, Lu/aly/w;->c:J
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 81
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     .line 83
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public h()V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 86
a=0;//     iget-object v0, p0, Lu/aly/w;->m:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v0}, Lu/aly/u;->a(Landroid/content/Context;)Landroid/content/SharedPreferences;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "first_activate_time"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     .line 87
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public i()Z
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const-wide/16 v2, 0x0
a=0;// 
a=0;//     .line 90
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     iget-wide v0, p0, Lu/aly/w;->g:J
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     cmp-long v0, v0, v2
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 91
a=0;//     iget-object v0, p0, Lu/aly/w;->m:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v0}, Lu/aly/u;->a(Landroid/content/Context;)Landroid/content/SharedPreferences;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "first_activate_time"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     iput-wide v0, p0, Lu/aly/w;->g:J
a=0;// 
a=0;//     .line 94
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     iget-wide v0, p0, Lu/aly/w;->g:J
a=0;// 
a=0;//     #v0=(LongLo);
a=0;//     cmp-long v0, v0, v2
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Byte);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public j()J
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 98
a=0;//     invoke-virtual {p0}, Lu/aly/w;->i()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     iget-wide v0, p0, Lu/aly/w;->g:J
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     goto :goto_0
a=0;// .end method
}}
