package com.lidroid.xutils.util; class LogUtils { void a() { int a;
a=0;// .class public Lcom/lidroid/xutils/util/LogUtils;
a=0;// .super Ljava/lang/Object;
a=0;// .source "LogUtils.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/lidroid/xutils/util/LogUtils$CustomLogger;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static allowD:Z
a=0;// 
a=0;// .field public static allowE:Z
a=0;// 
a=0;// .field public static allowI:Z
a=0;// 
a=0;// .field public static allowV:Z
a=0;// 
a=0;// .field public static allowW:Z
a=0;// 
a=0;// .field public static allowWtf:Z
a=0;// 
a=0;// .field public static customLogger:Lcom/lidroid/xutils/util/LogUtils$CustomLogger;
a=0;// 
a=0;// .field public static customTagPrefix:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 30
a=0;//     #v1=(One);
a=0;//     const-string v0, ""
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     sput-object v0, Lcom/lidroid/xutils/util/LogUtils;->customTagPrefix:Ljava/lang/String;
a=0;// 
a=0;//     .line 35
a=0;//     sput-boolean v1, Lcom/lidroid/xutils/util/LogUtils;->allowD:Z
a=0;// 
a=0;//     .line 36
a=0;//     sput-boolean v1, Lcom/lidroid/xutils/util/LogUtils;->allowE:Z
a=0;// 
a=0;//     .line 37
a=0;//     sput-boolean v1, Lcom/lidroid/xutils/util/LogUtils;->allowI:Z
a=0;// 
a=0;//     .line 38
a=0;//     sput-boolean v1, Lcom/lidroid/xutils/util/LogUtils;->allowV:Z
a=0;// 
a=0;//     .line 39
a=0;//     sput-boolean v1, Lcom/lidroid/xutils/util/LogUtils;->allowW:Z
a=0;// 
a=0;//     .line 40
a=0;//     sput-boolean v1, Lcom/lidroid/xutils/util/LogUtils;->allowWtf:Z
a=0;// 
a=0;//     .line 28
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 32
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 33
a=0;//     #p0=(Reference,Lcom/lidroid/xutils/util/LogUtils;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static d(Ljava/lang/String;)V
a=0;//     .locals 3
a=0;//     .param p0, "content"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 84
a=0;//     sget-boolean v2, Lcom/lidroid/xutils/util/LogUtils;->allowD:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     .line 93
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 85
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Boolean);
a=0;//     invoke-static {}, Lcom/lidroid/xutils/util/OtherUtils;->getCallerStackTraceElement()Ljava/lang/StackTraceElement;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 86
a=0;//     .local v0, "caller":Ljava/lang/StackTraceElement;
a=0;//     #v0=(Reference,Ljava/lang/StackTraceElement;);
a=0;//     invoke-static {v0}, Lcom/lidroid/xutils/util/LogUtils;->generateTag(Ljava/lang/StackTraceElement;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 88
a=0;//     .local v1, "tag":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     sget-object v2, Lcom/lidroid/xutils/util/LogUtils;->customLogger:Lcom/lidroid/xutils/util/LogUtils$CustomLogger;
a=0;// 
a=0;//     #v2=(Reference,Lcom/lidroid/xutils/util/LogUtils$CustomLogger;);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 89
a=0;//     sget-object v2, Lcom/lidroid/xutils/util/LogUtils;->customLogger:Lcom/lidroid/xutils/util/LogUtils$CustomLogger;
a=0;// 
a=0;//     invoke-interface {v2, v1, p0}, Lcom/lidroid/xutils/util/LogUtils$CustomLogger;->d(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 91
a=0;//     :cond_1
a=0;//     invoke-static {v1, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static d(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;//     .locals 3
a=0;//     .param p0, "content"    # Ljava/lang/String;
a=0;//     .param p1, "tr"    # Ljava/lang/Throwable;
a=0;// 
a=0;//     .prologue
a=0;//     .line 96
a=0;//     sget-boolean v2, Lcom/lidroid/xutils/util/LogUtils;->allowD:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     .line 105
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 97
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Boolean);
a=0;//     invoke-static {}, Lcom/lidroid/xutils/util/OtherUtils;->getCallerStackTraceElement()Ljava/lang/StackTraceElement;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 98
a=0;//     .local v0, "caller":Ljava/lang/StackTraceElement;
a=0;//     #v0=(Reference,Ljava/lang/StackTraceElement;);
a=0;//     invoke-static {v0}, Lcom/lidroid/xutils/util/LogUtils;->generateTag(Ljava/lang/StackTraceElement;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 100
a=0;//     .local v1, "tag":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     sget-object v2, Lcom/lidroid/xutils/util/LogUtils;->customLogger:Lcom/lidroid/xutils/util/LogUtils$CustomLogger;
a=0;// 
a=0;//     #v2=(Reference,Lcom/lidroid/xutils/util/LogUtils$CustomLogger;);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 101
a=0;//     sget-object v2, Lcom/lidroid/xutils/util/LogUtils;->customLogger:Lcom/lidroid/xutils/util/LogUtils$CustomLogger;
a=0;// 
a=0;//     invoke-interface {v2, v1, p0, p1}, Lcom/lidroid/xutils/util/LogUtils$CustomLogger;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 103
a=0;//     :cond_1
a=0;//     invoke-static {v1, p0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static e(Ljava/lang/String;)V
a=0;//     .locals 3
a=0;//     .param p0, "content"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 108
a=0;//     sget-boolean v2, Lcom/lidroid/xutils/util/LogUtils;->allowE:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     .line 117
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 109
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Boolean);
a=0;//     invoke-static {}, Lcom/lidroid/xutils/util/OtherUtils;->getCallerStackTraceElement()Ljava/lang/StackTraceElement;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 110
a=0;//     .local v0, "caller":Ljava/lang/StackTraceElement;
a=0;//     #v0=(Reference,Ljava/lang/StackTraceElement;);
a=0;//     invoke-static {v0}, Lcom/lidroid/xutils/util/LogUtils;->generateTag(Ljava/lang/StackTraceElement;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 112
a=0;//     .local v1, "tag":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     sget-object v2, Lcom/lidroid/xutils/util/LogUtils;->customLogger:Lcom/lidroid/xutils/util/LogUtils$CustomLogger;
a=0;// 
a=0;//     #v2=(Reference,Lcom/lidroid/xutils/util/LogUtils$CustomLogger;);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 113
a=0;//     sget-object v2, Lcom/lidroid/xutils/util/LogUtils;->customLogger:Lcom/lidroid/xutils/util/LogUtils$CustomLogger;
a=0;// 
a=0;//     invoke-interface {v2, v1, p0}, Lcom/lidroid/xutils/util/LogUtils$CustomLogger;->e(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 115
a=0;//     :cond_1
a=0;//     invoke-static {v1, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static e(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;//     .locals 3
a=0;//     .param p0, "content"    # Ljava/lang/String;
a=0;//     .param p1, "tr"    # Ljava/lang/Throwable;
a=0;// 
a=0;//     .prologue
a=0;//     .line 120
a=0;//     sget-boolean v2, Lcom/lidroid/xutils/util/LogUtils;->allowE:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     .line 129
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 121
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Boolean);
a=0;//     invoke-static {}, Lcom/lidroid/xutils/util/OtherUtils;->getCallerStackTraceElement()Ljava/lang/StackTraceElement;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 122
a=0;//     .local v0, "caller":Ljava/lang/StackTraceElement;
a=0;//     #v0=(Reference,Ljava/lang/StackTraceElement;);
a=0;//     invoke-static {v0}, Lcom/lidroid/xutils/util/LogUtils;->generateTag(Ljava/lang/StackTraceElement;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 124
a=0;//     .local v1, "tag":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     sget-object v2, Lcom/lidroid/xutils/util/LogUtils;->customLogger:Lcom/lidroid/xutils/util/LogUtils$CustomLogger;
a=0;// 
a=0;//     #v2=(Reference,Lcom/lidroid/xutils/util/LogUtils$CustomLogger;);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 125
a=0;//     sget-object v2, Lcom/lidroid/xutils/util/LogUtils;->customLogger:Lcom/lidroid/xutils/util/LogUtils$CustomLogger;
a=0;// 
a=0;//     invoke-interface {v2, v1, p0, p1}, Lcom/lidroid/xutils/util/LogUtils$CustomLogger;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 127
a=0;//     :cond_1
a=0;//     invoke-static {v1, p0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static generateTag(Ljava/lang/StackTraceElement;)Ljava/lang/String;
a=0;//     .locals 5
a=0;//     .param p0, "caller"    # Ljava/lang/StackTraceElement;
a=0;// 
a=0;//     .prologue
a=0;//     .line 43
a=0;//     const-string v1, "%s.%s(L:%d)"
a=0;// 
a=0;//     .line 44
a=0;//     .local v1, "tag":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 45
a=0;//     .local v0, "callerClazzName":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "."
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 46
a=0;//     const/4 v2, 0x3
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     new-array v2, v2, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     aput-object v0, v2, v3
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     invoke-virtual {p0}, Ljava/lang/StackTraceElement;->getMethodName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     aput-object v4, v2, v3
a=0;// 
a=0;//     const/4 v3, 0x2
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     invoke-virtual {p0}, Ljava/lang/StackTraceElement;->getLineNumber()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v4, v2, v3
a=0;// 
a=0;//     invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 47
a=0;//     sget-object v2, Lcom/lidroid/xutils/util/LogUtils;->customTagPrefix:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 48
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     return-object v1
a=0;// 
a=0;//     .line 47
a=0;//     :cond_0
a=0;//     #v2=(Boolean);v3=(PosByte);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     sget-object v3, Lcom/lidroid/xutils/util/LogUtils;->customTagPrefix:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, ":"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static i(Ljava/lang/String;)V
a=0;//     .locals 3
a=0;//     .param p0, "content"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 132
a=0;//     sget-boolean v2, Lcom/lidroid/xutils/util/LogUtils;->allowI:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     .line 141
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 133
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Boolean);
a=0;//     invoke-static {}, Lcom/lidroid/xutils/util/OtherUtils;->getCallerStackTraceElement()Ljava/lang/StackTraceElement;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 134
a=0;//     .local v0, "caller":Ljava/lang/StackTraceElement;
a=0;//     #v0=(Reference,Ljava/lang/StackTraceElement;);
a=0;//     invoke-static {v0}, Lcom/lidroid/xutils/util/LogUtils;->generateTag(Ljava/lang/StackTraceElement;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 136
a=0;//     .local v1, "tag":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     sget-object v2, Lcom/lidroid/xutils/util/LogUtils;->customLogger:Lcom/lidroid/xutils/util/LogUtils$CustomLogger;
a=0;// 
a=0;//     #v2=(Reference,Lcom/lidroid/xutils/util/LogUtils$CustomLogger;);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 137
a=0;//     sget-object v2, Lcom/lidroid/xutils/util/LogUtils;->customLogger:Lcom/lidroid/xutils/util/LogUtils$CustomLogger;
a=0;// 
a=0;//     invoke-interface {v2, v1, p0}, Lcom/lidroid/xutils/util/LogUtils$CustomLogger;->i(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 139
a=0;//     :cond_1
a=0;//     invoke-static {v1, p0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static i(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;//     .locals 3
a=0;//     .param p0, "content"    # Ljava/lang/String;
a=0;//     .param p1, "tr"    # Ljava/lang/Throwable;
a=0;// 
a=0;//     .prologue
a=0;//     .line 144
a=0;//     sget-boolean v2, Lcom/lidroid/xutils/util/LogUtils;->allowI:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     .line 153
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 145
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Boolean);
a=0;//     invoke-static {}, Lcom/lidroid/xutils/util/OtherUtils;->getCallerStackTraceElement()Ljava/lang/StackTraceElement;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 146
a=0;//     .local v0, "caller":Ljava/lang/StackTraceElement;
a=0;//     #v0=(Reference,Ljava/lang/StackTraceElement;);
a=0;//     invoke-static {v0}, Lcom/lidroid/xutils/util/LogUtils;->generateTag(Ljava/lang/StackTraceElement;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 148
a=0;//     .local v1, "tag":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     sget-object v2, Lcom/lidroid/xutils/util/LogUtils;->customLogger:Lcom/lidroid/xutils/util/LogUtils$CustomLogger;
a=0;// 
a=0;//     #v2=(Reference,Lcom/lidroid/xutils/util/LogUtils$CustomLogger;);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 149
a=0;//     sget-object v2, Lcom/lidroid/xutils/util/LogUtils;->customLogger:Lcom/lidroid/xutils/util/LogUtils$CustomLogger;
a=0;// 
a=0;//     invoke-interface {v2, v1, p0, p1}, Lcom/lidroid/xutils/util/LogUtils$CustomLogger;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 151
a=0;//     :cond_1
a=0;//     invoke-static {v1, p0, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static v(Ljava/lang/String;)V
a=0;//     .locals 3
a=0;//     .param p0, "content"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 156
a=0;//     sget-boolean v2, Lcom/lidroid/xutils/util/LogUtils;->allowV:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     .line 165
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 157
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Boolean);
a=0;//     invoke-static {}, Lcom/lidroid/xutils/util/OtherUtils;->getCallerStackTraceElement()Ljava/lang/StackTraceElement;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 158
a=0;//     .local v0, "caller":Ljava/lang/StackTraceElement;
a=0;//     #v0=(Reference,Ljava/lang/StackTraceElement;);
a=0;//     invoke-static {v0}, Lcom/lidroid/xutils/util/LogUtils;->generateTag(Ljava/lang/StackTraceElement;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 160
a=0;//     .local v1, "tag":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     sget-object v2, Lcom/lidroid/xutils/util/LogUtils;->customLogger:Lcom/lidroid/xutils/util/LogUtils$CustomLogger;
a=0;// 
a=0;//     #v2=(Reference,Lcom/lidroid/xutils/util/LogUtils$CustomLogger;);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 161
a=0;//     sget-object v2, Lcom/lidroid/xutils/util/LogUtils;->customLogger:Lcom/lidroid/xutils/util/LogUtils$CustomLogger;
a=0;// 
a=0;//     invoke-interface {v2, v1, p0}, Lcom/lidroid/xutils/util/LogUtils$CustomLogger;->v(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 163
a=0;//     :cond_1
a=0;//     invoke-static {v1, p0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static v(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;//     .locals 3
a=0;//     .param p0, "content"    # Ljava/lang/String;
a=0;//     .param p1, "tr"    # Ljava/lang/Throwable;
a=0;// 
a=0;//     .prologue
a=0;//     .line 168
a=0;//     sget-boolean v2, Lcom/lidroid/xutils/util/LogUtils;->allowV:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     .line 177
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 169
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Boolean);
a=0;//     invoke-static {}, Lcom/lidroid/xutils/util/OtherUtils;->getCallerStackTraceElement()Ljava/lang/StackTraceElement;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 170
a=0;//     .local v0, "caller":Ljava/lang/StackTraceElement;
a=0;//     #v0=(Reference,Ljava/lang/StackTraceElement;);
a=0;//     invoke-static {v0}, Lcom/lidroid/xutils/util/LogUtils;->generateTag(Ljava/lang/StackTraceElement;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 172
a=0;//     .local v1, "tag":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     sget-object v2, Lcom/lidroid/xutils/util/LogUtils;->customLogger:Lcom/lidroid/xutils/util/LogUtils$CustomLogger;
a=0;// 
a=0;//     #v2=(Reference,Lcom/lidroid/xutils/util/LogUtils$CustomLogger;);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 173
a=0;//     sget-object v2, Lcom/lidroid/xutils/util/LogUtils;->customLogger:Lcom/lidroid/xutils/util/LogUtils$CustomLogger;
a=0;// 
a=0;//     invoke-interface {v2, v1, p0, p1}, Lcom/lidroid/xutils/util/LogUtils$CustomLogger;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 175
a=0;//     :cond_1
a=0;//     invoke-static {v1, p0, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static w(Ljava/lang/String;)V
a=0;//     .locals 3
a=0;//     .param p0, "content"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 180
a=0;//     sget-boolean v2, Lcom/lidroid/xutils/util/LogUtils;->allowW:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     .line 189
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 181
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Boolean);
a=0;//     invoke-static {}, Lcom/lidroid/xutils/util/OtherUtils;->getCallerStackTraceElement()Ljava/lang/StackTraceElement;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 182
a=0;//     .local v0, "caller":Ljava/lang/StackTraceElement;
a=0;//     #v0=(Reference,Ljava/lang/StackTraceElement;);
a=0;//     invoke-static {v0}, Lcom/lidroid/xutils/util/LogUtils;->generateTag(Ljava/lang/StackTraceElement;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 184
a=0;//     .local v1, "tag":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     sget-object v2, Lcom/lidroid/xutils/util/LogUtils;->customLogger:Lcom/lidroid/xutils/util/LogUtils$CustomLogger;
a=0;// 
a=0;//     #v2=(Reference,Lcom/lidroid/xutils/util/LogUtils$CustomLogger;);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 185
a=0;//     sget-object v2, Lcom/lidroid/xutils/util/LogUtils;->customLogger:Lcom/lidroid/xutils/util/LogUtils$CustomLogger;
a=0;// 
a=0;//     invoke-interface {v2, v1, p0}, Lcom/lidroid/xutils/util/LogUtils$CustomLogger;->w(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 187
a=0;//     :cond_1
a=0;//     invoke-static {v1, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static w(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;//     .locals 3
a=0;//     .param p0, "content"    # Ljava/lang/String;
a=0;//     .param p1, "tr"    # Ljava/lang/Throwable;
a=0;// 
a=0;//     .prologue
a=0;//     .line 192
a=0;//     sget-boolean v2, Lcom/lidroid/xutils/util/LogUtils;->allowW:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     .line 201
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 193
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Boolean);
a=0;//     invoke-static {}, Lcom/lidroid/xutils/util/OtherUtils;->getCallerStackTraceElement()Ljava/lang/StackTraceElement;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 194
a=0;//     .local v0, "caller":Ljava/lang/StackTraceElement;
a=0;//     #v0=(Reference,Ljava/lang/StackTraceElement;);
a=0;//     invoke-static {v0}, Lcom/lidroid/xutils/util/LogUtils;->generateTag(Ljava/lang/StackTraceElement;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 196
a=0;//     .local v1, "tag":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     sget-object v2, Lcom/lidroid/xutils/util/LogUtils;->customLogger:Lcom/lidroid/xutils/util/LogUtils$CustomLogger;
a=0;// 
a=0;//     #v2=(Reference,Lcom/lidroid/xutils/util/LogUtils$CustomLogger;);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 197
a=0;//     sget-object v2, Lcom/lidroid/xutils/util/LogUtils;->customLogger:Lcom/lidroid/xutils/util/LogUtils$CustomLogger;
a=0;// 
a=0;//     invoke-interface {v2, v1, p0, p1}, Lcom/lidroid/xutils/util/LogUtils$CustomLogger;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 199
a=0;//     :cond_1
a=0;//     invoke-static {v1, p0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static w(Ljava/lang/Throwable;)V
a=0;//     .locals 3
a=0;//     .param p0, "tr"    # Ljava/lang/Throwable;
a=0;// 
a=0;//     .prologue
a=0;//     .line 204
a=0;//     sget-boolean v2, Lcom/lidroid/xutils/util/LogUtils;->allowW:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     .line 213
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 205
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Boolean);
a=0;//     invoke-static {}, Lcom/lidroid/xutils/util/OtherUtils;->getCallerStackTraceElement()Ljava/lang/StackTraceElement;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 206
a=0;//     .local v0, "caller":Ljava/lang/StackTraceElement;
a=0;//     #v0=(Reference,Ljava/lang/StackTraceElement;);
a=0;//     invoke-static {v0}, Lcom/lidroid/xutils/util/LogUtils;->generateTag(Ljava/lang/StackTraceElement;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 208
a=0;//     .local v1, "tag":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     sget-object v2, Lcom/lidroid/xutils/util/LogUtils;->customLogger:Lcom/lidroid/xutils/util/LogUtils$CustomLogger;
a=0;// 
a=0;//     #v2=(Reference,Lcom/lidroid/xutils/util/LogUtils$CustomLogger;);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 209
a=0;//     sget-object v2, Lcom/lidroid/xutils/util/LogUtils;->customLogger:Lcom/lidroid/xutils/util/LogUtils$CustomLogger;
a=0;// 
a=0;//     invoke-interface {v2, v1, p0}, Lcom/lidroid/xutils/util/LogUtils$CustomLogger;->w(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 211
a=0;//     :cond_1
a=0;//     invoke-static {v1, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/Throwable;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static wtf(Ljava/lang/String;)V
a=0;//     .locals 3
a=0;//     .param p0, "content"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 217
a=0;//     sget-boolean v2, Lcom/lidroid/xutils/util/LogUtils;->allowWtf:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     .line 226
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 218
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Boolean);
a=0;//     invoke-static {}, Lcom/lidroid/xutils/util/OtherUtils;->getCallerStackTraceElement()Ljava/lang/StackTraceElement;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 219
a=0;//     .local v0, "caller":Ljava/lang/StackTraceElement;
a=0;//     #v0=(Reference,Ljava/lang/StackTraceElement;);
a=0;//     invoke-static {v0}, Lcom/lidroid/xutils/util/LogUtils;->generateTag(Ljava/lang/StackTraceElement;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 221
a=0;//     .local v1, "tag":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     sget-object v2, Lcom/lidroid/xutils/util/LogUtils;->customLogger:Lcom/lidroid/xutils/util/LogUtils$CustomLogger;
a=0;// 
a=0;//     #v2=(Reference,Lcom/lidroid/xutils/util/LogUtils$CustomLogger;);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 222
a=0;//     sget-object v2, Lcom/lidroid/xutils/util/LogUtils;->customLogger:Lcom/lidroid/xutils/util/LogUtils$CustomLogger;
a=0;// 
a=0;//     invoke-interface {v2, v1, p0}, Lcom/lidroid/xutils/util/LogUtils$CustomLogger;->wtf(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 224
a=0;//     :cond_1
a=0;//     invoke-static {v1, p0}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static wtf(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;//     .locals 3
a=0;//     .param p0, "content"    # Ljava/lang/String;
a=0;//     .param p1, "tr"    # Ljava/lang/Throwable;
a=0;// 
a=0;//     .prologue
a=0;//     .line 229
a=0;//     sget-boolean v2, Lcom/lidroid/xutils/util/LogUtils;->allowWtf:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     .line 238
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 230
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Boolean);
a=0;//     invoke-static {}, Lcom/lidroid/xutils/util/OtherUtils;->getCallerStackTraceElement()Ljava/lang/StackTraceElement;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 231
a=0;//     .local v0, "caller":Ljava/lang/StackTraceElement;
a=0;//     #v0=(Reference,Ljava/lang/StackTraceElement;);
a=0;//     invoke-static {v0}, Lcom/lidroid/xutils/util/LogUtils;->generateTag(Ljava/lang/StackTraceElement;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 233
a=0;//     .local v1, "tag":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     sget-object v2, Lcom/lidroid/xutils/util/LogUtils;->customLogger:Lcom/lidroid/xutils/util/LogUtils$CustomLogger;
a=0;// 
a=0;//     #v2=(Reference,Lcom/lidroid/xutils/util/LogUtils$CustomLogger;);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 234
a=0;//     sget-object v2, Lcom/lidroid/xutils/util/LogUtils;->customLogger:Lcom/lidroid/xutils/util/LogUtils$CustomLogger;
a=0;// 
a=0;//     invoke-interface {v2, v1, p0, p1}, Lcom/lidroid/xutils/util/LogUtils$CustomLogger;->wtf(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 236
a=0;//     :cond_1
a=0;//     invoke-static {v1, p0, p1}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static wtf(Ljava/lang/Throwable;)V
a=0;//     .locals 3
a=0;//     .param p0, "tr"    # Ljava/lang/Throwable;
a=0;// 
a=0;//     .prologue
a=0;//     .line 241
a=0;//     sget-boolean v2, Lcom/lidroid/xutils/util/LogUtils;->allowWtf:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     .line 250
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 242
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Boolean);
a=0;//     invoke-static {}, Lcom/lidroid/xutils/util/OtherUtils;->getCallerStackTraceElement()Ljava/lang/StackTraceElement;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 243
a=0;//     .local v0, "caller":Ljava/lang/StackTraceElement;
a=0;//     #v0=(Reference,Ljava/lang/StackTraceElement;);
a=0;//     invoke-static {v0}, Lcom/lidroid/xutils/util/LogUtils;->generateTag(Ljava/lang/StackTraceElement;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 245
a=0;//     .local v1, "tag":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     sget-object v2, Lcom/lidroid/xutils/util/LogUtils;->customLogger:Lcom/lidroid/xutils/util/LogUtils$CustomLogger;
a=0;// 
a=0;//     #v2=(Reference,Lcom/lidroid/xutils/util/LogUtils$CustomLogger;);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 246
a=0;//     sget-object v2, Lcom/lidroid/xutils/util/LogUtils;->customLogger:Lcom/lidroid/xutils/util/LogUtils$CustomLogger;
a=0;// 
a=0;//     invoke-interface {v2, v1, p0}, Lcom/lidroid/xutils/util/LogUtils$CustomLogger;->wtf(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 248
a=0;//     :cond_1
a=0;//     invoke-static {v1, p0}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/Throwable;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
