package com.j256.ormlite.android; class AndroidLog { void a() { int a;
a=0;// .class public Lcom/j256/ormlite/android/AndroidLog;
a=0;// .super Ljava/lang/Object;
a=0;// .source "AndroidLog.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/j256/ormlite/logger/Log;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/j256/ormlite/android/AndroidLog$1;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final ALL_LOGS_NAME:Ljava/lang/String; = "ORMLite"
a=0;// 
a=0;// .field private static final MAX_TAG_LENGTH:I = 0x17
a=0;// 
a=0;// .field private static final REFRESH_LEVEL_CACHE_EVERY:I = 0xc8
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private className:Ljava/lang/String;
a=0;// 
a=0;// .field private final levelCache:[Z
a=0;// 
a=0;// .field private volatile levelCacheC:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Ljava/lang/String;)V
a=0;//     .locals 9
a=0;//     .param p1, "className"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 51
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 48
a=0;//     #p0=(Reference,Lcom/j256/ormlite/android/AndroidLog;);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     iput v7, p0, Lcom/j256/ormlite/android/AndroidLog;->levelCacheC:I
a=0;// 
a=0;//     .line 53
a=0;//     invoke-static {p1}, Lcom/j256/ormlite/logger/LoggerFactory;->getSimpleClassName(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     iput-object v7, p0, Lcom/j256/ormlite/android/AndroidLog;->className:Ljava/lang/String;
a=0;// 
a=0;//     .line 55
a=0;//     iget-object v7, p0, Lcom/j256/ormlite/android/AndroidLog;->className:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v7}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 56
a=0;//     .local v4, "length":I
a=0;//     #v4=(Integer);
a=0;//     const/16 v7, 0x17
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     if-le v4, v7, :cond_0
a=0;// 
a=0;//     .line 57
a=0;//     iget-object v7, p0, Lcom/j256/ormlite/android/AndroidLog;->className:Ljava/lang/String;
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     add-int/lit8 v8, v4, -0x17
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual {v7, v8, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     iput-object v7, p0, Lcom/j256/ormlite/android/AndroidLog;->className:Ljava/lang/String;
a=0;// 
a=0;//     .line 60
a=0;//     :cond_0
a=0;//     #v7=(Conflicted);v8=(Conflicted);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 61
a=0;//     .local v6, "maxLevel":I
a=0;//     #v6=(Null);
a=0;//     invoke-static {}, Lcom/j256/ormlite/logger/Log$Level;->values()[Lcom/j256/ormlite/logger/Log$Level;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .local v1, "arr$":[Lcom/j256/ormlite/logger/Log$Level;
a=0;//     #v1=(Reference,[Lcom/j256/ormlite/logger/Log$Level;);
a=0;//     array-length v3, v1
a=0;// 
a=0;//     .local v3, "len$":I
a=0;//     #v3=(Integer);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .local v2, "i$":I
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Integer);v5=(Conflicted);v6=(Integer);
a=0;//     if-ge v2, v3, :cond_2
a=0;// 
a=0;//     aget-object v5, v1, v2
a=0;// 
a=0;//     .line 62
a=0;//     .local v5, "level":Lcom/j256/ormlite/logger/Log$Level;
a=0;//     #v5=(Null);
a=0;//     invoke-direct {p0, v5}, Lcom/j256/ormlite/android/AndroidLog;->levelToAndroidLevel(Lcom/j256/ormlite/logger/Log$Level;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 63
a=0;//     .local v0, "androidLevel":I
a=0;//     #v0=(Integer);
a=0;//     if-le v0, v6, :cond_1
a=0;// 
a=0;//     .line 64
a=0;//     move v6, v0
a=0;// 
a=0;//     .line 61
a=0;//     :cond_1
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 67
a=0;//     .end local v0    # "androidLevel":I
a=0;//     .end local v5    # "level":Lcom/j256/ormlite/logger/Log$Level;
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v5=(Conflicted);
a=0;//     add-int/lit8 v7, v6, 0x1
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     new-array v7, v7, [Z
a=0;// 
a=0;//     #v7=(Reference,[Z);
a=0;//     iput-object v7, p0, Lcom/j256/ormlite/android/AndroidLog;->levelCache:[Z
a=0;// 
a=0;//     .line 68
a=0;//     invoke-direct {p0}, Lcom/j256/ormlite/android/AndroidLog;->refreshLevelCache()V
a=0;// 
a=0;//     .line 69
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private isLevelEnabledInternal(I)Z
a=0;//     .locals 1
a=0;//     .param p1, "androidLevel"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 148
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/android/AndroidLog;->className:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, p1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     const-string v0, "ORMLite"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, p1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     return v0
a=0;// 
a=0;//     :cond_1
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private levelToAndroidLevel(Lcom/j256/ormlite/logger/Log$Level;)I
a=0;//     .locals 4
a=0;//     .param p1, "level"    # Lcom/j256/ormlite/logger/Log$Level;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x6
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     const/4 v0, 0x4
a=0;// 
a=0;//     .line 152
a=0;//     #v0=(PosByte);
a=0;//     sget-object v2, Lcom/j256/ormlite/android/AndroidLog$1;->$SwitchMap$com$j256$ormlite$logger$Log$Level:[I
a=0;// 
a=0;//     #v2=(Reference,[I);
a=0;//     invoke-virtual {p1}, Lcom/j256/ormlite/logger/Log$Level;->ordinal()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     aget v2, v2, v3
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     packed-switch v2, :pswitch_data_0
a=0;// 
a=0;//     .line 166
a=0;//     :goto_0
a=0;//     :pswitch_0
a=0;//     return v0
a=0;// 
a=0;//     .line 154
a=0;//     :pswitch_1
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 156
a=0;//     :pswitch_2
a=0;//     const/4 v0, 0x3
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 160
a=0;//     :pswitch_3
a=0;//     const/4 v0, 0x5
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :pswitch_4
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 162
a=0;//     goto :goto_0
a=0;// 
a=0;//     :pswitch_5
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 164
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 152
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x1
a=0;//         :pswitch_1
a=0;//         :pswitch_2
a=0;//         :pswitch_0
a=0;//         :pswitch_3
a=0;//         :pswitch_4
a=0;//         :pswitch_5
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method private refreshLevelCache()V
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     .line 138
a=0;//     invoke-static {}, Lcom/j256/ormlite/logger/Log$Level;->values()[Lcom/j256/ormlite/logger/Log$Level;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .local v1, "arr$":[Lcom/j256/ormlite/logger/Log$Level;
a=0;//     #v1=(Reference,[Lcom/j256/ormlite/logger/Log$Level;);
a=0;//     array-length v3, v1
a=0;// 
a=0;//     .local v3, "len$":I
a=0;//     #v3=(Integer);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .local v2, "i$":I
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Integer);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     if-ge v2, v3, :cond_1
a=0;// 
a=0;//     aget-object v4, v1, v2
a=0;// 
a=0;//     .line 139
a=0;//     .local v4, "level":Lcom/j256/ormlite/logger/Log$Level;
a=0;//     #v4=(Null);
a=0;//     invoke-direct {p0, v4}, Lcom/j256/ormlite/android/AndroidLog;->levelToAndroidLevel(Lcom/j256/ormlite/logger/Log$Level;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 140
a=0;//     .local v0, "androidLevel":I
a=0;//     #v0=(Integer);
a=0;//     iget-object v5, p0, Lcom/j256/ormlite/android/AndroidLog;->levelCache:[Z
a=0;// 
a=0;//     #v5=(Reference,[Z);
a=0;//     array-length v5, v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     if-ge v0, v5, :cond_0
a=0;// 
a=0;//     .line 141
a=0;//     iget-object v5, p0, Lcom/j256/ormlite/android/AndroidLog;->levelCache:[Z
a=0;// 
a=0;//     #v5=(Reference,[Z);
a=0;//     invoke-direct {p0, v0}, Lcom/j256/ormlite/android/AndroidLog;->isLevelEnabledInternal(I)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     aput-boolean v6, v5, v0
a=0;// 
a=0;//     .line 138
a=0;//     :cond_0
a=0;//     #v5=(Conflicted);v6=(Conflicted);
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 144
a=0;//     .end local v0    # "androidLevel":I
a=0;//     .end local v4    # "level":Lcom/j256/ormlite/logger/Log$Level;
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public isLevelEnabled(Lcom/j256/ormlite/logger/Log$Level;)Z
a=0;//     .locals 3
a=0;//     .param p1, "level"    # Lcom/j256/ormlite/logger/Log$Level;
a=0;// 
a=0;//     .prologue
a=0;//     .line 73
a=0;//     iget v1, p0, Lcom/j256/ormlite/android/AndroidLog;->levelCacheC:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     iput v1, p0, Lcom/j256/ormlite/android/AndroidLog;->levelCacheC:I
a=0;// 
a=0;//     const/16 v2, 0xc8
a=0;// 
a=0;//     #v2=(PosShort);
a=0;//     if-lt v1, v2, :cond_0
a=0;// 
a=0;//     .line 74
a=0;//     invoke-direct {p0}, Lcom/j256/ormlite/android/AndroidLog;->refreshLevelCache()V
a=0;// 
a=0;//     .line 75
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iput v1, p0, Lcom/j256/ormlite/android/AndroidLog;->levelCacheC:I
a=0;// 
a=0;//     .line 77
a=0;//     :cond_0
a=0;//     #v1=(Integer);
a=0;//     invoke-direct {p0, p1}, Lcom/j256/ormlite/android/AndroidLog;->levelToAndroidLevel(Lcom/j256/ormlite/logger/Log$Level;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 78
a=0;//     .local v0, "androidLevel":I
a=0;//     #v0=(Integer);
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/android/AndroidLog;->levelCache:[Z
a=0;// 
a=0;//     #v1=(Reference,[Z);
a=0;//     array-length v1, v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ge v0, v1, :cond_1
a=0;// 
a=0;//     .line 79
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/android/AndroidLog;->levelCache:[Z
a=0;// 
a=0;//     #v1=(Reference,[Z);
a=0;//     aget-boolean v1, v1, v0
a=0;// 
a=0;//     .line 81
a=0;//     :goto_0
a=0;//     #v1=(Boolean);
a=0;//     return v1
a=0;// 
a=0;//     :cond_1
a=0;//     #v1=(Integer);
a=0;//     invoke-direct {p0, v0}, Lcom/j256/ormlite/android/AndroidLog;->isLevelEnabledInternal(I)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public log(Lcom/j256/ormlite/logger/Log$Level;Ljava/lang/String;)V
a=0;//     .locals 2
a=0;//     .param p1, "level"    # Lcom/j256/ormlite/logger/Log$Level;
a=0;//     .param p2, "msg"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 86
a=0;//     sget-object v0, Lcom/j256/ormlite/android/AndroidLog$1;->$SwitchMap$com$j256$ormlite$logger$Log$Level:[I
a=0;// 
a=0;//     #v0=(Reference,[I);
a=0;//     invoke-virtual {p1}, Lcom/j256/ormlite/logger/Log$Level;->ordinal()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     aget v0, v0, v1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     packed-switch v0, :pswitch_data_0
a=0;// 
a=0;//     .line 106
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/android/AndroidLog;->className:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, p2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 109
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 88
a=0;//     :pswitch_0
a=0;//     #v0=(Integer);
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/android/AndroidLog;->className:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, p2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 91
a=0;//     :pswitch_1
a=0;//     #v0=(Integer);
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/android/AndroidLog;->className:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 94
a=0;//     :pswitch_2
a=0;//     #v0=(Integer);
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/android/AndroidLog;->className:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, p2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 97
a=0;//     :pswitch_3
a=0;//     #v0=(Integer);
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/android/AndroidLog;->className:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 100
a=0;//     :pswitch_4
a=0;//     #v0=(Integer);
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/android/AndroidLog;->className:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 103
a=0;//     :pswitch_5
a=0;//     #v0=(Integer);
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/android/AndroidLog;->className:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 86
a=0;//     #v0=(Unknown);v1=(Unknown);p0=(Unknown);p1=(Unknown);p2=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x1
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//         :pswitch_2
a=0;//         :pswitch_3
a=0;//         :pswitch_4
a=0;//         :pswitch_5
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method public log(Lcom/j256/ormlite/logger/Log$Level;Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;//     .locals 2
a=0;//     .param p1, "level"    # Lcom/j256/ormlite/logger/Log$Level;
a=0;//     .param p2, "msg"    # Ljava/lang/String;
a=0;//     .param p3, "t"    # Ljava/lang/Throwable;
a=0;// 
a=0;//     .prologue
a=0;//     .line 112
a=0;//     sget-object v0, Lcom/j256/ormlite/android/AndroidLog$1;->$SwitchMap$com$j256$ormlite$logger$Log$Level:[I
a=0;// 
a=0;//     #v0=(Reference,[I);
a=0;//     invoke-virtual {p1}, Lcom/j256/ormlite/logger/Log$Level;->ordinal()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     aget v0, v0, v1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     packed-switch v0, :pswitch_data_0
a=0;// 
a=0;//     .line 132
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/android/AndroidLog;->className:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, p2, p3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
a=0;// 
a=0;//     .line 135
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 114
a=0;//     :pswitch_0
a=0;//     #v0=(Integer);
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/android/AndroidLog;->className:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, p2, p3}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 117
a=0;//     :pswitch_1
a=0;//     #v0=(Integer);
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/android/AndroidLog;->className:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, p2, p3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 120
a=0;//     :pswitch_2
a=0;//     #v0=(Integer);
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/android/AndroidLog;->className:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, p2, p3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 123
a=0;//     :pswitch_3
a=0;//     #v0=(Integer);
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/android/AndroidLog;->className:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, p2, p3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 126
a=0;//     :pswitch_4
a=0;//     #v0=(Integer);
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/android/AndroidLog;->className:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, p2, p3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 129
a=0;//     :pswitch_5
a=0;//     #v0=(Integer);
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/android/AndroidLog;->className:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, p2, p3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 112
a=0;//     #v0=(Unknown);v1=(Unknown);p0=(Unknown);p1=(Unknown);p2=(Unknown);p3=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x1
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//         :pswitch_2
a=0;//         :pswitch_3
a=0;//         :pswitch_4
a=0;//         :pswitch_5
a=0;//     .end packed-switch
a=0;// .end method
}}
