package com.tencent.b.a; class h { void a() { int a;
a=0;// .class public Lcom/tencent/b/a/h;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ProGuard"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field protected static final b:Lcom/tencent/b/a/b;
a=0;// 
a=0;// .field protected static final c:Lcom/tencent/b/a/b;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private volatile a:Z
a=0;// 
a=0;// .field protected d:Lcom/tencent/b/a/a;
a=0;// 
a=0;// .field private volatile e:Z
a=0;// 
a=0;// .field private volatile f:Z
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 12
a=0;// 
a=0;//     .prologue
a=0;//     const-wide/16 v6, 0x2710
a=0;// 
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     const/high16 v3, 0x40000
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     const/16 v4, 0x2000
a=0;// 
a=0;//     #v4=(PosShort);
a=0;//     const/16 v8, 0xa
a=0;// 
a=0;//     .line 121
a=0;//     #v8=(PosByte);
a=0;//     const/16 v2, 0x18
a=0;// 
a=0;//     .line 122
a=0;//     #v2=(PosByte);
a=0;//     const-wide/32 v10, 0x240c8400
a=0;// 
a=0;//     .line 124
a=0;//     #v10=(LongLo);v11=(LongHi);
a=0;//     invoke-static {}, Lcom/tencent/b/a/h;->c()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 126
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     new-instance v0, Lcom/tencent/b/a/b;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/b/a/b;);
a=0;//     const-string v5, "OpenSDK.Client.File.Tracer"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     const-string v9, ".app.log"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct/range {v0 .. v11}, Lcom/tencent/b/a/b;-><init>(Ljava/io/File;IIILjava/lang/String;JILjava/lang/String;J)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/b/a/b;);
a=0;//     sput-object v0, Lcom/tencent/b/a/h;->b:Lcom/tencent/b/a/b;
a=0;// 
a=0;//     .line 130
a=0;//     new-instance v0, Lcom/tencent/b/a/b;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/b/a/b;);
a=0;//     const-string v5, "OpenSDK.File.Tracer"
a=0;// 
a=0;//     const-string v9, ".OpenSDK.log"
a=0;// 
a=0;//     invoke-direct/range {v0 .. v11}, Lcom/tencent/b/a/b;-><init>(Ljava/io/File;IIILjava/lang/String;JILjava/lang/String;J)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/b/a/b;);
a=0;//     sput-object v0, Lcom/tencent/b/a/h;->c:Lcom/tencent/b/a/b;
a=0;// 
a=0;//     .line 133
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 142
a=0;//     #v1=(One);
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 137
a=0;//     #p0=(Reference,Lcom/tencent/b/a/h;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Lcom/tencent/b/a/h;->a:Z
a=0;// 
a=0;//     .line 138
a=0;//     iput-boolean v1, p0, Lcom/tencent/b/a/h;->e:Z
a=0;// 
a=0;//     .line 139
a=0;//     iput-boolean v1, p0, Lcom/tencent/b/a/h;->f:Z
a=0;// 
a=0;//     .line 145
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static c()Ljava/io/File;
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 92
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 94
a=0;//     #v0=(Null);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     sget-object v2, Lcom/tencent/b/b/a$a;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     sget-object v2, Ljava/io/File;->separator:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {}, Lcom/tencent/b/b/b;->b()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 96
a=0;//     invoke-static {}, Lcom/tencent/b/b/c;->b()Lcom/tencent/b/b/d;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 98
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 100
a=0;//     invoke-virtual {v2}, Lcom/tencent/b/b/d;->c()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     const-wide/32 v4, 0x800000
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     cmp-long v2, v2, v4
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-lez v2, :cond_0
a=0;// 
a=0;//     .line 102
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 106
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 108
a=0;//     new-instance v0, Ljava/io/File;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/File;);
a=0;//     invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/File;);
a=0;//     invoke-direct {v0, v2, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 112
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v2=(Conflicted);
a=0;//     new-instance v0, Ljava/io/File;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/File;);
a=0;//     invoke-static {}, Lcom/tencent/b/b/b;->c()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/File;);
a=0;//     invoke-direct {v0, v2, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;//     .locals 8
a=0;// 
a=0;//     .prologue
a=0;//     .line 167
a=0;//     invoke-virtual {p0}, Lcom/tencent/b/a/h;->d()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 170
a=0;//     invoke-virtual {p0}, Lcom/tencent/b/a/h;->e()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 172
a=0;//     iget-object v0, p0, Lcom/tencent/b/a/h;->d:Lcom/tencent/b/a/a;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/b/a/a;);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 184
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 175
a=0;//     :cond_1
a=0;//     #v0=(Reference,Lcom/tencent/b/a/a;);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);
a=0;//     iget-object v0, p0, Lcom/tencent/b/a/h;->d:Lcom/tencent/b/a/a;
a=0;// 
a=0;//     invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Thread;);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v3
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     move v1, p1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move-object v5, p2
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     move-object v6, p3
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     move-object v7, p4
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-virtual/range {v0 .. v7}, Lcom/tencent/b/a/a;->b(ILjava/lang/Thread;JLjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     .line 179
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     invoke-virtual {p0}, Lcom/tencent/b/a/h;->f()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 181
a=0;//     sget-object v0, Lcom/tencent/b/a/c;->a:Lcom/tencent/b/a/c;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/b/a/c;);
a=0;//     invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Thread;);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v3
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     move v1, p1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move-object v5, p2
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     move-object v6, p3
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     move-object v7, p4
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-virtual/range {v0 .. v7}, Lcom/tencent/b/a/c;->b(ILjava/lang/Thread;JLjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public b()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 149
a=0;//     iget-object v0, p0, Lcom/tencent/b/a/h;->d:Lcom/tencent/b/a/a;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/b/a/a;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 151
a=0;//     iget-object v0, p0, Lcom/tencent/b/a/h;->d:Lcom/tencent/b/a/a;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/tencent/b/a/a;->a()V
a=0;// 
a=0;//     .line 152
a=0;//     iget-object v0, p0, Lcom/tencent/b/a/h;->d:Lcom/tencent/b/a/a;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/tencent/b/a/a;->b()V
a=0;// 
a=0;//     .line 154
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final d()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 193
a=0;//     iget-boolean v0, p0, Lcom/tencent/b/a/h;->a:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public final e()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 210
a=0;//     iget-boolean v0, p0, Lcom/tencent/b/a/h;->e:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public final f()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 220
a=0;//     iget-boolean v0, p0, Lcom/tencent/b/a/h;->f:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public onSharedPreferenceChanged(Landroid/content/SharedPreferences;Ljava/lang/String;)V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 226
a=0;//     const-string v0, "debug.file.tracelevel"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 228
a=0;//     const-string v0, "debug.file.tracelevel"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/16 v1, 0x3f
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-interface {p1, v0, v1}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 230
a=0;//     #v0=(Integer);
a=0;//     const/16 v1, 0x8
a=0;// 
a=0;//     const-string v2, "WnsTracer"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "File Trace Level Changed = "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {p0, v1, v2, v3, v4}, Lcom/tencent/b/a/h;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     .line 232
a=0;//     iget-object v1, p0, Lcom/tencent/b/a/h;->d:Lcom/tencent/b/a/a;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/b/a/a;);
a=0;//     invoke-virtual {v1, v0}, Lcom/tencent/b/a/a;->a(I)V
a=0;// 
a=0;//     .line 234
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// .end method
}}
