package com.ccit.mmwlan.httpClient; class HTTPConnectionToolForBilling { void a() { int a;
a=0;// .class public Lcom/ccit/mmwlan/httpClient/HTTPConnectionToolForBilling;
a=0;// .super Ljava/lang/Object;
a=0;// .source "HTTPConnectionToolForBilling.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final APPIDDATA_END:Ljava/lang/String; = "</appid>"
a=0;// 
a=0;// .field private static final APPIDDATA_START:Ljava/lang/String; = "<appid>"
a=0;// 
a=0;// .field private static final DEVICEAUTHDATA_END:Ljava/lang/String; = "</deviceAuthorizationCode>"
a=0;// 
a=0;// .field private static final DEVICEAUTHDATA_START:Ljava/lang/String; = "<deviceAuthorizationCode>"
a=0;// 
a=0;// .field private static final DEVICENAMEDATA_END:Ljava/lang/String; = "</deviceName>"
a=0;// 
a=0;// .field private static final DEVICENAMEDATA_START:Ljava/lang/String; = "<deviceName>"
a=0;// 
a=0;// .field private static final HTTPCONNTOOL:Ljava/lang/String; = "HTTPConnectionTool"
a=0;// 
a=0;// .field private static final IMSIDATA_END:Ljava/lang/String; = "</DeviceId>"
a=0;// 
a=0;// .field private static final IMSIDATA_END1:Ljava/lang/String; = "</deviceID>"
a=0;// 
a=0;// .field private static final IMSIDATA_END2:Ljava/lang/String; = "</imsi>"
a=0;// 
a=0;// .field private static final IMSIDATA_START:Ljava/lang/String; = "<DeviceId>"
a=0;// 
a=0;// .field private static final IMSIDATA_START1:Ljava/lang/String; = "<deviceID>"
a=0;// 
a=0;// .field private static final IMSIDATA_START2:Ljava/lang/String; = "<imsi>"
a=0;// 
a=0;// .field private static final MACDATA_END:Ljava/lang/String; = "</mac>"
a=0;// 
a=0;// .field private static final MACDATA_START:Ljava/lang/String; = "<mac>"
a=0;// 
a=0;// .field private static final MOBILEPHONEDATA_END:Ljava/lang/String; = "</mobilePhone>"
a=0;// 
a=0;// .field private static final MOBILEPHONEDATA_START:Ljava/lang/String; = "<mobilePhone>"
a=0;// 
a=0;// .field private static final MODELDATA_END:Ljava/lang/String; = "</MODEL>"
a=0;// 
a=0;// .field private static final MODELDATA_START:Ljava/lang/String; = "<MODEL>"
a=0;// 
a=0;// .field private static final PUBKEYDATA_END:Ljava/lang/String; = "</pubkey>"
a=0;// 
a=0;// .field private static final PUBKEYDATA_START:Ljava/lang/String; = "<pubkey>"
a=0;// 
a=0;// .field private static final SERVLET_POST:Ljava/lang/String; = "POST"
a=0;// 
a=0;// .field private static final SIDDATA_END:Ljava/lang/String; = "</sid>"
a=0;// 
a=0;// .field private static final SIDDATA_START:Ljava/lang/String; = "<sid>"
a=0;// 
a=0;// .field private static final TEMPPUBKEYDATA_END:Ljava/lang/String; = "</tempPubkey>"
a=0;// 
a=0;// .field private static final TEMPPUBKEYDATA_START:Ljava/lang/String; = "<tempPubkey>"
a=0;// 
a=0;// .field private static final VERSIONDATA_END:Ljava/lang/String; = "</VERSION>"
a=0;// 
a=0;// .field private static final VERSIONDATA_START:Ljava/lang/String; = "<VERSION>"
a=0;// 
a=0;// .field private static final XMLLABLE_END:Ljava/lang/String; = "</request>"
a=0;// 
a=0;// .field private static final XMLLABLE_START:Ljava/lang/String; = "<request>"
a=0;// 
a=0;// .field private static final XMLTEMPPUBKEY_END:Ljava/lang/String; = "</dynKeyReq>"
a=0;// 
a=0;// .field private static final XMLTEMPPUBKEY_START:Ljava/lang/String; = "<dynKeyReq>"
a=0;// 
a=0;// .field private static final XMLTitle:Ljava/lang/String; = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private strBuilder:Ljava/lang/StringBuilder;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 13
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/ccit/mmwlan/httpClient/HTTPConnectionToolForBilling;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public ConbinCertApply(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 3
a=0;//     .param p1, "strAppid"    # Ljava/lang/String;
a=0;//     .param p2, "strImei"    # Ljava/lang/String;
a=0;//     .param p3, "strSid"    # Ljava/lang/String;
a=0;//     .param p4, "strPubKey"    # Ljava/lang/String;
a=0;//     .param p5, "strDeviceAuthCode"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 193
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 194
a=0;//     .local v0, "result":Ljava/lang/String;
a=0;//     #v0=(Null);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iput-object v1, p0, Lcom/ccit/mmwlan/httpClient/HTTPConnectionToolForBilling;->strBuilder:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 195
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iput-object v1, p0, Lcom/ccit/mmwlan/httpClient/HTTPConnectionToolForBilling;->strBuilder:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 196
a=0;//     iget-object v1, p0, Lcom/ccit/mmwlan/httpClient/HTTPConnectionToolForBilling;->strBuilder:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     const-string v2, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 198
a=0;//     iget-object v1, p0, Lcom/ccit/mmwlan/httpClient/HTTPConnectionToolForBilling;->strBuilder:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     const-string v2, "<request>"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 199
a=0;//     iget-object v1, p0, Lcom/ccit/mmwlan/httpClient/HTTPConnectionToolForBilling;->strBuilder:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     const-string v2, "<appid>"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 200
a=0;//     const-string v2, "</appid>"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 201
a=0;//     iget-object v1, p0, Lcom/ccit/mmwlan/httpClient/HTTPConnectionToolForBilling;->strBuilder:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     const-string v2, "<DeviceId>"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "</DeviceId>"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 202
a=0;//     iget-object v1, p0, Lcom/ccit/mmwlan/httpClient/HTTPConnectionToolForBilling;->strBuilder:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     const-string v2, "<sid>"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "</sid>"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 203
a=0;//     iget-object v1, p0, Lcom/ccit/mmwlan/httpClient/HTTPConnectionToolForBilling;->strBuilder:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     const-string v2, "<pubkey>"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 204
a=0;//     const-string v2, "</pubkey>"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 205
a=0;//     if-nez p5, :cond_0
a=0;// 
a=0;//     .line 207
a=0;//     iget-object v1, p0, Lcom/ccit/mmwlan/httpClient/HTTPConnectionToolForBilling;->strBuilder:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     const-string v2, "<deviceAuthorizationCode>"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "</deviceAuthorizationCode>"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 213
a=0;//     :goto_0
a=0;//     iget-object v1, p0, Lcom/ccit/mmwlan/httpClient/HTTPConnectionToolForBilling;->strBuilder:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     const-string v2, "</request>"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 215
a=0;//     iget-object v1, p0, Lcom/ccit/mmwlan/httpClient/HTTPConnectionToolForBilling;->strBuilder:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 217
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 210
a=0;//     :cond_0
a=0;//     #v0=(Null);
a=0;//     iget-object v1, p0, Lcom/ccit/mmwlan/httpClient/HTTPConnectionToolForBilling;->strBuilder:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     const-string v2, "<deviceAuthorizationCode>"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 211
a=0;//     const-string v2, "</deviceAuthorizationCode>"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public conbinDynPassword(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 3
a=0;//     .param p1, "strImei"    # Ljava/lang/String;
a=0;//     .param p2, "strAppid"    # Ljava/lang/String;
a=0;//     .param p3, "tempPubKey"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 162
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 163
a=0;//     .local v0, "strResult":Ljava/lang/String;
a=0;//     #v0=(Null);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iput-object v1, p0, Lcom/ccit/mmwlan/httpClient/HTTPConnectionToolForBilling;->strBuilder:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 164
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iput-object v1, p0, Lcom/ccit/mmwlan/httpClient/HTTPConnectionToolForBilling;->strBuilder:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 165
a=0;//     iget-object v1, p0, Lcom/ccit/mmwlan/httpClient/HTTPConnectionToolForBilling;->strBuilder:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     const-string v2, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 167
a=0;//     iget-object v1, p0, Lcom/ccit/mmwlan/httpClient/HTTPConnectionToolForBilling;->strBuilder:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     const-string v2, "<dynKeyReq>"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 168
a=0;//     iget-object v1, p0, Lcom/ccit/mmwlan/httpClient/HTTPConnectionToolForBilling;->strBuilder:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     const-string v2, "<imsi>"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 169
a=0;//     const-string v2, "</imsi>"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 170
a=0;//     iget-object v1, p0, Lcom/ccit/mmwlan/httpClient/HTTPConnectionToolForBilling;->strBuilder:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     const-string v2, "<appid>"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 171
a=0;//     const-string v2, "</appid>"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 172
a=0;//     iget-object v1, p0, Lcom/ccit/mmwlan/httpClient/HTTPConnectionToolForBilling;->strBuilder:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     const-string v2, "<tempPubkey>"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 173
a=0;//     const-string v2, "</tempPubkey>"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 174
a=0;//     iget-object v1, p0, Lcom/ccit/mmwlan/httpClient/HTTPConnectionToolForBilling;->strBuilder:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     const-string v2, "</dynKeyReq>"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 176
a=0;//     iget-object v1, p0, Lcom/ccit/mmwlan/httpClient/HTTPConnectionToolForBilling;->strBuilder:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 178
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public conbinGetDeviceAuth(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 3
a=0;//     .param p1, "appid"    # Ljava/lang/String;
a=0;//     .param p2, "mobilePhone"    # Ljava/lang/String;
a=0;//     .param p3, "deviceID"    # Ljava/lang/String;
a=0;//     .param p4, "mac"    # Ljava/lang/String;
a=0;//     .param p5, "deviceName"    # Ljava/lang/String;
a=0;//     .param p6, "model"    # Ljava/lang/String;
a=0;//     .param p7, "version"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 84
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 85
a=0;//     .local v0, "strResult":Ljava/lang/String;
a=0;//     #v0=(Null);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iput-object v1, p0, Lcom/ccit/mmwlan/httpClient/HTTPConnectionToolForBilling;->strBuilder:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 86
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iput-object v1, p0, Lcom/ccit/mmwlan/httpClient/HTTPConnectionToolForBilling;->strBuilder:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 87
a=0;//     iget-object v1, p0, Lcom/ccit/mmwlan/httpClient/HTTPConnectionToolForBilling;->strBuilder:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     const-string v2, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 89
a=0;//     iget-object v1, p0, Lcom/ccit/mmwlan/httpClient/HTTPConnectionToolForBilling;->strBuilder:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     const-string v2, "<request>"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 90
a=0;//     iget-object v1, p0, Lcom/ccit/mmwlan/httpClient/HTTPConnectionToolForBilling;->strBuilder:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     const-string v2, "<appid>"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "</appid>"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 91
a=0;//     iget-object v1, p0, Lcom/ccit/mmwlan/httpClient/HTTPConnectionToolForBilling;->strBuilder:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     const-string v2, "<mobilePhone>"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 92
a=0;//     const-string v2, "</mobilePhone>"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 93
a=0;//     iget-object v1, p0, Lcom/ccit/mmwlan/httpClient/HTTPConnectionToolForBilling;->strBuilder:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     const-string v2, "<deviceID>"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 94
a=0;//     const-string v2, "</deviceID>"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 95
a=0;//     if-nez p4, :cond_0
a=0;// 
a=0;//     .line 97
a=0;//     iget-object v1, p0, Lcom/ccit/mmwlan/httpClient/HTTPConnectionToolForBilling;->strBuilder:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     const-string v2, "<mac>"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "</mac>"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 102
a=0;//     :goto_0
a=0;//     iget-object v1, p0, Lcom/ccit/mmwlan/httpClient/HTTPConnectionToolForBilling;->strBuilder:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     const-string v2, "<deviceName>"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 103
a=0;//     const-string v2, "</deviceName>"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 104
a=0;//     if-nez p6, :cond_1
a=0;// 
a=0;//     .line 106
a=0;//     iget-object v1, p0, Lcom/ccit/mmwlan/httpClient/HTTPConnectionToolForBilling;->strBuilder:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     const-string v2, "<MODEL>"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "</MODEL>"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 112
a=0;//     :goto_1
a=0;//     if-nez p7, :cond_2
a=0;// 
a=0;//     .line 114
a=0;//     iget-object v1, p0, Lcom/ccit/mmwlan/httpClient/HTTPConnectionToolForBilling;->strBuilder:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     const-string v2, "<VERSION>"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "</VERSION>"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 121
a=0;//     :goto_2
a=0;//     iget-object v1, p0, Lcom/ccit/mmwlan/httpClient/HTTPConnectionToolForBilling;->strBuilder:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     const-string v2, "</request>"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 123
a=0;//     iget-object v1, p0, Lcom/ccit/mmwlan/httpClient/HTTPConnectionToolForBilling;->strBuilder:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 125
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 100
a=0;//     :cond_0
a=0;//     #v0=(Null);
a=0;//     iget-object v1, p0, Lcom/ccit/mmwlan/httpClient/HTTPConnectionToolForBilling;->strBuilder:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     const-string v2, "<mac>"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "</mac>"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 109
a=0;//     :cond_1
a=0;//     iget-object v1, p0, Lcom/ccit/mmwlan/httpClient/HTTPConnectionToolForBilling;->strBuilder:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     const-string v2, "<MODEL>"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 110
a=0;//     const-string v2, "</MODEL>"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 117
a=0;//     :cond_2
a=0;//     iget-object v1, p0, Lcom/ccit/mmwlan/httpClient/HTTPConnectionToolForBilling;->strBuilder:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     const-string v2, "<VERSION>"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 118
a=0;//     const-string v2, "</VERSION>"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method public conbinGetDeviceName(Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 3
a=0;//     .param p1, "strImei"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 136
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 137
a=0;//     .local v0, "strResult":Ljava/lang/String;
a=0;//     #v0=(Null);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iput-object v1, p0, Lcom/ccit/mmwlan/httpClient/HTTPConnectionToolForBilling;->strBuilder:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 138
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iput-object v1, p0, Lcom/ccit/mmwlan/httpClient/HTTPConnectionToolForBilling;->strBuilder:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 139
a=0;//     iget-object v1, p0, Lcom/ccit/mmwlan/httpClient/HTTPConnectionToolForBilling;->strBuilder:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     const-string v2, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 141
a=0;//     iget-object v1, p0, Lcom/ccit/mmwlan/httpClient/HTTPConnectionToolForBilling;->strBuilder:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     const-string v2, "<request>"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 142
a=0;//     iget-object v1, p0, Lcom/ccit/mmwlan/httpClient/HTTPConnectionToolForBilling;->strBuilder:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     const-string v2, "<deviceID>"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 143
a=0;//     const-string v2, "</deviceID>"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 144
a=0;//     iget-object v1, p0, Lcom/ccit/mmwlan/httpClient/HTTPConnectionToolForBilling;->strBuilder:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     const-string v2, "</request>"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 146
a=0;//     iget-object v1, p0, Lcom/ccit/mmwlan/httpClient/HTTPConnectionToolForBilling;->strBuilder:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 148
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public doPost(Ljava/lang/String;[B)[B
a=0;//     .locals 13
a=0;//     .param p1, "urlStr"    # Ljava/lang/String;
a=0;//     .param p2, "byteRequest"    # [B
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/lang/Exception;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 231
a=0;//     array-length v5, p2
a=0;// 
a=0;//     .line 232
a=0;//     .local v5, "messageBodyLen":I
a=0;//     #v5=(Integer);
a=0;//     new-instance v9, Ljava/net/URL;
a=0;// 
a=0;//     #v9=(UninitRef,Ljava/net/URL;);
a=0;//     invoke-direct {v9, p1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 235
a=0;//     .local v9, "url":Ljava/net/URL;
a=0;//     #v9=(Reference,Ljava/net/URL;);
a=0;//     const-string v10, "HTTPConnectionTool"
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     new-instance v11, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v11=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v12, "doPost() url -> "
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v9}, Ljava/net/URL;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     invoke-static {v10, v11}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 238
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 239
a=0;//     .local v1, "conn":Ljava/net/HttpURLConnection;
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v9}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .end local v1    # "conn":Ljava/net/HttpURLConnection;
a=0;//     #v1=(Reference,Ljava/net/URLConnection;);
a=0;//     check-cast v1, Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     .line 241
a=0;//     .restart local v1    # "conn":Ljava/net/HttpURLConnection;
a=0;//     const-string v10, "POST"
a=0;// 
a=0;//     invoke-virtual {v1, v10}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 242
a=0;//     const-string v10, "Connection"
a=0;// 
a=0;//     const-string v11, "close"
a=0;// 
a=0;//     invoke-virtual {v1, v10, v11}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 243
a=0;//     const-string v10, "Charset"
a=0;// 
a=0;//     const-string v11, "UTF-8"
a=0;// 
a=0;//     invoke-virtual {v1, v10, v11}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 244
a=0;//     const-string v10, "Content-Type"
a=0;// 
a=0;//     const-string v11, "text/xml"
a=0;// 
a=0;//     invoke-virtual {v1, v10, v11}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 245
a=0;//     const-string v10, "Content-length"
a=0;// 
a=0;//     .line 246
a=0;//     invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     .line 245
a=0;//     invoke-virtual {v1, v10, v11}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 247
a=0;//     const/16 v10, 0x1f40
a=0;// 
a=0;//     #v10=(PosShort);
a=0;//     invoke-virtual {v1, v10}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V
a=0;// 
a=0;//     .line 248
a=0;//     const/16 v10, 0x1f40
a=0;// 
a=0;//     invoke-virtual {v1, v10}, Ljava/net/HttpURLConnection;->setReadTimeout(I)V
a=0;// 
a=0;//     .line 250
a=0;//     const/4 v10, 0x1
a=0;// 
a=0;//     #v10=(One);
a=0;//     invoke-virtual {v1, v10}, Ljava/net/HttpURLConnection;->setDoInput(Z)V
a=0;// 
a=0;//     .line 251
a=0;//     const/4 v10, 0x1
a=0;// 
a=0;//     invoke-virtual {v1, v10}, Ljava/net/HttpURLConnection;->setDoOutput(Z)V
a=0;// 
a=0;//     .line 252
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     #v10=(Null);
a=0;//     invoke-virtual {v1, v10}, Ljava/net/HttpURLConnection;->setUseCaches(Z)V
a=0;// 
a=0;//     .line 253
a=0;//     invoke-virtual {v1}, Ljava/net/HttpURLConnection;->getOutputStream()Ljava/io/OutputStream;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 255
a=0;//     .local v6, "os":Ljava/io/OutputStream;
a=0;//     #v6=(Reference,Ljava/io/OutputStream;);
a=0;//     invoke-virtual {v6, p2}, Ljava/io/OutputStream;->write([B)V
a=0;// 
a=0;//     .line 256
a=0;//     invoke-virtual {v6}, Ljava/io/OutputStream;->flush()V
a=0;// 
a=0;//     .line 257
a=0;//     invoke-virtual {v6}, Ljava/io/OutputStream;->close()V
a=0;// 
a=0;//     .line 259
a=0;//     new-instance v3, Ljava/io/DataInputStream;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/io/DataInputStream;);
a=0;//     invoke-virtual {v1}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     #v10=(Reference,Ljava/io/InputStream;);
a=0;//     invoke-direct {v3, v10}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V
a=0;// 
a=0;//     .line 260
a=0;//     .local v3, "input":Ljava/io/DataInputStream;
a=0;//     #v3=(Reference,Ljava/io/DataInputStream;);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     check-cast v8, [B
a=0;// 
a=0;//     .line 261
a=0;//     .local v8, "rResult":[B
a=0;//     #v8=(Reference,[B);
a=0;//     new-instance v7, Ljava/io/ByteArrayOutputStream;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/io/ByteArrayOutputStream;);
a=0;//     invoke-direct {v7}, Ljava/io/ByteArrayOutputStream;-><init>()V
a=0;// 
a=0;//     .line 262
a=0;//     .local v7, "out":Ljava/io/ByteArrayOutputStream;
a=0;//     #v7=(Reference,Ljava/io/ByteArrayOutputStream;);
a=0;//     const/16 v10, 0x1770
a=0;// 
a=0;//     #v10=(PosShort);
a=0;//     new-array v0, v10, [B
a=0;// 
a=0;//     .line 263
a=0;//     .local v0, "bufferByte":[B
a=0;//     #v0=(Reference,[B);
a=0;//     const/4 v4, -0x1
a=0;// 
a=0;//     .line 264
a=0;//     .local v4, "l":I
a=0;//     #v4=(Byte);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 265
a=0;//     .local v2, "downloadSize":I
a=0;//     :goto_0
a=0;//     #v2=(Integer);v4=(Integer);
a=0;//     invoke-virtual {v3, v0}, Ljava/io/DataInputStream;->read([B)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     const/4 v10, -0x1
a=0;// 
a=0;//     #v10=(Byte);
a=0;//     if-gt v4, v10, :cond_0
a=0;// 
a=0;//     .line 270
a=0;//     invoke-virtual {v7}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 272
a=0;//     return-object v8
a=0;// 
a=0;//     .line 266
a=0;//     :cond_0
a=0;//     add-int/2addr v2, v4
a=0;// 
a=0;//     .line 267
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     #v10=(Null);
a=0;//     invoke-virtual {v7, v0, v10, v4}, Ljava/io/ByteArrayOutputStream;->write([BII)V
a=0;// 
a=0;//     .line 268
a=0;//     invoke-virtual {v7}, Ljava/io/ByteArrayOutputStream;->flush()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
