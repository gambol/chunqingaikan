package com.android.volley; class VolleyLog { void a() { int a;
a=0;// .class public Lcom/android/volley/VolleyLog;
a=0;// .super Ljava/lang/Object;
a=0;// .source "VolleyLog.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/android/volley/VolleyLog$MarkerLog;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static DEBUG:Z
a=0;// 
a=0;// .field public static TAG:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 28
a=0;//     const-string v0, "Volley"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     sput-object v0, Lcom/android/volley/VolleyLog;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     .line 30
a=0;//     sget-object v0, Lcom/android/volley/VolleyLog;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     sput-boolean v0, Lcom/android/volley/VolleyLog;->DEBUG:Z
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 27
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/android/volley/VolleyLog;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private static varargs buildMessage(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;//     .locals 12
a=0;//     .param p0, "format"    # Ljava/lang/String;
a=0;//     .param p1, "args"    # [Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 79
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     move-object v4, p0
a=0;// 
a=0;//     .line 80
a=0;//     .local v4, "msg":Ljava/lang/String;
a=0;//     :goto_0
a=0;//     #v4=(Reference,Ljava/lang/String;);v6=(Conflicted);
a=0;//     new-instance v6, Ljava/lang/Throwable;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/Throwable;);
a=0;//     invoke-direct {v6}, Ljava/lang/Throwable;-><init>()V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-virtual {v6}, Ljava/lang/Throwable;->fillInStackTrace()Ljava/lang/Throwable;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 82
a=0;//     .local v5, "trace":[Ljava/lang/StackTraceElement;
a=0;//     #v5=(Reference,[Ljava/lang/StackTraceElement;);
a=0;//     const-string v0, "<unknown>"
a=0;// 
a=0;//     .line 85
a=0;//     .local v0, "caller":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/4 v3, 0x2
a=0;// 
a=0;//     .local v3, "i":I
a=0;//     :goto_1
a=0;//     #v2=(Conflicted);v3=(Integer);v6=(Conflicted);
a=0;//     array-length v6, v5
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     if-lt v3, v6, :cond_1
a=0;// 
a=0;//     .line 96
a=0;//     :goto_2
a=0;//     #v1=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     sget-object v6, Ljava/util/Locale;->US:Ljava/util/Locale;
a=0;// 
a=0;//     #v6=(Reference,Ljava/util/Locale;);
a=0;//     const-string v7, "[%d] %s: %s"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     const/4 v8, 0x3
a=0;// 
a=0;//     #v8=(PosByte);
a=0;//     new-array v8, v8, [Ljava/lang/Object;
a=0;// 
a=0;//     #v8=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     .line 97
a=0;//     #v9=(Null);
a=0;//     invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/Thread;);
a=0;//     invoke-virtual {v10}, Ljava/lang/Thread;->getId()J
a=0;// 
a=0;//     move-result-wide v10
a=0;// 
a=0;//     #v10=(LongLo);v11=(LongHi);
a=0;//     invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/Long;);
a=0;//     aput-object v10, v8, v9
a=0;// 
a=0;//     const/4 v9, 0x1
a=0;// 
a=0;//     #v9=(One);
a=0;//     aput-object v0, v8, v9
a=0;// 
a=0;//     const/4 v9, 0x2
a=0;// 
a=0;//     #v9=(PosByte);
a=0;//     aput-object v4, v8, v9
a=0;// 
a=0;//     .line 96
a=0;//     invoke-static {v6, v7, v8}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     return-object v6
a=0;// 
a=0;//     .line 79
a=0;//     .end local v0    # "caller":Ljava/lang/String;
a=0;//     .end local v3    # "i":I
a=0;//     .end local v4    # "msg":Ljava/lang/String;
a=0;//     .end local v5    # "trace":[Ljava/lang/StackTraceElement;
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);
a=0;//     sget-object v6, Ljava/util/Locale;->US:Ljava/util/Locale;
a=0;// 
a=0;//     #v6=(Reference,Ljava/util/Locale;);
a=0;//     invoke-static {v6, p0, p1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 86
a=0;//     .restart local v0    # "caller":Ljava/lang/String;
a=0;//     .restart local v3    # "i":I
a=0;//     .restart local v4    # "msg":Ljava/lang/String;
a=0;//     .restart local v5    # "trace":[Ljava/lang/StackTraceElement;
a=0;//     :cond_1
a=0;//     #v0=(Reference,Ljava/lang/String;);v2=(Conflicted);v3=(Integer);v5=(Reference,[Ljava/lang/StackTraceElement;);v6=(Integer);
a=0;//     aget-object v6, v5, v3
a=0;// 
a=0;//     #v6=(Null);
a=0;//     invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 87
a=0;//     .local v2, "clazz":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
a=0;//     #v2=(Reference,Ljava/lang/Class;);
a=0;//     const-class v6, Lcom/android/volley/VolleyLog;
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v2, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-nez v6, :cond_2
a=0;// 
a=0;//     .line 88
a=0;//     aget-object v6, v5, v3
a=0;// 
a=0;//     #v6=(Null);
a=0;//     invoke-virtual {v6}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 89
a=0;//     .local v1, "callingClass":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/16 v6, 0x2e
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     invoke-virtual {v1, v6}, Ljava/lang/String;->lastIndexOf(I)I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     add-int/lit8 v6, v6, 0x1
a=0;// 
a=0;//     invoke-virtual {v1, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 90
a=0;//     const/16 v6, 0x24
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     invoke-virtual {v1, v6}, Ljava/lang/String;->lastIndexOf(I)I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     add-int/lit8 v6, v6, 0x1
a=0;// 
a=0;//     invoke-virtual {v1, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 92
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v7, "."
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     aget-object v7, v5, v3
a=0;// 
a=0;//     #v7=(Null);
a=0;//     invoke-virtual {v7}, Ljava/lang/StackTraceElement;->getMethodName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 93
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 85
a=0;//     .end local v1    # "callingClass":Ljava/lang/String;
a=0;//     :cond_2
a=0;//     #v1=(Uninit);v6=(Boolean);v7=(Uninit);
a=0;//     add-int/lit8 v3, v3, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public static varargs d(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;//     .locals 2
a=0;//     .param p0, "format"    # Ljava/lang/String;
a=0;//     .param p1, "args"    # [Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 55
a=0;//     sget-object v0, Lcom/android/volley/VolleyLog;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0, p1}, Lcom/android/volley/VolleyLog;->buildMessage(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 56
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static varargs e(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;//     .locals 2
a=0;//     .param p0, "format"    # Ljava/lang/String;
a=0;//     .param p1, "args"    # [Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 59
a=0;//     sget-object v0, Lcom/android/volley/VolleyLog;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0, p1}, Lcom/android/volley/VolleyLog;->buildMessage(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 60
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static varargs e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
a=0;//     .locals 2
a=0;//     .param p0, "tr"    # Ljava/lang/Throwable;
a=0;//     .param p1, "format"    # Ljava/lang/String;
a=0;//     .param p2, "args"    # [Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 63
a=0;//     sget-object v0, Lcom/android/volley/VolleyLog;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p1, p2}, Lcom/android/volley/VolleyLog;->buildMessage(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
a=0;// 
a=0;//     .line 64
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static setTag(Ljava/lang/String;)V
a=0;//     .locals 3
a=0;//     .param p0, "tag"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 41
a=0;//     const-string v0, "Changing log tag to %s"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     new-array v1, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     aput-object p0, v1, v2
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcom/android/volley/VolleyLog;->d(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 42
a=0;//     sput-object p0, Lcom/android/volley/VolleyLog;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     .line 45
a=0;//     sget-object v0, Lcom/android/volley/VolleyLog;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     sput-boolean v0, Lcom/android/volley/VolleyLog;->DEBUG:Z
a=0;// 
a=0;//     .line 46
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static varargs v(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;//     .locals 2
a=0;//     .param p0, "format"    # Ljava/lang/String;
a=0;//     .param p1, "args"    # [Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 49
a=0;//     sget-boolean v0, Lcom/android/volley/VolleyLog;->DEBUG:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 50
a=0;//     sget-object v0, Lcom/android/volley/VolleyLog;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0, p1}, Lcom/android/volley/VolleyLog;->buildMessage(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 52
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static varargs wtf(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;//     .locals 2
a=0;//     .param p0, "format"    # Ljava/lang/String;
a=0;//     .param p1, "args"    # [Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 67
a=0;//     sget-object v0, Lcom/android/volley/VolleyLog;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0, p1}, Lcom/android/volley/VolleyLog;->buildMessage(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 68
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static varargs wtf(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
a=0;//     .locals 2
a=0;//     .param p0, "tr"    # Ljava/lang/Throwable;
a=0;//     .param p1, "format"    # Ljava/lang/String;
a=0;//     .param p2, "args"    # [Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 71
a=0;//     sget-object v0, Lcom/android/volley/VolleyLog;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p1, p2}, Lcom/android/volley/VolleyLog;->buildMessage(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1, p0}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
a=0;// 
a=0;//     .line 72
a=0;//     return-void
a=0;// .end method
}}
