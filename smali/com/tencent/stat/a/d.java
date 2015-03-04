package com.tencent.stat.a; class d { void a() { int a;
a=0;// .class public Lcom/tencent/stat/a/d;
a=0;// .super Lcom/tencent/stat/a/e;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private a:Ljava/lang/String;
a=0;// 
a=0;// .field private l:I
a=0;// 
a=0;// .field private m:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;IILjava/lang/Throwable;)V
a=0;//     .locals 5
a=0;// 
a=0;//     invoke-direct {p0, p1, p2}, Lcom/tencent/stat/a/e;-><init>(Landroid/content/Context;I)V
a=0;// 
a=0;//     #p0=(Reference,Lcom/tencent/stat/a/d;);
a=0;//     const/16 v0, 0x64
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     iput v0, p0, Lcom/tencent/stat/a/d;->m:I
a=0;// 
a=0;//     if-eqz p4, :cond_2
a=0;// 
a=0;//     new-instance v1, Ljava/lang/Throwable;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/Throwable;);
a=0;//     invoke-direct {v1, p4}, Ljava/lang/Throwable;-><init>(Ljava/lang/Throwable;)V
a=0;// 
a=0;//     :try_start_0
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/StackTraceElement;);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     array-length v0, v2
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget v3, p0, Lcom/tencent/stat/a/d;->m:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-le v0, v3, :cond_1
a=0;// 
a=0;//     iget v0, p0, Lcom/tencent/stat/a/d;->m:I
a=0;// 
a=0;//     new-array v3, v0, [Ljava/lang/StackTraceElement;
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/StackTraceElement;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v4=(Conflicted);
a=0;//     iget v4, p0, Lcom/tencent/stat/a/d;->m:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-ge v0, v4, :cond_0
a=0;// 
a=0;//     aget-object v4, v2, v0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     aput-object v4, v3, v0
a=0;// 
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_0
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v1, v3}, Ljava/lang/Throwable;->setStackTrace([Ljava/lang/StackTraceElement;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :cond_1
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     new-instance v0, Ljava/io/StringWriter;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/StringWriter;);
a=0;//     invoke-direct {v0}, Ljava/io/StringWriter;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/StringWriter;);
a=0;//     new-instance v2, Ljava/io/PrintWriter;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/PrintWriter;);
a=0;//     invoke-direct {v2, v0}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/PrintWriter;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/Throwable;->printStackTrace(Ljava/io/PrintWriter;)V
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/StringWriter;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/tencent/stat/a/d;->a:Ljava/lang/String;
a=0;// 
a=0;//     iput p3, p0, Lcom/tencent/stat/a/d;->l:I
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/io/PrintWriter;->close()V
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Integer);v1=(Reference,Ljava/lang/Throwable;);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;ILjava/lang/String;II)V
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-direct {p0, p1, p2}, Lcom/tencent/stat/a/e;-><init>(Landroid/content/Context;I)V
a=0;// 
a=0;//     #p0=(Reference,Lcom/tencent/stat/a/d;);
a=0;//     const/16 v0, 0x64
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     iput v0, p0, Lcom/tencent/stat/a/d;->m:I
a=0;// 
a=0;//     if-eqz p3, :cond_1
a=0;// 
a=0;//     if-gtz p5, :cond_0
a=0;// 
a=0;//     invoke-static {}, Lcom/tencent/stat/StatConfig;->getMaxReportEventLength()I
a=0;// 
a=0;//     move-result p5
a=0;// 
a=0;//     :cond_0
a=0;//     invoke-virtual {p3}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-gt v0, p5, :cond_2
a=0;// 
a=0;//     iput-object p3, p0, Lcom/tencent/stat/a/d;->a:Ljava/lang/String;
a=0;// 
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     iput p4, p0, Lcom/tencent/stat/a/d;->l:I
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p3, v0, p5}, Ljava/lang/String;->substring(II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Lcom/tencent/stat/a/d;->a:Ljava/lang/String;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public a()Lcom/tencent/stat/a/f;
a=0;//     .locals 1
a=0;// 
a=0;//     sget-object v0, Lcom/tencent/stat/a/f;->c:Lcom/tencent/stat/a/f;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/stat/a/f;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public a(J)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput-wide p1, p0, Lcom/tencent/stat/a/d;->c:J
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public a(Lorg/json/JSONObject;)Z
a=0;//     .locals 2
a=0;// 
a=0;//     const-string v0, "er"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iget-object v1, p0, Lcom/tencent/stat/a/d;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p1, v0, v1}, Lcom/tencent/stat/common/k;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v0, "ea"
a=0;// 
a=0;//     iget v1, p0, Lcom/tencent/stat/a/d;->l:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     return v0
a=0;// .end method
}}
