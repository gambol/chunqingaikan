package com.lidroid.xutils.util; class CookieUtils { void a() { int a;
a=0;// .class public Lcom/lidroid/xutils/util/CookieUtils;
a=0;// .super Ljava/lang/Object;
a=0;// .source "CookieUtils.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lorg/apache/http/client/CookieStore;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/lidroid/xutils/util/CookieUtils$SerializableCookie;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final COOKIE_NAME_PREFIX:Ljava/lang/String; = "cookie_"
a=0;// 
a=0;// .field private static final COOKIE_NAME_STORE:Ljava/lang/String; = "names"
a=0;// 
a=0;// .field private static final COOKIE_PREFS:Ljava/lang/String; = "CookiePrefsFile"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final cookiePrefs:Landroid/content/SharedPreferences;
a=0;// 
a=0;// .field private final cookies:Ljava/util/concurrent/ConcurrentHashMap;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/concurrent/ConcurrentHashMap",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Lorg/apache/http/cookie/Cookie;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 11
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     #v10=(Null);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 48
a=0;//     #v5=(Null);
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 49
a=0;//     #p0=(Reference,Lcom/lidroid/xutils/util/CookieUtils;);
a=0;//     const-string v6, "CookiePrefsFile"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v6, v5}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     iput-object v6, p0, Lcom/lidroid/xutils/util/CookieUtils;->cookiePrefs:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     .line 50
a=0;//     new-instance v6, Ljava/util/concurrent/ConcurrentHashMap;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/util/concurrent/ConcurrentHashMap;);
a=0;//     invoke-direct {v6}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V
a=0;// 
a=0;//     #v6=(Reference,Ljava/util/concurrent/ConcurrentHashMap;);
a=0;//     iput-object v6, p0, Lcom/lidroid/xutils/util/CookieUtils;->cookies:Ljava/util/concurrent/ConcurrentHashMap;
a=0;// 
a=0;//     .line 53
a=0;//     iget-object v6, p0, Lcom/lidroid/xutils/util/CookieUtils;->cookiePrefs:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     const-string v7, "names"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v6, v7, v10}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 54
a=0;//     .local v4, "storedCookieNames":Ljava/lang/String;
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v4, :cond_0
a=0;// 
a=0;//     .line 55
a=0;//     const-string v6, ","
a=0;// 
a=0;//     invoke-static {v4, v6}, Landroid/text/TextUtils;->split(Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 56
a=0;//     .local v0, "cookieNames":[Ljava/lang/String;
a=0;//     #v0=(Reference,[Ljava/lang/String;);
a=0;//     array-length v6, v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v5=(Integer);v6=(Integer);v8=(Conflicted);v9=(Conflicted);
a=0;//     if-lt v5, v6, :cond_1
a=0;// 
a=0;//     .line 67
a=0;//     new-instance v5, Ljava/util/Date;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/util/Date;);
a=0;//     invoke-direct {v5}, Ljava/util/Date;-><init>()V
a=0;// 
a=0;//     #v5=(Reference,Ljava/util/Date;);
a=0;//     invoke-virtual {p0, v5}, Lcom/lidroid/xutils/util/CookieUtils;->clearExpired(Ljava/util/Date;)Z
a=0;// 
a=0;//     .line 69
a=0;//     .end local v0    # "cookieNames":[Ljava/lang/String;
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v6=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 56
a=0;//     .restart local v0    # "cookieNames":[Ljava/lang/String;
a=0;//     :cond_1
a=0;//     #v0=(Reference,[Ljava/lang/String;);v5=(Integer);v6=(Integer);
a=0;//     aget-object v3, v0, v5
a=0;// 
a=0;//     .line 57
a=0;//     .local v3, "name":Ljava/lang/String;
a=0;//     #v3=(Null);
a=0;//     iget-object v7, p0, Lcom/lidroid/xutils/util/CookieUtils;->cookiePrefs:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     new-instance v8, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v8=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v9, "cookie_"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-interface {v7, v8, v10}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 58
a=0;//     .local v2, "encodedCookie":Ljava/lang/String;
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     .line 59
a=0;//     invoke-virtual {p0, v2}, Lcom/lidroid/xutils/util/CookieUtils;->decodeCookie(Ljava/lang/String;)Lorg/apache/http/cookie/Cookie;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 60
a=0;//     .local v1, "decodedCookie":Lorg/apache/http/cookie/Cookie;
a=0;//     #v1=(Reference,Lorg/apache/http/cookie/Cookie;);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     .line 61
a=0;//     iget-object v7, p0, Lcom/lidroid/xutils/util/CookieUtils;->cookies:Ljava/util/concurrent/ConcurrentHashMap;
a=0;// 
a=0;//     invoke-virtual {v7, v3, v1}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 56
a=0;//     .end local v1    # "decodedCookie":Lorg/apache/http/cookie/Cookie;
a=0;//     :cond_2
a=0;//     #v1=(Conflicted);
a=0;//     add-int/lit8 v5, v5, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public addCookie(Lorg/apache/http/cookie/Cookie;)V
a=0;//     .locals 5
a=0;//     .param p1, "cookie"    # Lorg/apache/http/cookie/Cookie;
a=0;// 
a=0;//     .prologue
a=0;//     .line 73
a=0;//     invoke-interface {p1}, Lorg/apache/http/cookie/Cookie;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 76
a=0;//     .local v1, "name":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-instance v2, Ljava/util/Date;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/util/Date;);
a=0;//     invoke-direct {v2}, Ljava/util/Date;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/Date;);
a=0;//     invoke-interface {p1, v2}, Lorg/apache/http/cookie/Cookie;->isExpired(Ljava/util/Date;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     .line 77
a=0;//     iget-object v2, p0, Lcom/lidroid/xutils/util/CookieUtils;->cookies:Ljava/util/concurrent/ConcurrentHashMap;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/concurrent/ConcurrentHashMap;);
a=0;//     invoke-virtual {v2, v1, p1}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 83
a=0;//     :goto_0
a=0;//     iget-object v2, p0, Lcom/lidroid/xutils/util/CookieUtils;->cookiePrefs:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 84
a=0;//     .local v0, "editor":Landroid/content/SharedPreferences$Editor;
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences$Editor;);
a=0;//     const-string v2, "names"
a=0;// 
a=0;//     const-string v3, ","
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     iget-object v4, p0, Lcom/lidroid/xutils/util/CookieUtils;->cookies:Ljava/util/concurrent/ConcurrentHashMap;
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/concurrent/ConcurrentHashMap;);
a=0;//     invoke-virtual {v4}, Ljava/util/concurrent/ConcurrentHashMap;->keySet()Ljava/util/Set;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-static {v3, v4}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-interface {v0, v2, v3}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     .line 85
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "cookie_"
a=0;// 
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     new-instance v3, Lcom/lidroid/xutils/util/CookieUtils$SerializableCookie;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/lidroid/xutils/util/CookieUtils$SerializableCookie;);
a=0;//     invoke-direct {v3, p0, p1}, Lcom/lidroid/xutils/util/CookieUtils$SerializableCookie;-><init>(Lcom/lidroid/xutils/util/CookieUtils;Lorg/apache/http/cookie/Cookie;)V
a=0;// 
a=0;//     #v3=(Reference,Lcom/lidroid/xutils/util/CookieUtils$SerializableCookie;);
a=0;//     invoke-virtual {p0, v3}, Lcom/lidroid/xutils/util/CookieUtils;->encodeCookie(Lcom/lidroid/xutils/util/CookieUtils$SerializableCookie;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-interface {v0, v2, v3}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     .line 86
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     .line 87
a=0;//     return-void
a=0;// 
a=0;//     .line 79
a=0;//     .end local v0    # "editor":Landroid/content/SharedPreferences$Editor;
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v2=(Boolean);v3=(Uninit);v4=(Uninit);
a=0;//     iget-object v2, p0, Lcom/lidroid/xutils/util/CookieUtils;->cookies:Ljava/util/concurrent/ConcurrentHashMap;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/concurrent/ConcurrentHashMap;);
a=0;//     invoke-virtual {v2, v1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected byteArrayToHexString([B)Ljava/lang/String;
a=0;//     .locals 6
a=0;//     .param p1, "b"    # [B
a=0;// 
a=0;//     .prologue
a=0;//     .line 171
a=0;//     new-instance v1, Ljava/lang/StringBuffer;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuffer;);
a=0;//     array-length v3, p1
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     mul-int/lit8 v3, v3, 0x2
a=0;// 
a=0;//     invoke-direct {v1, v3}, Ljava/lang/StringBuffer;-><init>(I)V
a=0;// 
a=0;//     .line 172
a=0;//     .local v1, "sb":Ljava/lang/StringBuffer;
a=0;//     #v1=(Reference,Ljava/lang/StringBuffer;);
a=0;//     array-length v4, p1
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v5=(Conflicted);
a=0;//     if-lt v3, v4, :cond_0
a=0;// 
a=0;//     .line 179
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     return-object v3
a=0;// 
a=0;//     .line 172
a=0;//     :cond_0
a=0;//     #v3=(Integer);
a=0;//     aget-byte v0, p1, v3
a=0;// 
a=0;//     .line 173
a=0;//     .local v0, "element":B
a=0;//     #v0=(Byte);
a=0;//     and-int/lit16 v2, v0, 0xff
a=0;// 
a=0;//     .line 174
a=0;//     .local v2, "v":I
a=0;//     #v2=(Integer);
a=0;//     const/16 v5, 0x10
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     if-ge v2, v5, :cond_1
a=0;// 
a=0;//     .line 175
a=0;//     const/16 v5, 0x30
a=0;// 
a=0;//     invoke-virtual {v1, v5}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     .line 177
a=0;//     :cond_1
a=0;//     invoke-static {v2}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     .line 172
a=0;//     add-int/lit8 v3, v3, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public clear()V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 92
a=0;//     iget-object v2, p0, Lcom/lidroid/xutils/util/CookieUtils;->cookiePrefs:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/SharedPreferences;);
a=0;//     invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 93
a=0;//     .local v0, "editor":Landroid/content/SharedPreferences$Editor;
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences$Editor;);
a=0;//     iget-object v2, p0, Lcom/lidroid/xutils/util/CookieUtils;->cookies:Ljava/util/concurrent/ConcurrentHashMap;
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/util/concurrent/ConcurrentHashMap;->keySet()Ljava/util/Set;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     .line 96
a=0;//     const-string v2, "names"
a=0;// 
a=0;//     invoke-interface {v0, v2}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     .line 97
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     .line 100
a=0;//     iget-object v2, p0, Lcom/lidroid/xutils/util/CookieUtils;->cookies:Ljava/util/concurrent/ConcurrentHashMap;
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V
a=0;// 
a=0;//     .line 101
a=0;//     return-void
a=0;// 
a=0;//     .line 93
a=0;//     :cond_0
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Ljava/lang/String;
a=0;// 
a=0;//     .line 94
a=0;//     .local v1, "name":Ljava/lang/String;
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "cookie_"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-interface {v0, v3}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public clearExpired(Ljava/util/Date;)Z
a=0;//     .locals 8
a=0;//     .param p1, "date"    # Ljava/util/Date;
a=0;// 
a=0;//     .prologue
a=0;//     .line 105
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 106
a=0;//     .local v0, "clearedAny":Z
a=0;//     #v0=(Null);
a=0;//     iget-object v5, p0, Lcom/lidroid/xutils/util/CookieUtils;->cookiePrefs:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     #v5=(Reference,Landroid/content/SharedPreferences;);
a=0;//     invoke-interface {v5}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 108
a=0;//     .local v2, "editor":Landroid/content/SharedPreferences$Editor;
a=0;//     #v2=(Reference,Landroid/content/SharedPreferences$Editor;);
a=0;//     iget-object v5, p0, Lcom/lidroid/xutils/util/CookieUtils;->cookies:Ljava/util/concurrent/ConcurrentHashMap;
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/util/concurrent/ConcurrentHashMap;->entrySet()Ljava/util/Set;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-nez v6, :cond_2
a=0;// 
a=0;//     .line 124
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 125
a=0;//     const-string v5, "names"
a=0;// 
a=0;//     const-string v6, ","
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     iget-object v7, p0, Lcom/lidroid/xutils/util/CookieUtils;->cookies:Ljava/util/concurrent/ConcurrentHashMap;
a=0;// 
a=0;//     #v7=(Reference,Ljava/util/concurrent/ConcurrentHashMap;);
a=0;//     invoke-virtual {v7}, Ljava/util/concurrent/ConcurrentHashMap;->keySet()Ljava/util/Set;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-static {v6, v7}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-interface {v2, v5, v6}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     .line 127
a=0;//     :cond_1
a=0;//     #v6=(Conflicted);v7=(Conflicted);
a=0;//     invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     .line 129
a=0;//     return v0
a=0;// 
a=0;//     .line 108
a=0;//     :cond_2
a=0;//     #v6=(Boolean);
a=0;//     invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v3, Ljava/util/Map$Entry;
a=0;// 
a=0;//     .line 109
a=0;//     .local v3, "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Lorg/apache/http/cookie/Cookie;>;"
a=0;//     invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v4, Ljava/lang/String;
a=0;// 
a=0;//     .line 110
a=0;//     .local v4, "name":Ljava/lang/String;
a=0;//     invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Lorg/apache/http/cookie/Cookie;
a=0;// 
a=0;//     .line 111
a=0;//     .local v1, "cookie":Lorg/apache/http/cookie/Cookie;
a=0;//     invoke-interface {v1}, Lorg/apache/http/cookie/Cookie;->getExpiryDate()Ljava/util/Date;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/util/Date;);
a=0;//     if-eqz v6, :cond_3
a=0;// 
a=0;//     invoke-interface {v1, p1}, Lorg/apache/http/cookie/Cookie;->isExpired(Ljava/util/Date;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_0
a=0;// 
a=0;//     .line 113
a=0;//     :cond_3
a=0;//     #v6=(Conflicted);
a=0;//     iget-object v6, p0, Lcom/lidroid/xutils/util/CookieUtils;->cookies:Ljava/util/concurrent/ConcurrentHashMap;
a=0;// 
a=0;//     #v6=(Reference,Ljava/util/concurrent/ConcurrentHashMap;);
a=0;//     invoke-virtual {v6, v4}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 116
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v7, "cookie_"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-interface {v2, v6}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     .line 119
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected decodeCookie(Ljava/lang/String;)Lorg/apache/http/cookie/Cookie;
a=0;//     .locals 6
a=0;//     .param p1, "cookieStr"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 155
a=0;//     invoke-virtual {p0, p1}, Lcom/lidroid/xutils/util/CookieUtils;->hexStringToByteArray(Ljava/lang/String;)[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 156
a=0;//     .local v0, "bytes":[B
a=0;//     #v0=(Reference,[B);
a=0;//     new-instance v3, Ljava/io/ByteArrayInputStream;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/io/ByteArrayInputStream;);
a=0;//     invoke-direct {v3, v0}, Ljava/io/ByteArrayInputStream;-><init>([B)V
a=0;// 
a=0;//     .line 157
a=0;//     .local v3, "is":Ljava/io/ByteArrayInputStream;
a=0;//     #v3=(Reference,Ljava/io/ByteArrayInputStream;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 159
a=0;//     .local v1, "cookie":Lorg/apache/http/cookie/Cookie;
a=0;//     :try_start_0
a=0;//     #v1=(Null);
a=0;//     new-instance v4, Ljava/io/ObjectInputStream;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/io/ObjectInputStream;);
a=0;//     invoke-direct {v4, v3}, Ljava/io/ObjectInputStream;-><init>(Ljava/io/InputStream;)V
a=0;// 
a=0;//     .line 160
a=0;//     .local v4, "ois":Ljava/io/ObjectInputStream;
a=0;//     #v4=(Reference,Ljava/io/ObjectInputStream;);
a=0;//     invoke-virtual {v4}, Ljava/io/ObjectInputStream;->readObject()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v5, Lcom/lidroid/xutils/util/CookieUtils$SerializableCookie;
a=0;// 
a=0;//     invoke-virtual {v5}, Lcom/lidroid/xutils/util/CookieUtils$SerializableCookie;->getCookie()Lorg/apache/http/cookie/Cookie;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 165
a=0;//     .end local v4    # "ois":Ljava/io/ObjectInputStream;
a=0;//     :goto_0
a=0;//     #v1=(Reference,Lorg/apache/http/cookie/Cookie;);v2=(Conflicted);v4=(Conflicted);
a=0;//     return-object v1
a=0;// 
a=0;//     .line 161
a=0;//     :catch_0
a=0;//     #v1=(Null);v2=(Uninit);v5=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     .line 162
a=0;//     .local v2, "e":Ljava/lang/Throwable;
a=0;//     #v2=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v5, v2}, Lcom/lidroid/xutils/util/LogUtils;->e(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected encodeCookie(Lcom/lidroid/xutils/util/CookieUtils$SerializableCookie;)Ljava/lang/String;
a=0;//     .locals 4
a=0;//     .param p1, "cookie"    # Lcom/lidroid/xutils/util/CookieUtils$SerializableCookie;
a=0;// 
a=0;//     .prologue
a=0;//     .line 143
a=0;//     new-instance v1, Ljava/io/ByteArrayOutputStream;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/ByteArrayOutputStream;);
a=0;//     invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V
a=0;// 
a=0;//     .line 145
a=0;//     .local v1, "os":Ljava/io/ByteArrayOutputStream;
a=0;//     :try_start_0
a=0;//     #v1=(Reference,Ljava/io/ByteArrayOutputStream;);
a=0;//     new-instance v2, Ljava/io/ObjectOutputStream;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/ObjectOutputStream;);
a=0;//     invoke-direct {v2, v1}, Ljava/io/ObjectOutputStream;-><init>(Ljava/io/OutputStream;)V
a=0;// 
a=0;//     .line 146
a=0;//     .local v2, "outputStream":Ljava/io/ObjectOutputStream;
a=0;//     #v2=(Reference,Ljava/io/ObjectOutputStream;);
a=0;//     invoke-virtual {v2, p1}, Ljava/io/ObjectOutputStream;->writeObject(Ljava/lang/Object;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 151
a=0;//     invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,[B);
a=0;//     invoke-virtual {p0, v3}, Lcom/lidroid/xutils/util/CookieUtils;->byteArrayToHexString([B)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .end local v2    # "outputStream":Ljava/io/ObjectOutputStream;
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     return-object v3
a=0;// 
a=0;//     .line 147
a=0;//     :catch_0
a=0;//     #v0=(Uninit);v3=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 148
a=0;//     .local v0, "e":Ljava/lang/Throwable;
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getCookie(Ljava/lang/String;)Lorg/apache/http/cookie/Cookie;
a=0;//     .locals 1
a=0;//     .param p1, "name"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 138
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/util/CookieUtils;->cookies:Ljava/util/concurrent/ConcurrentHashMap;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/ConcurrentHashMap;);
a=0;//     invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lorg/apache/http/cookie/Cookie;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getCookies()Ljava/util/List;
a=0;//     .locals 2
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()",
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Lorg/apache/http/cookie/Cookie;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 134
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     iget-object v1, p0, Lcom/lidroid/xutils/util/CookieUtils;->cookies:Ljava/util/concurrent/ConcurrentHashMap;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/concurrent/ConcurrentHashMap;);
a=0;//     invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method protected hexStringToByteArray(Ljava/lang/String;)[B
a=0;//     .locals 7
a=0;//     .param p1, "s"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v6, 0x10
a=0;// 
a=0;//     .line 183
a=0;//     #v6=(PosByte);
a=0;//     invoke-virtual {p1}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 184
a=0;//     .local v2, "len":I
a=0;//     #v2=(Integer);
a=0;//     div-int/lit8 v3, v2, 0x2
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     new-array v0, v3, [B
a=0;// 
a=0;//     .line 185
a=0;//     .local v0, "data":[B
a=0;//     #v0=(Reference,[B);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .local v1, "i":I
a=0;//     :goto_0
a=0;//     #v1=(Integer);v4=(Conflicted);v5=(Conflicted);
a=0;//     if-lt v1, v2, :cond_0
a=0;// 
a=0;//     .line 188
a=0;//     return-object v0
a=0;// 
a=0;//     .line 186
a=0;//     :cond_0
a=0;//     div-int/lit8 v3, v1, 0x2
a=0;// 
a=0;//     invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Char);
a=0;//     invoke-static {v4, v6}, Ljava/lang/Character;->digit(CI)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     shl-int/lit8 v4, v4, 0x4
a=0;// 
a=0;//     add-int/lit8 v5, v1, 0x1
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {p1, v5}, Ljava/lang/String;->charAt(I)C
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Char);
a=0;//     invoke-static {v5, v6}, Ljava/lang/Character;->digit(CI)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     add-int/2addr v4, v5
a=0;// 
a=0;//     int-to-byte v4, v4
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     aput-byte v4, v0, v3
a=0;// 
a=0;//     .line 185
a=0;//     add-int/lit8 v1, v1, 0x2
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
